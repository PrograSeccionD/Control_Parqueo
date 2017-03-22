/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

//import javax.swing.JButton;

/**
 *
 * @author dafuentes
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
       
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("img/parking(1).png")).getImage());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_reporte = new javax.swing.JButton();
        btn_salida = new javax.swing.JButton();
        btn_parqueo = new javax.swing.JButton();
        btn_ingreso = new javax.swing.JButton();
        btn_tarifa = new javax.swing.JButton();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelReporte = new javax.swing.JLabel();
        jLabelParqueo = new javax.swing.JLabel();
        jLabelSalida = new javax.swing.JLabel();
        jLabelEntrada = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabelPower = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 471));
        setResizable(false);
        setSize(new java.awt.Dimension(540, 471));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_reporte.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/check-mark.png"))); // NOI18N
        btn_reporte.setBorderPainted(false);
        btn_reporte.setContentAreaFilled(false);
        btn_reporte.setFocusPainted(false);
        btn_reporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/check-mark-pressed.png"))); // NOI18N
        btn_reporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/check-mark-pressed.png"))); // NOI18N
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 240, 60, 79));

        btn_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/exit.png"))); // NOI18N
        btn_salida.setBorderPainted(false);
        btn_salida.setContentAreaFilled(false);
        btn_salida.setFocusPainted(false);
        btn_salida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/exit-pressed.png"))); // NOI18N
        btn_salida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/exit-pressed.png"))); // NOI18N
        btn_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salidaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 149, 79));

        btn_parqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/maps-and-flags.png"))); // NOI18N
        btn_parqueo.setBorderPainted(false);
        btn_parqueo.setContentAreaFilled(false);
        btn_parqueo.setFocusPainted(false);
        btn_parqueo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/maps-and-flags-pressed.png"))); // NOI18N
        btn_parqueo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/maps-and-flags-pressed.png"))); // NOI18N
        btn_parqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parqueoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_parqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 149, 79));

        btn_ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/entrance.png"))); // NOI18N
        btn_ingreso.setBorderPainted(false);
        btn_ingreso.setContentAreaFilled(false);
        btn_ingreso.setFocusPainted(false);
        btn_ingreso.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/entrance-pressed.png"))); // NOI18N
        btn_ingreso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/entrance-pressed.png"))); // NOI18N
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, 79));

        btn_tarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/receipt.png"))); // NOI18N
        btn_tarifa.setBorderPainted(false);
        btn_tarifa.setContentAreaFilled(false);
        btn_tarifa.setFocusPainted(false);
        btn_tarifa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/receipt-pressed.png"))); // NOI18N
        btn_tarifa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/receipt-pressed.png"))); // NOI18N
        btn_tarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tarifaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 80, 70));

        jLabelTarifa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelTarifa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTarifa.setText("Tarifa");
        getContentPane().add(jLabelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jLabelReporte.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelReporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReporte.setText("Reporte");
        getContentPane().add(jLabelReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabelParqueo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelParqueo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelParqueo.setText("Ver Parqueos");
        getContentPane().add(jLabelParqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jLabelSalida.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelSalida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalida.setText("Nueva Salida");
        getContentPane().add(jLabelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabelEntrada.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEntrada.setText("Nueva Entrada");
        getContentPane().add(jLabelEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/cross-circular-button.png"))); // NOI18N
        jButtonExit.setBorderPainted(false);
        jButtonExit.setContentAreaFilled(false);
        jButtonExit.setFocusPainted(false);
        jButtonExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/cross-circular-button-press.png"))); // NOI18N
        jButtonExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/cross-circular-button-press.png"))); // NOI18N
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 40, -1));

        jLabelPower.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelPower.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPower.setText("Powered by GDA Systems ©");
        getContentPane().add(jLabelPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        jLabelTitle.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("The Parking Lot");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/1obsx5o.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -470, 540, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
        // TODO add your handling code here:
        VentanaReporte reporte = new VentanaReporte(this, true);
        reporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_reporteActionPerformed

    private void btn_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salidaActionPerformed
        // TODO add your handling code here:
        VentanaSalida salida = new VentanaSalida(this, true);
        salida.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_salidaActionPerformed

    private void btn_parqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parqueoActionPerformed
        // TODO add your handling code here:
        Principal sotanos = new Principal();
        sotanos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_parqueoActionPerformed

    private void btn_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresoActionPerformed
        // TODO add your handling code here:
        VentanaEntrada entrada = new VentanaEntrada(this, true);
        entrada.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ingresoActionPerformed

    private void btn_tarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tarifaActionPerformed
        // TODO add your handling code here:
        VentanaTarifa tarifa = new VentanaTarifa(this, true);
        tarifa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_tarifaActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    public void agregarComponente() {
        btn_ingreso.setPreferredSize(new Dimension(40, 40));
        btn_ingreso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               btnEntradaActionPerformed(e);
            }
        });   
	btn_salida.setPreferredSize(new Dimension(40, 40));
        btn_salida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               btnSalidaActionPerformed(e);
            }
        });
        
	btn_reporte.setPreferredSize(new Dimension(40, 40));
        btn_reporte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               btnReporteActionPerformed(e);
            }
        });   
	/*btn_parqueo.setPreferredSize(new Dimension(40, 40));
        btn_parqueo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnParqueoActionPerformed(e);
            }
        });  */ 
        
	btn_tarifa.setPreferredSize(new Dimension(40, 40));
        btn_tarifa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               btnTarifaActionPerformed(e);
            }
        });   
    }
    
    private void btnEntradaActionPerformed(ActionEvent evt) {
        /*VentanaEntrada ventanaEntrada = new VentanaEntrada(this, true);
        ventanaEntrada.agregarComponente();*/
    }
    
    private void btnSalidaActionPerformed(ActionEvent evt) {
       /* VentanaSalida ventanaSalida = new VentanaSalida(this, true);
        ventanaSalida.agregarComponente();*/
    }
    
    private void btnTarifaActionPerformed(ActionEvent evt) {
       /* VentanaTarifa ventanaTarifa = new VentanaTarifa(this, true);*/
    }
    
    private void btnReporteActionPerformed(ActionEvent evt) {
      /*  VentanaReporte ventanaReporte = new VentanaReporte(this, true);
        ventanaReporte.agregarComponente();*/
    }
    
    private void btnParqueoActionPerformed(ActionEvent evt) {
      /* VentanaParqueo ventanaParqueo = new VentanaParqueo();
       ventanaParqueo.agregarComponente();*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingreso;
    private javax.swing.JButton btn_parqueo;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JButton btn_salida;
    private javax.swing.JButton btn_tarifa;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelEntrada;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelParqueo;
    private javax.swing.JLabel jLabelPower;
    private javax.swing.JLabel jLabelReporte;
    private javax.swing.JLabel jLabelSalida;
    private javax.swing.JLabel jLabelTarifa;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
