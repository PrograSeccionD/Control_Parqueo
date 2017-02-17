/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.inicio;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
        
        JButton[] buttons = new JButton[controlador.getListado().size()];
        int i = 0;
        for(Ubicacion test: controlador.getListado() ) {
            buttons[i]  = new JButton(test.getDescripcion() +" - DISPONIBLE: " + test.getCantidadDisponible());
            buttons[i].setVerticalTextPosition(AbstractButton.BOTTOM);
            buttons[i].setHorizontalTextPosition(AbstractButton.CENTER);

            buttons[i].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            buttons[i].setFont(new java.awt.Font("Tahoma", 1, 13));
            buttons[i].setForeground(new java.awt.Color(0, 51, 255));

            buttons[i].setActionCommand(test.getCantidadDisponible() + "");
            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                   String choice = e.getActionCommand();
                   inicio.verEspacio(choice);
                }
            });
            inicio.add(buttons[i]);
            i++;
        }
        inicio.setVisible(true);

    }
    
   
    
}
