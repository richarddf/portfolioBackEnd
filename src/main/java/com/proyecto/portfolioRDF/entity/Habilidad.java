package com.proyecto.portfolioRDF.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tecnologia;
    private String url_img_tecnologia;
    private int porcentaje;
    private String descripcion;
    private int idpersona;

    public Habilidad() {
    }

    public Habilidad(String tecnologia, String url_img_tecnologia, int porcentaje, String descripcion, int idpersona) {
        this.tecnologia = tecnologia;
        this.url_img_tecnologia = url_img_tecnologia;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
        this.idpersona = idpersona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getUrl_img_tecnologia() {
        return url_img_tecnologia;
    }

    public void setUrl_img_tecnologia(String url_img_tecnologia) {
        this.url_img_tecnologia = url_img_tecnologia;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }
    
    
    
}
