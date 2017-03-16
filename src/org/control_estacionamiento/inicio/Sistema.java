/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.inicio;

import org.control_estacionamiento.bean.Parqueo;
import org.control_estacionamiento.bean.Ubicacion;
import org.control_estacionamiento.controlador.ControladorParqueo;
import org.control_estacionamiento.controlador.ControladorUbicacion;

import org.control_estacionamiento.frame.VentanaPrincipal;


/**
 *
 * @author coca_
 */
public class Sistema {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String[] letra ={"A","B","C","D","E","F"};
        ControladorUbicacion controlador = new ControladorUbicacion().getInstance();
        ControladorParqueo controlador_parqueo = new ControladorParqueo().getInstance();
        for (int y = 0; y < 3; y++) {
            Ubicacion ubicacion = new Ubicacion(y,"Sotano " + (y+ 1),y+ 1);
            controlador.agregarUbicacion(ubicacion);
            for (int x = 0; x < 5; x++) {
                Parqueo parqueo  = new Parqueo(x , letra[x], true, ubicacion);
                controlador_parqueo.agregarParqueo(parqueo);
            }
        }

        
       
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setSize(400, 325);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.agregarComponente();
        ventanaPrincipal.setVisible(true);

    }
}
