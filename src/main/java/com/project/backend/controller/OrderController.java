package com.project.backend.controller;


import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.project.backend.controller.OrderController.CreateOrderRequest;
import com.project.backend.dto.OrderDto;
import com.project.backend.entity.Account;
import com.project.backend.entity.Game;
import com.project.backend.entity.Order;
import com.project.backend.entity.User;
import com.project.backend.mapper.AccountMapper;
import com.project.backend.mapper.GameMapper;
import com.project.backend.mapper.UserMapper;
import com.project.backend.repository.AccountRepository;
import com.project.backend.repository.GameRepository;
import com.project.backend.service.AccountService;
import com.project.backend.service.GameService;
import com.project.backend.service.OrderService;
import com.project.backend.service.UserService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/orders")
@SecurityRequirement(name = "bearerAuth")
public class OrderController {
    @Autowired
    private OrderService service;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private GameRepository gameRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private GameService gameService;
	@Autowired
	private AccountService accountService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody CreateOrderRequest request) {
        try {
            Order createdOrder = service.createOrder(request.getAccountId(), request.gameId, request.price);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("{id}")
    public ResponseEntity<OrderDto> getkeycodeById(@PathVariable("id") Long orderId){
        OrderDto Dto = service.getOrderById(orderId);
        return ResponseEntity.ok(Dto);
    }
    @GetMapping
    public ResponseEntity<List<OrderDto>> getAllOrder(){
        List<OrderDto> orderDtos = service.getAllOrders();
        return ResponseEntity.ok(orderDtos);
    }
    @GetMapping("/list/{id}")
    public ResponseEntity<List<OrderDto>> getListOrderById(@PathVariable("id") Long accountId){
        List<OrderDto> orders = service.GetAllOrderById(accountId);
        return ResponseEntity.ok(orders);
    }
    @PutMapping("{id}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable("id") Long orderId, @RequestBody OrderDto dto){
        OrderDto orderDto = service.UpdateOrder(orderId , dto);
        return ResponseEntity.ok(orderDto);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable("id") Long orderId){
        service.deleteOrder(orderId);
        return ResponseEntity.ok("Order deleted Successfully");
    }
    
//    @GetMapping("/data{year}")
//    public ResponseEntity<List<Object[]>> getChartdata(@PathVariable ("year") int year)
//    {
//    	List<Object[]> orders = service.getMonthlyStatistics(year);
//        return new ResponseEntity<>(orders , HttpStatus.CREATED);
//    }
    
    @GetMapping("/data{year}")
    public ResponseEntity<Map<String, Double>> getChartdata(@PathVariable ("year") int year) {
        Map<String, Double> orders = service.getMonthlyStatistics(year);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
    
    @PostMapping("/export")
    public void generateInvoice(@RequestBody CreateOrderRequest request, HttpServletResponse response) {
        try {
            // Tạo file PDF
            PdfWriter writer = new PdfWriter(response.getOutputStream());
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc, PageSize.A5);
            document.setMargins(20, 20, 20, 20);
            if (request.getAccountId() == null || request.getGameId() == null) {
                throw new IllegalArgumentException("Account ID and Game ID must not be null");
            }

            User user = UserMapper.MapToUser(userService.getUserById(request.getAccountId()));
            Account account = AccountMapper.MapToAccount(accountService.getAccountById(request.getAccountId()));
            Game game = GameMapper.mapToGame(gameService.getGameById(request.getGameId()));
            Integer coupon = (game.getCoupon() != null) ? game.getCoupon().getValue() : 0;

            // Tạo màu sắc cho hóa đơn
            Color purpleColor = new DeviceRgb(75, 0, 130);
            Color grayColor = new DeviceRgb(128, 128, 128);

            // Chèn logo
            Image logo = new Image(ImageDataFactory.create("src/main/resources/R.png"));
            logo.setWidth(100);
            logo.setHeight(50);
            document.add(logo);

            // Tiêu đề hóa đơn
            Paragraph invoiceTitle = new Paragraph("INVOICE")
                    .setFontSize(30)
                    .setBold()
                    .setFontColor(purpleColor)
                    .setTextAlignment(TextAlignment.RIGHT);
            document.add(invoiceTitle);

            // Thông tin hóa đơn
            float[] columnWidths = {1, 1};
            Table infoTable = new Table(columnWidths);
            infoTable.setWidth(UnitValue.createPercentValue(100));

            Cell cell1 = new Cell();
            cell1.add(new Paragraph("Invoice Number\n #00000" + 1)
                    .setFontSize(12)
                    .setFontColor(grayColor));
            cell1.setBorder(Border.NO_BORDER);

            Cell cell2 = new Cell();
            cell2.add(new Paragraph("Date\n" + LocalDate.now())
                    .setFontSize(12)
                    .setFontColor(grayColor));
            cell2.setBorder(Border.NO_BORDER);
            cell2.setTextAlignment(TextAlignment.RIGHT);

            infoTable.addCell(cell1);
            infoTable.addCell(cell2);
            document.add(infoTable);

            // Thêm dòng kẻ ngang
//            document.add(new LineSeparator());

            // Chi tiết hóa đơn (Bill To và Royalty Recipient)
            float[] columnDetailWidths = {1, 1};
            Table detailTable = new Table(columnDetailWidths);
            detailTable.setWidth(UnitValue.createPercentValue(100));

            Cell billToCell = new Cell();
            billToCell.add(new Paragraph("Bill To")
                    .setBold()
                    .setFontSize(14));
            billToCell.add(new Paragraph("Bee Gaming Studios\n505-644-5504\nhphat1078@email.com\n16A/B4 Ha Thi Khiem Ward 10 District 12 Ho Chi Minh city")
                    .setFontSize(12)
                    .setFontColor(grayColor));
            billToCell.setBorder(Border.NO_BORDER);

            Cell royaltyCell = new Cell();
            royaltyCell.add(new Paragraph("Customer")
                    .setBold()
                    .setFontSize(14));
            royaltyCell.add(new Paragraph(user.getFirstName() + " " + user.getLastName() + "\n " + user.getSdt() + "\n"+ account.getEmail() +"\n" + user.getAddress())
                    .setFontSize(12)
                    .setFontColor(grayColor));
            royaltyCell.setBorder(Border.NO_BORDER);

            detailTable.addCell(billToCell);
            detailTable.addCell(royaltyCell);
            document.add(detailTable);

            float[] columnTWidths = {2, 1, 1, 1};
            Table table = new Table(columnTWidths);
            table.setWidth(UnitValue.createPercentValue(100));
            table.setMarginTop(10);
            Color whiteColor = new DeviceRgb(255, 255, 255);

            // Header của bảng
            for (String header : new String[]{"Game", "Unit Sold", "Coupon", "Total"}) {
                Cell cell = new Cell()
                    .add(new Paragraph(header)
                    .setBold()
                    .setBackgroundColor(purpleColor)
                    .setFontColor(whiteColor))
                    .setBorder(null) // No border
                    .setMarginLeft(-10)
                    .setPadding(5); // Adjust padding as needed
                table.addHeaderCell(cell);
            }

            // Dữ liệu của bảng
            Double totalPrice = game.getPriceGame() * (100 - coupon)/100;
            table.addCell(new Cell().add(new Paragraph(game.getName()).setFontSize(12)).setBorder(null));
            table.addCell(new Cell().add(new Paragraph(game.getPriceGame()+"").setFontSize(12)).setBorder(null));
            table.addCell(new Cell().add(new Paragraph(coupon +"%").setFontSize(12)).setBorder(null));
            table.addCell(new Cell().add(new Paragraph(totalPrice+"").setFontSize(12)).setBorder(null));

            document.add(table);



            // Thêm phần "Thanks for business"
            Paragraph thanksParagraph = new Paragraph("Thanks for business!")
                    .setFontSize(14)
                    .setBold()
                    .setMarginTop(20)
                    .setTextAlignment(TextAlignment.CENTER);
            document.add(thanksParagraph);
            Image qr = new Image(ImageDataFactory.create("src/main/resources/qr.png"));
            qr.setWidth(80);
            qr.setHeight(80);
            qr.setMarginLeft(150);
            document.add(qr);
            // Đóng tài liệu
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }

    }
    
    
    public static class CreateOrderRequest {
        private Long accountId;
        private Long gameId;
        private Double price;

        public Long getAccountId() {
            return accountId;
        }

        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        public Long getGameId() {
            return gameId;
        }

        public void setGameId(Long gameId) {
            this.gameId = gameId;
        }
        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

}
