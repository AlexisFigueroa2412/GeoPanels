/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;

import Clases.ClaseFactura;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class TipoPago extends javax.swing.JFrame {
    ClaseFactura fac = new ClaseFactura();
    public static String Precio;
    public static String Indicador;
    public static String Factura;
    /**
     * Creates new form TipoPago
     */
    public TipoPago() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCerrar1 = new javax.swing.JButton();
        btnMinimizar2 = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(27, 35, 41));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setText("Método de Pago :");

        btnAceptar.setBackground(new java.awt.Color(27, 35, 41));
        btnAceptar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(149, 162, 166));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-soccer-yellow-card-30.png"))); // NOI18N
        btnAceptar.setText("Tarjeta");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setOpaque(true);
        btnAceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-soccer-yellow-card-30 (1).png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCerrar1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnCerrar1.setForeground(new java.awt.Color(149, 162, 166));
        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-cancelar-17.png"))); // NOI18N
        btnCerrar1.setToolTipText("Cerrar");
        btnCerrar1.setBorder(null);
        btnCerrar1.setContentAreaFilled(false);
        btnCerrar1.setHideActionText(true);
        btnCerrar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-cancelar-17 (2).png"))); // NOI18N
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        btnMinimizar2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnMinimizar2.setForeground(new java.awt.Color(149, 162, 166));
        btnMinimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-menos-17.png"))); // NOI18N
        btnMinimizar2.setToolTipText("Minimizar");
        btnMinimizar2.setBorder(null);
        btnMinimizar2.setContentAreaFilled(false);
        btnMinimizar2.setHideActionText(true);
        btnMinimizar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-menos-17 (3).png"))); // NOI18N
        btnMinimizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar2ActionPerformed(evt);
            }
        });

        btnAceptar1.setBackground(new java.awt.Color(27, 35, 41));
        btnAceptar1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAceptar1.setForeground(new java.awt.Color(149, 162, 166));
        btnAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-cash-in-hand-30 (1).png"))); // NOI18N
        btnAceptar1.setText("Efectivo");
        btnAceptar1.setBorderPainted(false);
        btnAceptar1.setContentAreaFilled(false);
        btnAceptar1.setOpaque(true);
        btnAceptar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-cash-in-hand-30.png"))); // NOI18N
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMinimizar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnAceptar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        fac.setMontoRecibo(fac.getMontoPago());
        Tarjeta tj = new Tarjeta();
        tj.setVisible(true);
        Tarjeta.Indicador = TipoPago.Indicador;
        Tarjeta.Precio = TipoPago.Precio;
        Tarjeta.Factura = TipoPago.Factura;
        this.dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnMinimizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar2ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizar2ActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:
        Pagos pg = new Pagos();
        pg.setVisible(true);
        Pagos.txtFactura.setText(Factura);
        Pagos.txtPago.setText(Precio);
        Pagos.txtIndicador.setText(Indicador);
//        JOptionPane.showMessageDialog(this, TipoPago.Indicador+" "+TipoPago.Precio+" "+TipoPago.Factura);
//        JOptionPane.showMessageDialog(this, Tarjeta.Indicador+" "+TipoPago.Precio+" "+TipoPago.Factura);
        this.dispose();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnMinimizar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}