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
    private boolean disponible;
    private String descripcion;
    private Ubicacion ubicacion;
    
    public Parqueo() {
        
    }
    
    public Parqueo(int id, String descripcion,boolean disponible, Ubicacion ubicacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

  
    
    
}
