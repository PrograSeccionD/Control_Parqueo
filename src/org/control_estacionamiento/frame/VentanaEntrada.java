/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.control_estacionamiento.bean.Parqueo;
import org.control_estacionamiento.bean.Tarifa;
import org.control_estacionamiento.bean.Ticket;
import org.control_estacionamiento.controlador.ControladorParqueo;
import org.control_estacionamiento.controlador.ControladorTicket;

/**
 *
 * @author dafuentes
 */
public class VentanaEntrada extends javax.swing.JDialog {
    
    protected SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");
    private Parqueo parqueo_disponible;
    private Date currentTime;
    /**
     * Creates new form VentanaEntrada
     */
    public VentanaEntrada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        agregarComponente();
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

        lbl_placa = new javax.swing.JLabel();
        lbl_entrada = new javax.swing.JLabel();
        lbl_tarifa = new javax.swing.JLabel();
        lbl_parqueo = new javax.swing.JLabel();
        txt_placa = new javax.swing.JFormattedTextField();
        txt_parqueo = new javax.swing.JFormattedTextField();
        txt_entrada = new javax.swing.JFormattedTextField();
        txt_tarifa = new javax.swing.JFormattedTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_placa.setText("PLACA");

        lbl_entrada.setText("FECHA Y HORA");

        lbl_tarifa.setText("TARIFA");

        lbl_parqueo.setText("PARQUEO ASIGNADO");

        txt_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_entradaActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_parqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_parqueo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_placa, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txt_entrada))))
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btn_guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_placa)
                    .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_entrada)
                    .addComponent(txt_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tarifa)
                    .addComponent(txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_parqueo)
                    .addComponent(txt_parqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cancelar))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_entradaActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEntrada dialog = new VentanaEntrada(new javax.swing.JFrame(), true);
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
    
    public void agregarComponente() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(425, 335);
        
        // HORA ENTRADA
        Calendar currentCalendar = Calendar.getInstance();
        currentTime = currentCalendar.getTime();
        txt_entrada.setValue(timeFormat.format(currentTime));
        txt_entrada.setEditable(false);
        
        // TARIFA
        txt_tarifa.setValue(Tarifa.getTarifa());
        txt_tarifa.setEditable(false);
        
        // PARQUEO
        ControladorParqueo ctl_parqueo = new ControladorParqueo().getInstance();
        parqueo_disponible = ctl_parqueo.getParqueoDisponible();

        btn_guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               btnGuardarActionPerformed(e);
            }
        }); 
        
        if (parqueo_disponible != null) {
            txt_parqueo.setValue(parqueo_disponible.getDescripcion() + " - " + parqueo_disponible.getUbicacion().getDescripcion());
        } else {
            btn_guardar.setEnabled(false);
            txt_parqueo.setValue("No hay parqueos");
        }
        txt_parqueo.setEditable(false);
        
        btn_cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               btnCancelarActionPerformed(e);
            }
        });   
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        if (parqueo_disponible != null) {
            ControladorTicket ctl_ticket = new ControladorTicket().getInstance();
            Ticket ticket = new Ticket();
            ticket.setId(ctl_ticket.getListadoTicket().size() + 1);
            ticket.setHoraEntrada(currentTime);
            ticket.setPlaca(txt_placa.getText());
            ticket.setParqueo(parqueo_disponible);
            ticket.setTarifa(Tarifa.getTarifa());
            parqueo_disponible.setDisponible(false);
            ctl_ticket.agregarTicket(ticket);
        }
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel lbl_entrada;
    private javax.swing.JLabel lbl_parqueo;
    private javax.swing.JLabel lbl_placa;
    private javax.swing.JLabel lbl_tarifa;
    private javax.swing.JFormattedTextField txt_entrada;
    private javax.swing.JFormattedTextField txt_parqueo;
    private javax.swing.JFormattedTextField txt_placa;
    private javax.swing.JFormattedTextField txt_tarifa;
    // End of variables declaration//GEN-END:variables
}
