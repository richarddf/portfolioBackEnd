package com.proyecto.portfolioRDF.repository;

import com.proyecto.portfolioRDF.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Integer> {
    
}
