/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.bean;

/**
 *
 * @author dafuentes
 */
public class Parqueo {
    
    private int id;
    private double disponible;
    private String descripcion;
    private Ubicacion ubicacion;
    
    public Parqueo() {
        
    }
    
    public Parqueo(int id, double disponible, Ubicacion ubicacion) {
        this.id = id;
        this.disponible = disponible;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDisponible() {
        return disponible;
    }

    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
