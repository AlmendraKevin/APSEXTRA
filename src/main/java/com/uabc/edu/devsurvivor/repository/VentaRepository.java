package com.uabc.edu.devsurvivor.repository;

import com.uabc.edu.devsurvivor.model.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VentaRepository extends CrudRepository<Venta,Long> {
}
