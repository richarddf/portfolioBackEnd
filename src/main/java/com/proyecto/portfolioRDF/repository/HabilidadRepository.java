package com.proyecto.portfolioRDF.repository;

import com.proyecto.portfolioRDF.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Integer> {
    
}
