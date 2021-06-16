package com.uabc.edu.devsurvivor.web;

import com.uabc.edu.devsurvivor.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService service;
    
}
