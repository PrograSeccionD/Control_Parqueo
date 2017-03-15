/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author M I C I F U S
 */
public class PanelFondo extends JPanel{
    
    private Image fondo;
    
    public PanelFondo() {
        this.setBackground(Color.red);
        preInit();
        initComponents();
    }

    private void preInit() {
        fondo = new ImageIcon("white-background-sparkle.jpg").getImage();
    }

    private void initComponents() { 
    }
    
   
  
    public void paintComponent (Graphics g) {
        g.drawImage(fondo,0,0,this.getWidth(),this.getHeight(),this);
    }
    
}
