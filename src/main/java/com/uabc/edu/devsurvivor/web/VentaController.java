package com.uabc.edu.devsurvivor.web;

import com.uabc.edu.devsurvivor.model.Venta;
import com.uabc.edu.devsurvivor.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService service;

    @RequestMapping("/new")
    public String getNewVenta(Model model){
        model.addAttribute("venta",new Venta());
        return "venta";
    }
    @RequestMapping("/vender")
    public String venderZapato(Model model){
        List<Venta> ventaList = service.getVentas();
        Venta venta = ventaList.get(ventaList.size()-1);
        venta.setFacturaVenta(venta.getFacturaVenta()+1);
        model.addAttribute("venta",venta);
        return "venta";
    }
    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public String saveVenta(@RequestParam(value = "idVenta",required = false)Optional<Long> id,
                            @RequestParam(value = "facturaVenta",required = true)Integer factura,
                            @RequestParam(value = "realizoVenta",required = true)String realizo,
                            @RequestParam(value = "conceptoVenta",required = true)String concepto,
                            @RequestParam(value = "totalVents",required = true)String total) throws ParseException {

        Venta entity;

        if(id.isPresent()){
            entity = service.getVentasById(id.get());
        }else{
            entity = new Venta();
        }
        entity.setFacturaVenta(factura);
        entity.setRealizoVenta(realizo);
        entity.setConceptoVenta(concepto);
        entity.setTotalVents(total);
        Calendar calendario = GregorianCalendar.getInstance();
        Date fecha = calendario.getTime();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        entity.setFechaVenta(formatDate.parse(formatDate.format(fecha)));
        service.saveVenta(entity);
        return "redirect:/ventas/vender";
    }
    
}
