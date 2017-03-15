/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.control_estacionamiento.bean.Parqueo;
import org.control_estacionamiento.bean.Ubicacion;
import org.control_estacionamiento.controlador.ControladorParqueo;

/**
 *
 * @author dafuentes
 */
public class ParqueoFrame extends javax.swing.JFrame {

    /**
     * Creates new form Parqueo
     */
    public ParqueoFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_menu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_menu.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParqueoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParqueoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParqueoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParqueoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParqueoFrame().setVisible(true);
            }
        });
    }
    
    public JPanel obtenerPosiciones(Ubicacion ubicacion, Inicio inicio) {
        ControladorParqueo controlador = new ControladorParqueo().getInstance();
        //System.out.println(controlador.getListado(ubicacion).size());
        JButton[] buttons = new JButton[controlador.getListado(ubicacion).size() + 1];
        int i = 0;
        for(Parqueo test: controlador.getListado(ubicacion)) {
            buttons[i]  = new JButton(test.getDescripcion() +" - ESTADO: " + test.isDisponible());
            buttons[i].setVerticalTextPosition(AbstractButton.BOTTOM);
            buttons[i].setHorizontalTextPosition(AbstractButton.CENTER);

            buttons[i].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            buttons[i].setFont(new java.awt.Font("Tahoma", 1, 13));
            buttons[i].setForeground(new java.awt.Color(0, 51, 255));

            buttons[i].setActionCommand(test.getId() + "");
            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                   String choice = e.getActionCommand();
                }
            });       
            pnl_menu.add(buttons[i]);
            i++;
        }
        buttons[i]  = new JButton("Regresar");
        buttons[i].setVerticalTextPosition(AbstractButton.BOTTOM);
        buttons[i].setHorizontalTextPosition(AbstractButton.CENTER);

        buttons[i].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttons[i].setFont(new java.awt.Font("Tahoma", 1, 13));
        buttons[i].setForeground(new java.awt.Color(0, 51, 255));

        buttons[i].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               inicio.iniciar();
            }
        });       
        pnl_menu.add(buttons[i]);

      return pnl_menu;  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnl_menu;
    // End of variables declaration//GEN-END:variables
}