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
public class Ubicacion {
    
    private int id;
    private String descripcion;
    private int cantidadDisponible;
    
    public Ubicacion () {
    
    }
    
    public Ubicacion (int id, String descripcion, int cantidadDisponible) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    
}
