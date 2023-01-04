package com.proyecto.portfolioRDF.repository;

import com.proyecto.portfolioRDF.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {
    public List<Persona> findByEmailAndPassword(String email, String password);
}
