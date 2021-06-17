package com.uabc.edu.devsurvivor.service;

import com.uabc.edu.devsurvivor.model.Venta;
import com.uabc.edu.devsurvivor.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    VentaRepository repository;

    public List<Venta> getVentas() {
        return (List<Venta>) repository.findAll();
    }

    public Venta getVentasById(Long id) {
        Optional<Venta> venta = repository.findById(id);
        if (venta.isPresent()) {
            return repository.findById(id).get();
        }
        return venta.get();
    }

    public Venta saveVenta(Venta v) {
        if (v.getIdVenta() == null) {
            v = repository.save(v);
            return v;
        } else {
            Optional<Venta> venta = repository.findById(v.getIdVenta());
            if (venta.isPresent()) {
                Venta newVenta = venta.get();
                newVenta.setIdVenta(v.getIdVenta());
                newVenta.setFacturaVenta(v.getFacturaVenta());
                newVenta.setRealizoVenta(v.getRealizoVenta());
                newVenta.setConceptoVenta(v.getConceptoVenta());
                newVenta.setTotalVents(v.getTotalVents());
                newVenta.setFechaVenta(v.getFechaVenta());
                newVenta = repository.save(newVenta);
                return newVenta;
            } else {
                v = repository.save(v);
                return v;
            }
        }
    }

    public void deleteVenta(Long id) {
        Optional<Venta> venta = repository.findById(id);
        if (venta.isPresent()) {
            repository.deleteById(id);
        }
    }
}
