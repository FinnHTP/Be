package com.project.backend.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.*;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.*;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;

import java.io.IOException;
import java.time.LocalDate;

@RestController
public class BillController {
    @GetMapping("/api/bill/{orderId}")
    public void generateInvoice(@PathVariable Long orderId, HttpServletResponse response) {
        try {
            // Tạo file PDF
            PdfWriter writer = new PdfWriter(response.getOutputStream());
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc, PageSize.A4);
            document.setMargins(20, 20, 20, 20);

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
            cell1.add(new Paragraph("Invoice Number\n #00000" + orderId)
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
            billToCell.add(new Paragraph("Bee Gaming Studios\n505-644-5504\nhphat1078@email.com\n214/2 Bui Dinh Tuy Ward 12 Binh Thanh District Ho Chi Minh city")
                    .setFontSize(12)
                    .setFontColor(grayColor));
            billToCell.setBorder(Border.NO_BORDER);

            Cell royaltyCell = new Cell();
            royaltyCell.add(new Paragraph("Customer")
                    .setBold()
                    .setFontSize(14));
            royaltyCell.add(new Paragraph("Huynh Tan Phat\n0901631519\nmoeietls80@email.com\n16A/B4 Ha Thi Khiem Ward 10 District 12 Ho Chi Minh city")
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
            table.addCell(new Cell().add(new Paragraph("World of Goo 2").setFontSize(12)).setBorder(null));
            table.addCell(new Cell().add(new Paragraph("313.000đ").setFontSize(12)).setBorder(null));
            table.addCell(new Cell().add(new Paragraph("15%").setFontSize(12)).setBorder(null));
            table.addCell(new Cell().add(new Paragraph("266.050đ").setFontSize(12)).setBorder(null));

            document.add(table);



            // Thêm phần "Thanks for business"
            Paragraph thanksParagraph = new Paragraph("Thanks for business!")
                    .setFontSize(14)
                    .setBold()
                    .setTextAlignment(TextAlignment.RIGHT);
            document.add(thanksParagraph);
            Image qr = new Image(ImageDataFactory.create("src/main/resources/qr.png"));
            qr.setWidth(80);
            qr.setHeight(80);
            qr.setTextAlignment(TextAlignment.RIGHT);
            document.add(qr);
            // Đóng tài liệu
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
