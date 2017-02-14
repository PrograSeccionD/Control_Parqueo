/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.inicio;

import java.awt.GridLayout;
import javax.swing.JButton;
import org.control_estacionamiento.bean.Ubicacion;
import org.control_estacionamiento.controlador.ControladorUbicacion;
import org.control_estacionamiento.frame.Inicio;

/**
 *
 * @author coca_
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here7
        Inicio inicio = new Inicio();
        GridLayout experimentLayout = new GridLayout(0,2);
        inicio.setLayout(experimentLayout);
        //inicio.setSize(800, 800);
        inicio.setTitle("Control de Parqueo");
        Ubicacion ubicacion = new Ubicacion(1,"Sotano 1",5);
        Ubicacion ubicacion1 = new Ubicacion(1,"Sotano 2",10);
        Ubicacion ubicacion2 = new Ubicacion(1,"Sotano 3",7);
        ControladorUbicacion controlador = new ControladorUbicacion();
        controlador.agregarUbicacion(ubicacion);
        controlador.agregarUbicacion(ubicacion1);
        controlador.agregarUbicacion(ubicacion2);
        for(Ubicacion test: controlador.getListado() ) {
            inicio.add(new JButton(test.getDescripcion() +" - DISPONIBLE: " + test.getCantidadDisponible()));
        }
        inicio.setVisible(true);

    }
    
}
