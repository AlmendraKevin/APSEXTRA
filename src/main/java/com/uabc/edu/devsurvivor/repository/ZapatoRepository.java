package com.uabc.edu.devsurvivor.repository;

import com.uabc.edu.devsurvivor.model.Zapato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZapatoRepository extends CrudRepository<Zapato,Long> {
}
