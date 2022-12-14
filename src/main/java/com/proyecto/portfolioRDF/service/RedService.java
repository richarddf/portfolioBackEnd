package com.proyecto.portfolioRDF.service;

import com.proyecto.portfolioRDF.entity.Red;
import com.proyecto.portfolioRDF.repository.RedRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedService {
    
    @Autowired
    private RedRepository redRepository;
    
    public List<Red> getRedes() {
        List<Red> listaRedes = redRepository.findAll();
        return listaRedes;
    }
    
    public void saveRed(Red red) {
        redRepository.save(red);
    }
    
    public void deleteRed(int id){
        redRepository.deleteById(id);
    }
    
    public Red findRed(int id){
        Red red = redRepository.findById(id).orElse(null);
        return red;
    }
}
