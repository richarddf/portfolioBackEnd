package com.proyecto.portfolioRDF.repository;

import com.proyecto.portfolioRDF.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedRepository extends JpaRepository <Red, Integer> {
    
}
