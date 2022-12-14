package com.proyecto.portfolioRDF.service;

import com.proyecto.portfolioRDF.entity.Estudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.portfolioRDF.repository.EstudioRepository;

@Service
public class EstudioService {
    
    @Autowired
    private EstudioRepository estuRepository;
    
    public List<Estudio> getEstudios() {
        List<Estudio> listaEstudios = estuRepository.findAll();
        return listaEstudios;
    }
    
    public void saveEstudio(Estudio estu) {
        estuRepository.save(estu);
    }
    
    public void deleteEstudio(int id){
        estuRepository.deleteById(id);
    }
    
    public Estudio findEstudio(int id){
        Estudio estu = estuRepository.findById(id).orElse(null);
        return estu;
    }
}
