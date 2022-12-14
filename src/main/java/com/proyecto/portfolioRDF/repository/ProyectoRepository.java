package com.proyecto.portfolioRDF.repository;

import com.proyecto.portfolioRDF.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Integer> {
    
}
