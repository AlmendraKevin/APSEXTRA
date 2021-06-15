package com.uabc.edu.devsurvivor.web;

import com.uabc.edu.devsurvivor.model.Zapato;
import com.uabc.edu.devsurvivor.service.ZapateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ZapateriaController {

    @Autowired
    private ZapateriaService service;

    @RequestMapping("/new")
    public String getNewShoe(Model model){
        model.addAttribute("zapato",new Zapato());
        return "altaZapato";
    }


}
