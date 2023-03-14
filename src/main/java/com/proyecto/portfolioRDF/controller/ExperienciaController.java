package com.proyecto.portfolioRDF.controller;

import com.proyecto.portfolioRDF.entity.Experiencia;
import com.proyecto.portfolioRDF.service.ExperienciaService;
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
@RequestMapping("experiencia")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://portfolioangularrdf.web.app","http://localhost:4200"})
public class ExperienciaController {
    
    @Autowired
    ExperienciaService experServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> getExperiencias(){
        return experServ.getExperiencias();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return experServ.findExperiencia(id);
    }
    
    @PostMapping("/crear")
    public String agregarExperiencia(@RequestBody Experiencia exper){
        experServ.saveExperiencia(exper);
        return "La experiencia se agregó correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarExperiencia(@PathVariable int id){
        experServ.deleteExperiencia(id);
        return "La experiencia se borró correctamente";
    }
    
    @PutMapping("/actualizar")
    public String actualizarExperiencia(@RequestBody Experiencia exper){
        experServ.saveExperiencia(exper);
        return "La experiencia se actualizó correctamente";
    }
}
