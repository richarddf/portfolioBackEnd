package com.proyecto.portfolioRDF.controller;

import com.proyecto.portfolioRDF.entity.Estudio;
import com.proyecto.portfolioRDF.service.EstudioService;
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
@RequestMapping("estudio")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://portfolioangularrdf.web.app","http://localhost:4200"})
public class EstudioController {
    
    @Autowired
    EstudioService estuServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Estudio> getEstudios(){
        return estuServ.getEstudios();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudio verEstudio(@PathVariable int id){
        return estuServ.findEstudio(id);
    }
    
    @PostMapping("/crear")
    public String agregarEstudio(@RequestBody Estudio estu){
        estuServ.saveEstudio(estu);
        return "El estudio se agregó correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarEstudio(@PathVariable int id){
        estuServ.deleteEstudio(id);
        return "El estudio se borró correctamente";
    }
    
    @PutMapping("/actualizar")
    public String actualizarEstudio(@RequestBody Estudio estu){
        estuServ.saveEstudio(estu);
        return "El estudio se actualizó correctamente";
    }    
}
