/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import org.control_estacionamiento.bean.Ticket;
import org.control_estacionamiento.controlador.ControladorTicket;

/**
 *
 * @author dafuentes
 */
public class Sotano3 extends javax.swing.JDialog {

    private ControladorTicket ctl_ticket = new ControladorTicket().getInstance();
    /**
     * Creates new form Sotano3
     */
    public Sotano3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mostrar(1);
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

        G = new javax.swing.JRadioButton();
        H = new javax.swing.JRadioButton();
        I = new javax.swing.JRadioButton();
        J = new javax.swing.JRadioButton();
        K = new javax.swing.JRadioButton();
        A = new javax.swing.JRadioButton();
        L = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        F1 = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        E = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I)
                        .addGap(18, 18, 18)
                        .addComponent(J)
                        .addGap(18, 18, 18)
                        .addComponent(K)
                        .addGap(18, 18, 18)
                        .addComponent(L)
                        .addGap(18, 18, 18)
                        .addComponent(M)
                        .addGap(28, 28, 28)
                        .addComponent(F1)
                        .addGap(18, 18, 18)
                        .addComponent(H))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A)
                        .addGap(18, 18, 18)
                        .addComponent(B)
                        .addGap(18, 18, 18)
                        .addComponent(C)
                        .addGap(18, 18, 18)
                        .addComponent(D)
                        .addGap(18, 18, 18)
                        .addComponent(E)
                        .addGap(28, 28, 28)
                        .addComponent(F)
                        .addGap(18, 18, 18)
                        .addComponent(G)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(G)
                    .addComponent(F)
                    .addComponent(E)
                    .addComponent(D)
                    .addComponent(C)
                    .addComponent(B)
                    .addComponent(A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(H)
                    .addComponent(F1)
                    .addComponent(M)
                    .addComponent(L)
                    .addComponent(K)
                    .addComponent(J)
                    .addComponent(I))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1ActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FActionPerformed

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
            java.util.logging.Logger.getLogger(Sotano3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sotano3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sotano3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sotano3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sotano3 dialog = new Sotano3(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void mostrar(int id) {
       for (Ticket t : ctl_ticket.getListadoPorSotano(id)) {
            switch(t.getParqueo().getDescripcion()) {
                case "A":
                    A.setSelected(true);
                    break;
                case "B":
                    B.setSelected(true);
                    break;
                case "C":
                    C.setSelected(true);
                    break;
                case "D":
                    D.setSelected(true);
                    break;
                case "E":
                    E.setSelected(true);
                    break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JRadioButton E;
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton F1;
    private javax.swing.JRadioButton G;
    private javax.swing.JRadioButton H;
    private javax.swing.JRadioButton I;
    private javax.swing.JRadioButton J;
    private javax.swing.JRadioButton K;
    private javax.swing.JRadioButton L;
    private javax.swing.JRadioButton M;
    // End of variables declaration//GEN-END:variables
}
