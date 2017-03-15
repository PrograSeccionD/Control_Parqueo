/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author M I C I F U S
 */
public class Ventana extends JFrame {
    
    PanelFondo p;
    
    public Ventana() {
        this.setBounds(0, 0, 600, 500);
        this.setTitle("GDA Systems");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentpane = getContentPane();
        
        p = new PanelFondo();
        contentpane.add(p);
    }
    
    public static void main(String args[]) {
        Ventana v = new Ventana();
    }
    
}
