package com.proyecto.portfolioRDF.controller;

import com.proyecto.portfolioRDF.entity.Proyecto;
import com.proyecto.portfolioRDF.service.ProyectoService;
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
@RequestMapping("proyecto")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://portfolioangularrdf.web.app","http://localhost:4200"})
public class ProyectoController {
    
    @Autowired
    ProyectoService proyServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> getProyectos(){
        return proyServ.getProyectos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyServ.findProyecto(id);
    }
    
    @PostMapping("/crear")
    public String agregarProyecto(@RequestBody Proyecto proy){
        proyServ.saveProyecto(proy);
        return "El proyecto se agregó correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarProyecto(@PathVariable int id){
        proyServ.deleteProyecto(id);
        return "El proyecto se borró correctamente";
    }
    
    @PutMapping("/actualizar")
    public String actualizarProyecto(@RequestBody Proyecto proy){
        proyServ.saveProyecto(proy);
        return "El proyecto se actualizó correctamente";
    }    
}
