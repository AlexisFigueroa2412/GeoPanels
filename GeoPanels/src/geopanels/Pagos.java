/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;
import Clases.ClaseFactura;
import Clases.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author jalex
 */

public class Pagos extends javax.swing.JFrame {
    ClaseFactura fac = new ClaseFactura();
    public static ResultSet retorno;
    
    /**
     * Creates new form Pagos
     */
    public Pagos() {
        initComponents();
        txtIdPago.setVisible(false); 
        txtIndicador.setVisible(false);
        txtFactura.setVisible(false);
        txtTarjeta.setVisible(false);
//        Recibir_datos();
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
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JButton();
        btnMinimizar2 = new javax.swing.JButton();
        txtPago = new javax.swing.JFormattedTextField();
        txtRecibido = new javax.swing.JFormattedTextField();
        txtRetorno = new javax.swing.JFormattedTextField();
        txtIdPago = new javax.swing.JTextField();
        txtIndicador = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        txtTarjeta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(27, 35, 41));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setText("Intercambio :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(149, 162, 166));
        jLabel4.setText("Pago :");

        btnAceptar.setBackground(new java.awt.Color(27, 35, 41));
        btnAceptar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(149, 162, 166));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-derecha-en-círculo-2-20.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setOpaque(true);
        btnAceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-derecha-en-círculo-2-20 (1).png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(149, 162, 166));
        jLabel6.setText("Recibo : ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(149, 162, 166));
        jLabel7.setText("Retorno : ");

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

        txtPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPago.setText("0.00");
        txtPago.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPago.setEnabled(false);

        txtRecibido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtRecibido.setText("0.00");
        txtRecibido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRecibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRecibidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRecibidoKeyReleased(evt);
            }
        });

        txtRetorno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtRetorno.setText("0.00");
        txtRetorno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRetorno.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(btnMinimizar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRetorno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRecibido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPago))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 87, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIndicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Recibir_datos(){
        txtPago.setText(Pago.txtPagoFac.getText());
        txtTarjeta.setText(String.valueOf(fac.getIdTarjeta()));
        txtIndicador.setText(fac.getIndicador());
    }
    
    public void Conseguir_Pago(){
        retorno = fac.Obtener_Pago();
        try{
            while(retorno.next()){
                txtIdPago.setText(retorno.getString(1));
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void Actualizar_Pago(){
        if (!"1".equals(txtPago.getText()) && !txtPago.getText().isEmpty() && "1".equals(txtIndicador.getText())) {
            fac.setPago(Integer.parseInt(txtIdPago.getText()));
            fac.setFactura(Integer.parseInt(txtFactura.getText()));
            
            try{
                JOptionPane.showMessageDialog(this, "Pago "+ fac.getPago() + "Factura "+ fac.getFactura());
                if (fac.Actualizar_factura()) {
                    JOptionPane.showMessageDialog(this, "La Factura se ha actualizado");
                    if (!txtTarjeta.getText().isEmpty()) {
                      cobro();  
                    } else{
//                        JOptionPane.showMessageDialog(this, "La Factura no se ha podido actualizar");
                        int Valor;
                            Connection cn = Conexion.conectar();
                            try {
                                JasperReport jr  = JasperCompileManager.compileReport("src/Reportes/FacturaProducto.jrxml");
                                Map parametro = new HashMap();
                                Valor = Integer.parseInt(txtFactura.getText());
                                parametro.put("id_factura", Valor);
                                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                                JasperViewer jv = new JasperViewer(jp);
                                jv.setVisible(true);
//                                jv.setDefaultCloseOperation(HIDE_ON_CLOSE);

                            } catch (JRException ex) {
                                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                    
                }else{
                        JOptionPane.showMessageDialog(this, "La Factura no se ha podido actualizar");
                }
                
            }
            catch(HeadlessException e)
            {
                System.out.println(e);
            }
        } else if ("2".equals(txtIndicador.getText())) {
            fac.setPago(Integer.parseInt(txtIdPago.getText()));
            fac.setGenerado(Integer.parseInt(txtFactura.getText()));
            try{
                if (fac.Actualizar_Generado()) {
                    JOptionPane.showMessageDialog(this, "La Factura se ha actualizado");
                    if (!txtTarjeta.getText().isEmpty()) {
                      cobro();  
                    }
                    else{
//                        JOptionPane.showMessageDialog(this, "La Factura no se ha podido actualizar");
                        int Valor;
                            Connection cn = Conexion.conectar();
                            try {
                                JasperReport jr  = JasperCompileManager.compileReport("src/Reportes/FacturaGenerado.jrxml");
                                Map parametro = new HashMap();
                                Valor = Integer.parseInt(txtFactura.getText());
                                parametro.put("id_facturaM", Valor);
                                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                                JasperViewer jv = new JasperViewer(jp);
                                jv.setVisible(true);
                                jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);

                            } catch (JRException ex) {
                                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                    
                }
                else{
                        JOptionPane.showMessageDialog(this, "La Factura no se ha podido actualizar");
        
                }
            }
            catch(HeadlessException e)
            {
                System.out.println(e);
            }
        } else if ("3".equals(txtIndicador.getText())) {
            fac.setPago(Integer.parseInt(txtIdPago.getText()));
            fac.setProgramado(Integer.parseInt(txtFactura.getText()));
            try{
                if (fac.Actualizar_Programado()) {
                    JOptionPane.showMessageDialog(this, "La Factura se ha actualizado");
                    if (!txtTarjeta.getText().isEmpty()) {
                      cobro();  
                    } 
                    else{
//                        JOptionPane.showMessageDialog(this, "La Factura no se ha podido actualizar");
                            int Valor;
                            Connection cn = Conexion.conectar();
                            try {
                                JasperReport jr  = JasperCompileManager.compileReport("src/Reportes/FacturaProgramado.jrxml");
                                Map parametro = new HashMap();
                                Valor = Integer.parseInt(txtFactura.getText());
                                parametro.put("id_facturaMP", Valor);
                                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                                JasperViewer jv = new JasperViewer(jp);
                                jv.setVisible(true);
                                jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);

                            } catch (JRException ex) {
                                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                }
                else{
                        JOptionPane.showMessageDialog(this, "La Factura no se ha podido actualizar");
        
                }
            }
            catch(HeadlessException e)
            {
                System.out.println(e);
            }
        }                    
    }
    
    public void cobro(){
        fac.setIdTarjeta(Integer.parseInt(txtTarjeta.getText()));
        fac.setPago(Integer.parseInt(txtIdPago.getText()));
        try{
            if (fac.Agregar_Cobro()) {
                JOptionPane.showMessageDialog(this, "El cobro a su tarjeta a sido solicitado");
                if ("1".equals(txtIndicador.getText())) {
                    int Valor;
                            Connection cn = Conexion.conectar();
                            try {
                                JasperReport jr  = JasperCompileManager.compileReport("src/Reportes/FacturaProducto.jrxml");
                                Map parametro = new HashMap();
                                Valor = Integer.parseInt(txtFactura.getText());
                                parametro.put("id_factura", Valor);
                                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                                JasperViewer jv = new JasperViewer(jp);
                                jv.setVisible(true);
//                                jv.setDefaultCloseOperation(HIDE_ON_CLOSE);

                            } catch (JRException ex) {
                                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }else if ("2".equals(txtIndicador.getText())) {
                    int Valor;
                            Connection cn = Conexion.conectar();
                            try {
                                JasperReport jr  = JasperCompileManager.compileReport("src/Reportes/FacturaGenerado.jrxml");
                                Map parametro = new HashMap();
                                Valor = Integer.parseInt(txtFactura.getText());
                                parametro.put("id_facturaM", Valor);
                                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                                JasperViewer jv = new JasperViewer(jp);
                                jv.setVisible(true);
//                                jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);

                            } catch (JRException ex) {
                                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }else if ("3".equals(txtIndicador.getText())) {
                    int Valor;
                            Connection cn = Conexion.conectar();
                            try {
                                JasperReport jr  = JasperCompileManager.compileReport("src/Reportes/FacturaProgramado.jrxml");
                                Map parametro = new HashMap();
                                Valor = Integer.parseInt(txtFactura.getText());
                                parametro.put("id_facturaMP", Valor);
                                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                                JasperViewer jv = new JasperViewer(jp);
                                jv.setVisible(true);
                                //jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);

                            } catch (JRException ex) {
                                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }
                 
            }
            else{
                JOptionPane.showMessageDialog(this, "El cobro a su tarjeta a sido rechazado");
            }
        }
        catch(HeadlessException e){
            System.out.println(e);
        }
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if (txtIndicador.getText().isEmpty() || txtFactura.getText().isEmpty() || txtRecibido.getText().isEmpty() || txtRecibido.equals("0.00")) {
            JOptionPane.showMessageDialog(this, "Algunos datos de pago no coinciden");
        } else {
            
            double mayor = Double.parseDouble(txtRecibido.getText());
            double menor = Double.parseDouble(txtPago.getText());
            if (menor <= mayor) {
                fac.setMontoPago(menor);
                if(null != txtIndicador.getText())switch (txtIndicador.getText()) {
                    case "1":
                        fac.setNombrePago(txtFactura.getText()+"FacturaProducto");
                        break;
                    case "2":
                        fac.setNombrePago(txtFactura.getText()+"FacturaGenerado");
                        break;
                    case "3":
                        fac.setNombrePago(txtFactura.getText()+"FacturaProgramado");
                        break;
                    default:
                        break;
                }
                
                fac.setMontoRecibo(mayor);
                fac.setMontoRetorno(Double.parseDouble(txtRetorno.getText()));
                try{
                    if (fac.Agregar_Pago()) {
                        JOptionPane.showMessageDialog(this, "Pago Añadido");
                        Conseguir_Pago();
                        if (!txtIdPago.getText().isEmpty()) {
                            Actualizar_Pago();
                        } 
                        else{
                            JOptionPane.showMessageDialog(this, "Imposible Conseguir el Pago");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "El pago no paso");
                    }
                }
                catch(HeadlessException e){
                    System.out.println(e);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "El monto recibido debe de ser mayor o igual al monto a pagar.");
            }
            
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnMinimizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar2ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimizar2ActionPerformed
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
    private void txtRecibidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecibidoKeyPressed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_txtRecibidoKeyPressed

    private void txtRecibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecibidoKeyReleased
        // TODO add your handling code here:
        DecimalFormat Formato = new DecimalFormat("#.00");
        double pago,recibo,reto;
        pago = Double.parseDouble(txtPago.getText());
        recibo = Double.parseDouble(txtRecibido.getText());
        reto= recibo - pago;
        txtRetorno.setText((String.valueOf(formatearDecimales(reto,2))));
    }//GEN-LAST:event_txtRecibidoKeyReleased

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
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnMinimizar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField txtFactura;
    public static javax.swing.JTextField txtIdPago;
    public static javax.swing.JTextField txtIndicador;
    public static javax.swing.JFormattedTextField txtPago;
    public static javax.swing.JFormattedTextField txtRecibido;
    private javax.swing.JFormattedTextField txtRetorno;
    public static javax.swing.JTextField txtTarjeta;
    // End of variables declaration//GEN-END:variables
}