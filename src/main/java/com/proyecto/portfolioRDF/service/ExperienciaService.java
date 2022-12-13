package com.proyecto.portfolioRDF.service;

import com.proyecto.portfolioRDF.entity.Experiencia;
import com.proyecto.portfolioRDF.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    
    @Autowired
    private ExperienciaRepository experRepository;
    
    public List<Experiencia> getExperiencia() {
        List<Experiencia> listaExperiencias = experRepository.findAll();
        return listaExperiencias;
    }
    
    public void saveExperiencia(Experiencia exper) {
        experRepository.save(exper);
    }
    
    public void deleteExperiencia(int id){
        experRepository.deleteById(id);
    }
    
    public Experiencia findExperiencia(int id){
        Experiencia exper = experRepository.findById(id).orElse(null);
        return exper;
    }
}
