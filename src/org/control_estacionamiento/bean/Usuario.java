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
public class Usuario {
    
    private int id;
    private String nombre;
    private String contrasenia;
    private boolean admin;
    
    public Usuario() {
        
    }
    
    public Usuario(int id, String nombre, String contrasenia, boolean admin) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
    
}
