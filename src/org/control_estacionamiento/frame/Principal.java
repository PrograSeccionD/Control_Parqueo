/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import javax.swing.ImageIcon;

/**
 *
 * @author M I C I F U S
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("img/parking(1).png")).getImage());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jLabelSotano1 = new javax.swing.JLabel();
        jLabelSotano2 = new javax.swing.JLabel();
        jLabelSotano3 = new javax.swing.JLabel();
        jButtonGreen = new javax.swing.JButton();
        jButtonBlue = new javax.swing.JButton();
        jButtonRed = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelDesc = new javax.swing.JLabel();
        jLabelDisponible1 = new javax.swing.JLabel();
        jLabelDisponible2 = new javax.swing.JLabel();
        jLabelDisponible3 = new javax.swing.JLabel();
        jLabelGDA = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(51, 51, 51));
        jButtonExit.setForeground(new java.awt.Color(51, 51, 51));
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
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 50, 40));

        jLabelSotano1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelSotano1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSotano1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSotano1.setText("Sótano 1");
        getContentPane().add(jLabelSotano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 30));

        jLabelSotano2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelSotano2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSotano2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSotano2.setText("Sótano 2");
        getContentPane().add(jLabelSotano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, -1));

        jLabelSotano3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelSotano3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSotano3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSotano3.setText("Sótano 3");
        getContentPane().add(jLabelSotano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 120, -1));

        jButtonGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (8).png"))); // NOI18N
        jButtonGreen.setBorderPainted(false);
        jButtonGreen.setContentAreaFilled(false);
        jButtonGreen.setFocusPainted(false);
        jButtonGreen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (7).png"))); // NOI18N
        jButtonGreen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (7).png"))); // NOI18N
        getContentPane().add(jButtonGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 140, 130));

        jButtonBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (5).png"))); // NOI18N
        jButtonBlue.setBorderPainted(false);
        jButtonBlue.setContentAreaFilled(false);
        jButtonBlue.setFocusPainted(false);
        jButtonBlue.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (9).png"))); // NOI18N
        jButtonBlue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (9).png"))); // NOI18N
        getContentPane().add(jButtonBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, 130));

        jButtonRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (4).png"))); // NOI18N
        jButtonRed.setBorderPainted(false);
        jButtonRed.setContentAreaFilled(false);
        jButtonRed.setFocusPainted(false);
        jButtonRed.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (10).png"))); // NOI18N
        jButtonRed.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/parking-sign (10).png"))); // NOI18N
        getContentPane().add(jButtonRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 150));

        jLabelTitle.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("EasyParking");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 60, 540, -1));

        jLabelDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDesc.setText("Elige en qué sótano deseas estacionar tu vehículo");
        getContentPane().add(jLabelDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 440, -1));

        jLabelDisponible1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelDisponible1.setText("Disponibles:");
        getContentPane().add(jLabelDisponible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, -1));

        jLabelDisponible2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelDisponible2.setText("Disponibles:");
        getContentPane().add(jLabelDisponible2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabelDisponible3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelDisponible3.setText("Disponibles:");
        getContentPane().add(jLabelDisponible3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jLabelGDA.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelGDA.setText("Powered by: GDA Systems ©");
        getContentPane().add(jLabelGDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(102, 255, 102));
        jLabelFondo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/white-background-sparkle.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 471));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBlue;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonGreen;
    private javax.swing.JButton jButtonRed;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JLabel jLabelDisponible1;
    private javax.swing.JLabel jLabelDisponible2;
    private javax.swing.JLabel jLabelDisponible3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGDA;
    private javax.swing.JLabel jLabelSotano1;
    private javax.swing.JLabel jLabelSotano2;
    private javax.swing.JLabel jLabelSotano3;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
