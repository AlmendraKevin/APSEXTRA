package com.uabc.edu.devsurvivor.util;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.uabc.edu.devsurvivor.model.Venta;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Component("/reporte")
public class ListarVentadPDF extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pdfWriter, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        List<Venta> venta = (List<Venta>) map.get("ventas");
        document.setPageSize(PageSize.LETTER.rotate());
        document.open();

        PdfPTable tablaTitulo = new PdfPTable(1);
        PdfPCell celda = null;
        celda = new PdfPCell((new Phrase("Reporte General de Ventas")));
        tablaTitulo.addCell(celda);
        tablaTitulo.setSpacingAfter(20);
        PdfPTable tablaVentas = new PdfPTable(6);
        venta.forEach(ventas ->{
            tablaVentas.addCell(String.valueOf(ventas.getIdVenta()));
            tablaVentas.addCell(String.valueOf(ventas.getFacturaVenta()));
            tablaVentas.addCell(ventas.getRealizoVenta());
            tablaVentas.addCell(ventas.getConceptoVenta());
            tablaVentas.addCell(ventas.getTotalVents());
            tablaVentas.addCell(String.valueOf(ventas.getFechaVenta()));
        });
        document.add(tablaTitulo);
        document.add(tablaVentas);

    }
}
