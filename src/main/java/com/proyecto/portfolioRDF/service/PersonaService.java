package com.proyecto.portfolioRDF.service;

import com.proyecto.portfolioRDF.entity.Persona;
import com.proyecto.portfolioRDF.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository persoRepository;
    
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }
    
    public void deletePersona(int id) {
        persoRepository.deleteById(id);
    }

    public Persona findPersona(int id) {
        //acá si no encuentro la persona, devuelvo null por eso va el orElse
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
    
    public Persona loginPersona(String email, String password) {
        List <Persona> personas = persoRepository.findByEmailAndPassword(email, password);
        
        if(!personas.isEmpty()){
            return personas.get(0);                        
        }
        return null;
    }

}
