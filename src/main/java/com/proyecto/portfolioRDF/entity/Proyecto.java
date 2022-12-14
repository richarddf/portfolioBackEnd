package com.proyecto.portfolioRDF.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcion;
    private String url_img_proyecto;
    private int idpersona;

    public Proyecto() {
    }

    public Proyecto(String descripcion, String url_img_proyecto, int idpersona) {
        this.descripcion = descripcion;
        this.url_img_proyecto = url_img_proyecto;
        this.idpersona = idpersona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl_img_proyecto() {
        return url_img_proyecto;
    }

    public void setUrl_img_proyecto(String url_img_proyecto) {
        this.url_img_proyecto = url_img_proyecto;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }
    
}
