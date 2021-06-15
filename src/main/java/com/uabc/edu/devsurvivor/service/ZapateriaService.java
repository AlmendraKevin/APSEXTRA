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

    public List<Zapato> getShoes(){return (List<Zapato>) repository.findAll();}

    public Zapato getShoesById(Long id){
        Optional<Zapato> shoe = repository.findById(id);
        if (shoe.isPresent()){
            return repository.findById(id).get();
        }
        return shoe.get();
    }
    


}
