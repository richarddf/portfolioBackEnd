package com.proyecto.portfolioRDF.controller;

import com.proyecto.portfolioRDF.entity.Red;
import com.proyecto.portfolioRDF.service.RedService;
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
@RequestMapping("red")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolioangularrdf.web.app")
public class RedController {
    
    @Autowired
    RedService redServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Red> getRedes(){
        return redServ.getRedes();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Red verRed(@PathVariable int id){
        return redServ.findRed(id);
    }
    
    @PostMapping("/crear")
    public String agregarRed(@RequestBody Red red){
        redServ.saveRed(red);
        return "la red social se agregó correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarRed(@PathVariable int id){
        redServ.deleteRed(id);
        return "la red social se borró correctamente";
    }
    
    @PutMapping("/actualizar")
    public String actualizarRed(@RequestBody Red red){
        redServ.saveRed(red);
        return "la red social se actualizó correctamente";
    }
}
