package com.proyecto.portfolioRDF.repository;

import com.proyecto.portfolioRDF.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Integer> {
    
}
