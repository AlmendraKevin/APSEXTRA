package com.uabc.edu.devsurvivor.web;

import com.uabc.edu.devsurvivor.model.Venta;
import com.uabc.edu.devsurvivor.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/reporte")
public class ReporteController {

    @Autowired
    private VentaService service;

    @RequestMapping
    public  String getVentas(Model model){
        List<Venta> venta = service.getVentas();
        model.addAttribute("ventas",venta);
        return "/reporte";
    }

}
