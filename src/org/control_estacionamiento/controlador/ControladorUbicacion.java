/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.controlador;

import java.util.ArrayList;
import org.control_estacionamiento.bean.Ubicacion;

/**
 *
 * @author dafuentes
 */
public class ControladorUbicacion {
    private static ControladorUbicacion instance = null;
    ArrayList<Ubicacion> listadoUbicacion = new ArrayList<>();
    
    public static ControladorUbicacion getInstance() {
        if(instance == null) {
            instance = new ControladorUbicacion();
        }
        return instance;
    }
    
    public void agregarUbicacion(Ubicacion ubicacion) {
        listadoUbicacion.add(ubicacion);
    }
    
    public Ubicacion buscarUbicacion (int id) {
        return listadoUbicacion.get(id);
    }
    
    public ArrayList<Ubicacion> getListado() {
        return listadoUbicacion;
    }
    
}
