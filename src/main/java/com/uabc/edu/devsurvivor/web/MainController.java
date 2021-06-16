package com.uabc.edu.devsurvivor.web;

import com.uabc.edu.devsurvivor.model.Zapato;
import com.uabc.edu.devsurvivor.service.ZapateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private ZapateriaService service;

    @RequestMapping
    public String home() {
        return "home";
    }

    @RequestMapping("/catalogo")
    public String catalogo(Model model) {
        List<Zapato> shoe = service.getShoes();
        model.addAttribute("shoe", shoe);
        return "catalogo";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
