/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

/**
 *
 * @author dafuentes
 */
public class VentanaParqueo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaParqueo
     */
    public VentanaParqueo() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(425, 335);  
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sotano3 = new javax.swing.JButton();
        sotano2 = new javax.swing.JButton();
        sotano1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sotano3.setText("SOTANO 3");
        sotano3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotano3ActionPerformed(evt);
            }
        });

        sotano2.setText("SOTANO 2");
        sotano2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotano2ActionPerformed(evt);
            }
        });

        sotano1.setText("SOTANO 1");
        sotano1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotano1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(sotano1)
                .addGap(39, 39, 39)
                .addComponent(sotano2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(sotano3)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sotano3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sotano2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sotano1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sotano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotano1ActionPerformed
      //  Sotano1 ventanaIndividual = new Sotano1(this, true);
      Sotano1 ventanaIndividual = new Sotano1();
      ventanaIndividual.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_sotano1ActionPerformed

    private void sotano3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotano3ActionPerformed
      //  Sotano2 ventanaIndividual = new Sotano2(this, true);
      Sotano2 ventanaIndividual = new Sotano2();
      ventanaIndividual.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_sotano3ActionPerformed

    private void sotano2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotano2ActionPerformed
       // Sotano3 ventanaIndividual = new Sotano3(this, true);
       Sotano3 ventanaIndividual = new Sotano3();
       this.setVisible(false);
    }//GEN-LAST:event_sotano2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaParqueo().setVisible(true);
            }
        });
    }
    
    public void agregarComponente() {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton sotano1;
    private javax.swing.JButton sotano2;
    private javax.swing.JButton sotano3;
    // End of variables declaration//GEN-END:variables
}
