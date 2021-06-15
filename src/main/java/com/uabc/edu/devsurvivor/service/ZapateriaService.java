package com.uabc.edu.devsurvivor.service;

import com.uabc.edu.devsurvivor.model.Zapato;
import com.uabc.edu.devsurvivor.repository.ZapatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZapateriaService {

    @Autowired
    ZapatoRepository repository;

    public List<Zapato> getShoes() {
        return (List<Zapato>) repository.findAll();
    }

    public Zapato getShoesById(Long id) {
        Optional<Zapato> shoe = repository.findById(id);
        if (shoe.isPresent()) {
            return repository.findById(id).get();
        }
        return shoe.get();
    }

    public Zapato saveShoe(Zapato z) {
        if (z.getIdZapato() == 0L) {
            z = repository.save(z);
            return z;
        } else {
            Optional<Zapato> shoe = repository.findById(z.getIdZapato());
            if (shoe.isPresent()) {
                Zapato newShoe = shoe.get();
                newShoe.setIdZapato(z.getIdZapato());
                newShoe.setModeloZapato(z.getModeloZapato());
                newShoe.setColorZapato(z.getColorZapato());
                newShoe.setTallaZapato(z.getTallaZapato());
                newShoe.setExistenciaZapato(z.getExistenciaZapato());
                newShoe.setCostoZapato(z.getCostoZapato());
                newShoe.setUbicacionZapato(z.getUbicacionZapato());
                newShoe.setImg(z.getImg());
                newShoe = repository.save(newShoe);
                return newShoe;
            } else {
                z = repository.save(z);
                return z;
            }
        }
    }

    public void deleteShoe(Long id) {
        Optional<Zapato> zapato = repository.findById(id);
        if (zapato.isPresent()) {
            repository.deleteById(id);
        }
    }

}
