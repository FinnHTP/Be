package com.project.backend.controller;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class BillController {
	@GetMapping("/api/bill/{orderId}")
	public void generateInvoice(@PathVariable Long orderId, HttpServletResponse response) {
	    try {
	        // Thiết lập kiểu content của response là PDF
	        response.setContentType("application/pdf");
	        response.setHeader("Content-Disposition", "attachment; filename=invoice.pdf");

	        // Tạo một document PDF mới
	        Document document = new Document();
	        PdfWriter.getInstance(document, response.getOutputStream());

	        document.open();

	        // Sử dụng phông chữ Arial Unicode MS để hỗ trợ tốt hơn cho các ký tự đặc biệt và tiếng Việt
	        BaseFont baseFont = BaseFont.createFont("fonts/ArialUnicodeMS.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
	        Font titleFont = new Font(baseFont, 20, Font.BOLD);
	        Font infoFont = new Font(baseFont, 12, Font.NORMAL);

	        // Thêm tiêu đề hoá đơn bằng tiếng Anh
	        Paragraph title = new Paragraph("INVOICE", titleFont);
	        title.setAlignment(Element.ALIGN_CENTER);
	        document.add(title);

	        // Thêm khoảng cách
	        document.add(new Paragraph(" "));

	        // Thêm thông tin đơn hàng bằng tiếng Anh
	        document.add(new Paragraph("Order ID: #" + orderId, infoFont));
	        document.add(new Paragraph("Date: " + java.time.LocalDate.now(), infoFont));

	        // Thêm khoảng cách
	        document.add(new Paragraph(" "));

	        // Tạo bảng chi tiết hóa đơn
	        PdfPTable table = new PdfPTable(4);
	        table.setWidthPercentage(100);
	        table.setSpacingBefore(10f);
	        table.setSpacingAfter(10f);

	        // Định nghĩa các cột của bảng
	        String[] headers = {"Item", "Quantity", "Unit Price", "Total"};
	        for (String header : headers) {
	            PdfPCell cell = new PdfPCell(new Phrase(header, new Font(baseFont, 12, Font.BOLD)));
	            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	            table.addCell(cell);
	        }

	        // Thêm dữ liệu giả vào bảng (thay thế bằng dữ liệu thực tế của bạn)
	        table.addCell(new Phrase("Product A", infoFont));
	        table.addCell(new Phrase("2", infoFont));
	        table.addCell(new Phrase("100,000 VND", infoFont));
	        table.addCell(new Phrase("200,000 VND", infoFont));

	        table.addCell(new Phrase("Product B", infoFont));
	        table.addCell(new Phrase("1", infoFont));
	        table.addCell(new Phrase("150,000 VND", infoFont));
	        table.addCell(new Phrase("150,000 VND", infoFont));

	        // Thêm tổng cộng
	        PdfPCell totalCell = new PdfPCell(new Phrase("Total", new Font(baseFont, 12, Font.BOLD)));
	        totalCell.setColspan(3);
	        totalCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	        table.addCell(totalCell);
	        table.addCell(new Phrase("350,000 VND", infoFont));

	        // Thêm bảng vào tài liệu
	        document.add(table);

	        // Đóng tài liệu
	        document.close();

	    } catch (DocumentException | IOException e) {
	        e.printStackTrace();
	        // Xử lý lỗi nếu cần thiết
	    }
	}
}
