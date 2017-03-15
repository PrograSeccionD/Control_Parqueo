/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.controlador;

import java.util.ArrayList;
import org.control_estacionamiento.bean.Parqueo;
import org.control_estacionamiento.bean.Ubicacion;

/**
 *
 * @author dafuentes
 */
public class ControladorParqueo {
    private static ControladorParqueo instance = null;
    ArrayList<Parqueo> listadoParqueo = new ArrayList<>();
    
    public static ControladorParqueo getInstance() {
        if(instance == null) {
            instance = new ControladorParqueo();
        }
        return instance;
    }
    
    public void agregarParqueo(Parqueo ubicacion) {
        listadoParqueo.add(ubicacion);
    }
    
    public ArrayList<Parqueo> getListado(Ubicacion ubicacion) {
        
        ArrayList<Parqueo> result = new ArrayList<Parqueo>();
        for (Parqueo person : listadoParqueo) {
          if (person.getUbicacion().getId() == ubicacion.getId()) {
            result.add(person);
          }
        }
        return result;
    }
    
    public Parqueo getParqueoDisponible() {
        for (Parqueo parqueo : listadoParqueo) {
            if (parqueo.isDisponible()) {
                return parqueo;
            }
        }
        return null;
    }
}
