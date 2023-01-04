package com.proyecto.portfolioRDF.controller;

import com.proyecto.portfolioRDF.entity.Persona;
import com.proyecto.portfolioRDF.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    PersonaService persoServ;
    
    @PostMapping ("/autenticacion/login")
    public Persona loginPersona (@RequestBody Persona pers) {
        return persoServ.loginPersona(pers.getEmail(),pers.getPassword());
    }
    
    /* Endpoint Persona */
    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> getPersonas(){
        return persoServ.getPersonas();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.findPersona(id);
    }
    
    @PostMapping("/crear")
    public String agregarPersona(@RequestBody Persona pers){
        persoServ.savePersona(pers);
        return "La persona se agregó correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarPersona(@PathVariable int id){
        persoServ.deletePersona(id);
        return "La persona se borró correctamente";
    }
    
    @PutMapping("/actualizar")
    public String actualizarPersona(@RequestBody Persona pers){
        persoServ.savePersona(pers);
        return "La persona se actualizó correctamente";
    }
    
}
