package com.project.backend.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;

import java.io.IOException;

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
            Table infoTable = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
            infoTable.setWidth(UnitValue.createPercentValue(100));

            Cell cell1 = new Cell();
            cell1.add(new Paragraph("Invoice Number\nCATER-2023-001")
                    .setFontSize(12)
                    .setFontColor(grayColor));
            cell1.setBorder(Border.NO_BORDER);

            Cell cell2 = new Cell();
            cell2.add(new Paragraph("Date\nSeptember 7, 2028")
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
            Table detailTable = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
            detailTable.setWidth(UnitValue.createPercentValue(100));

            Cell billToCell = new Cell();
            billToCell.add(new Paragraph("Bill To")
                    .setBold()
                    .setFontSize(14));
            billToCell.add(new Paragraph("XYZ Gaming Studios\n505-644-5504\nxyzgaming@email.com\n3191 Florence Street Athens, TX 75751")
                    .setFontSize(12)
                    .setFontColor(grayColor));
            billToCell.setBorder(Border.NO_BORDER);

            Cell royaltyCell = new Cell();
            royaltyCell.add(new Paragraph("Royalty Recipient")
                    .setBold()
                    .setFontSize(14));
            royaltyCell.add(new Paragraph("GameSoundtracks LLC\n725-320-2997\nxyzgaming@email.com\n3877 Clinton Street Portland, OR 97204")
                    .setFontSize(12)
                    .setFontColor(grayColor));
            royaltyCell.setBorder(Border.NO_BORDER);

            detailTable.addCell(billToCell);
            detailTable.addCell(royaltyCell);
            document.add(detailTable);

            // Thêm bảng chi tiết thanh toán
            float[] columnWidths = {2, 1, 1, 1};
            Table table = new Table(columnWidths);
            table.setWidth(UnitValue.createPercentValue(100));
            table.setMarginTop(10);
            Color whiteColor = new DeviceRgb(255, 255, 255);
            // Header của bảng
            table.addHeaderCell(new Cell().add(new Paragraph("Royalty Details")
                    .setBold()
                    .setBackgroundColor(purpleColor)
                    .setFontColor(whiteColor)));
            table.addHeaderCell(new Cell().add(new Paragraph("Unit Sold")
                    .setBold()
                    .setBackgroundColor(purpleColor)
                    .setFontColor(whiteColor)));
            table.addHeaderCell(new Cell().add(new Paragraph("Royalty Rate")
                    .setBold()
                    .setBackgroundColor(purpleColor)
                    .setFontColor(whiteColor)));
            table.addHeaderCell(new Cell().add(new Paragraph("Total")
                    .setBold()
                    .setBackgroundColor(purpleColor)
                    .setFontColor(whiteColor)));

            // Dữ liệu của bảng
            table.addCell(new Cell().add(new Paragraph("Digital Downloads").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("50,000").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("10%").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("$5,000.00").setFontSize(12)));

            table.addCell(new Cell().add(new Paragraph("Physical Copies").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("20,000").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("8%").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("$1,600.00").setFontSize(12)));

            table.addCell(new Cell().add(new Paragraph("In-Game Purchases").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("100,000").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("5%").setFontSize(12)));
            table.addCell(new Cell().add(new Paragraph("$5,000.00").setFontSize(12)));

            document.add(table);

            // Thêm phần "Thanks for business"
            Paragraph thanksParagraph = new Paragraph("Thanks for business!")
                    .setFontSize(14)
                    .setBold()
                    .setTextAlignment(TextAlignment.RIGHT);
            document.add(thanksParagraph);

            // Đóng tài liệu
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
