package com.proyecto.portfolioRDF.controller;

import com.proyecto.portfolioRDF.entity.Habilidad;
import com.proyecto.portfolioRDF.service.HabilidadService;
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
@RequestMapping("habilidad")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolioangularrdf.web.app")
public class HabilidadController {
 
    @Autowired
    HabilidadService habilServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Habilidad> getHabilidades(){
        return habilServ.getHabilidades();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id){
        return habilServ.findHabilidad(id);
    }
    
    @PostMapping("/crear")
    public String agregarHabilidad(@RequestBody Habilidad habil){
        habilServ.saveHabilidad(habil);
        return "La habilidad se agregó correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarHabilidad(@PathVariable int id){
        habilServ.deleteHabilidad(id);
        return "La habilidad se borró correctamente";
    }
    
    @PutMapping("/actualizar")
    public String actualizarHabilidad(@RequestBody Habilidad habil){
        habilServ.saveHabilidad(habil);
        return "La habilidad se actualizó correctamente";
    }
}
