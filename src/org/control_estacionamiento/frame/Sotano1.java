/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import javax.swing.ImageIcon;
import org.control_estacionamiento.bean.Ticket;
import org.control_estacionamiento.controlador.ControladorTicket;

/**
 *
 * @author dafuentes
 */
public class Sotano1 extends javax.swing.JDialog {
    
    private ControladorTicket ctl_ticket = new ControladorTicket().getInstance();
    /**
     * Creates new form Sotano1
     */
    public Sotano1(/*java.awt.Frame parent, boolean modal*/) {
       // super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrar(0);   
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

        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        E = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        G = new javax.swing.JRadioButton();
        H = new javax.swing.JRadioButton();
        I = new javax.swing.JRadioButton();
        J = new javax.swing.JRadioButton();
        K = new javax.swing.JRadioButton();
        L = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        F1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        RegresarMenu = new javax.swing.JButton();
        jLabelContainer = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 471));
        setResizable(false);
        setSize(new java.awt.Dimension(540, 471));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A.setContentAreaFilled(false);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        B.setContentAreaFilled(false);
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        C.setContentAreaFilled(false);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        D.setContentAreaFilled(false);
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        E.setContentAreaFilled(false);
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        F.setContentAreaFilled(false);
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        G.setContentAreaFilled(false);
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        getContentPane().add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        H.setContentAreaFilled(false);
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        I.setContentAreaFilled(false);
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        getContentPane().add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        J.setContentAreaFilled(false);
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });
        getContentPane().add(J, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        K.setContentAreaFilled(false);
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });
        getContentPane().add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        L.setContentAreaFilled(false);
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        M.setContentAreaFilled(false);
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        F1.setContentAreaFilled(false);
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("|");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 76));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("|");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, 76));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("|");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 76));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("|");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 76));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("|");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 76));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("|");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 76));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setText("|");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 76));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("|");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 76));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setText("/");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setText("/");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setText("/");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setText("/");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setText("/");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel14.setText("/");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setText("/");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel16.setText("/");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabelTitle.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Sotano 1");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        RegresarMenu.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RegresarMenu.setForeground(new java.awt.Color(255, 255, 255));
        RegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/go-back-arrow (2).png"))); // NOI18N
        RegresarMenu.setText("Regresar");
        RegresarMenu.setBorderPainted(false);
        RegresarMenu.setContentAreaFilled(false);
        RegresarMenu.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/go-back-arrow.png"))); // NOI18N
        RegresarMenu.setFocusPainted(false);
        RegresarMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/go-back-arrow.png"))); // NOI18N
        RegresarMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/go-back-arrow.png"))); // NOI18N
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabelContainer.setBackground(new java.awt.Color(0, 153, 204));
        jLabelContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/plainwhite.png"))); // NOI18N
        getContentPane().add(jLabelContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 380, 180));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/control_estacionamiento/frame/img/black-holes.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel17");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FActionPerformed

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

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1ActionPerformed

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
        // TODO add your handling code here:
        Principal regresar = new Principal();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Sotano1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sotano1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sotano1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sotano1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  Sotano1 dialog = new Sotano1(new javax.swing.JFrame(), true);
              //  dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                //    @Override
                //    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                 //   }
              //  });
              //  dialog.setVisible(true);
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
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelContainer;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
