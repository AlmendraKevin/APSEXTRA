package com.uabc.edu.devsurvivor.repository;

import com.uabc.edu.devsurvivor.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByUserName(String username);
}
