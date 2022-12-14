package com.proyecto.portfolioRDF.service;

import com.proyecto.portfolioRDF.entity.Proyecto;
import com.proyecto.portfolioRDF.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    
    @Autowired
    private ProyectoRepository proyRepository;
    
    public List<Proyecto> getProyectos() {
        List<Proyecto> listaProyectos = proyRepository.findAll();
        return listaProyectos;
    }
    
    public void saveProyecto(Proyecto proy) {
        proyRepository.save(proy);
    }
    
    public void deleteProyecto(int id){
        proyRepository.deleteById(id);
    }
    
    public Proyecto findProyecto(int id){
        Proyecto proy = proyRepository.findById(id).orElse(null);
        return proy;
    }    
}
