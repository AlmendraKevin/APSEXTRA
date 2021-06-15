package com.uabc.edu.devsurvivor.web;

import com.uabc.edu.devsurvivor.service.ZapateriaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    private ZapateriaService service;

    @RequestMapping
    public String home(){return "home";}

    @RequestMapping("/login")
    public String login(){return "login";}

}
