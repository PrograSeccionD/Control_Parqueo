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
public class Tarifa {
    public static int tarifa = 25;
    public static int tiempo = 1;
    
    public Tarifa() {
   
    }

    public static int getTarifa() {
        return tarifa;
    }

    public static void setTarifa(int tarifa) {
        Tarifa.tarifa = tarifa;
    }

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        Tarifa.tiempo = tiempo;
    }
    
    
}
