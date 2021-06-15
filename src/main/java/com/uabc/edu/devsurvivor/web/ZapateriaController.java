package com.uabc.edu.devsurvivor.web;

import com.uabc.edu.devsurvivor.model.Zapato;
import com.uabc.edu.devsurvivor.service.ZapateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class ZapateriaController {

    @Autowired
    private ZapateriaService service;

    @RequestMapping
    public String getShoes(Model model){
        List<Zapato> shoe = service.getShoes();
        model.addAttribute("shoe",shoe);
        return "catalogo";
    }

    @RequestMapping("/new")
    public String getNewShoe(Model model){
        model.addAttribute("zapato",new Zapato());
        return "altaZapato";
    }

    @RequestMapping(path = {"/update/{id}"})
    public String editUpdateShoeById(Model model, @PathVariable(value = "id",required = true) Long id){
        Zapato zapato = service.getShoesById(id);
        model.addAttribute("shoe",zapato);
        return "modificar";
    }

    @GetMapping("/delete/{id}")
    public String deleteShoe(@PathVariable("id") Long id){
        service.deleteShoe(id);
        return "redirect:/admin";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String saveOrUpdateShoe(@RequestParam(value = "idZapato",required = false )Optional<Long> id,
                                   @RequestParam(value = "modeloZapato",required = true)String modelo,
                                   @RequestParam(value = "colorZapato",required = true )String color,
                                   @RequestParam(value = "tallaZapato",required = true )String talla,
                                   @RequestParam(value = "existenciaZapato",required = true )String existencia,
                                   @RequestParam(value = "costoZapato",required = true )String costo,
                                   @RequestParam(value = "ubicacionZapato",required = true )String ubicacion,
                                   @RequestParam(value = "img",required = false )MultipartFile img){
        Zapato entity;

        if (id.isPresent()){
            entity = service.getShoesById(id.get());
        }else{
            entity = new Zapato();

        }
        entity.setModeloZapato(modelo);
        entity.setColorZapato(color);
        entity.setTallaZapato(talla);
        entity.setExistenciaZapato(existencia);
        entity.setCostoZapato(costo);
        entity.setUbicacionZapato(ubicacion);

        try {
            entity.setImg(img.getBytes());
        }catch (Exception e){
            System.out.println("Fallo la conversion" + e);
        }
        entity.setStr(Base64.getEncoder().encodeToString(entity.getImg()));
        service.saveShoe(entity);
        return "redirect:/admin";

    }

}
