package com.project.backend.paypal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import com.project.backend.dto.AccountDto;
import com.project.backend.entity.Account;
import com.project.backend.mapper.AccountMapper;
import com.project.backend.repository.AccountRepository;
import com.project.backend.service.AccountService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/paypal/")
public class PaypalController {

    private final PaypalService paypalService;
    private final AccountRepository accountRepository;
    private final AccountService accountService;

    @PostMapping("payment/create")
    public String createPayment(
            @RequestParam("accountId") Long accountId,
            @RequestParam("method") String method,
            @RequestParam("amount") String amount,
            @RequestParam("currency") String currency,
            @RequestParam("description") String description
    ) {
        try {
            String cancelUrl = "https://websitegamemanagement.vercel.app/payment/404";
            String successUrl = "https://websitegamemanagement.vercel.app/payment/profile";
            Payment payment = paypalService.createPayment(
                    Double.valueOf(amount),
                    currency,
                    method,
                    "sale",
                    description,
                    cancelUrl,
                    successUrl
            );
            Account account = accountRepository.findById(accountId).orElseThrow(() -> new RuntimeException("Account not found"));;
            Double amountValue = Double.parseDouble(amount);
            Double accountBalance = account.getAccountBalance();
            Double totalMoney = accountBalance + amountValue;
            account.setAccountBalance(totalMoney);
            AccountDto accountDto = AccountMapper.MapToAccountDto(account);
            accountService.updateAccountBalance(accountId, accountDto);
            for (Links links : payment.getLinks()) {
                if (links.getRel().equals("approval_url")) {
                    return links.getHref(); // Trả về URL của PayPal để frontend xử lý
                }
            }
        } catch (PayPalRESTException e) {
            log.error("Error occurred:: ", e);
        }
        return "error"; // Trả về thông báo lỗi nếu có sự cố
    }

    @GetMapping("payment/success")
    public String paymentSuccess(
            @RequestParam String amount,
            @RequestParam Long accountId,
            @RequestParam("paymentId") String paymentId,
            @RequestParam("PayerID") String payerId
    ) {
        try {
            Payment payment = paypalService.executePayment(paymentId, payerId);
            
                    
            if (payment.getState().equals("approved")) {
                return "Payment success";
            }
        } catch (PayPalRESTException e) {
            log.error("Error occurred:: ", e);
        }
        return "Payment not approved";
    }

    @GetMapping("payment/cancel")
    public String paymentCancel() {
        return "Payment cancelled";
    }

    @GetMapping("payment/error")
    public String paymentError() {
        return "Payment error";
    }
}
