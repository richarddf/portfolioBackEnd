package com.proyecto.portfolioRDF.service;

import com.proyecto.portfolioRDF.entity.Habilidad;
import com.proyecto.portfolioRDF.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService {
    
    @Autowired
    private HabilidadRepository habilRepository;
    
    public List<Habilidad> getHabilidades() {
        List<Habilidad> listaHabilidades = habilRepository.findAll();
        return listaHabilidades;
    }
    
    public void saveHabilidad(Habilidad habil) {
        habilRepository.save(habil);
    }
    
    public void deleteHabilidad(int id){
        habilRepository.deleteById(id);
    }
    
    public Habilidad findHabilidad(int id){
        Habilidad habil = habilRepository.findById(id).orElse(null);
        return habil;
    }    
}
