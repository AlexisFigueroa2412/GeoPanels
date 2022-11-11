/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;

import Clases.ClaseFactura;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import geopanels.Pago;
import java.sql.SQLException;

/**
 *
 * @author jalex
 */
public class FiltroFactura extends javax.swing.JFrame {
    ClaseFactura fac= new ClaseFactura();
    public static ResultSet retorno;
    /**
     * Creates new form FiltroFactura
     */
    public FiltroFactura() {
        initComponents();
        txtCarrito.setVisible(false);
        txtFactura.setVisible(false);
        txtMontoPago.setVisible(false);
        Llenar_Tabla();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaF = new javax.swing.JTable();
        txtCarrito = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        txtMontoPago = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(27, 35, 41));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setText("Factura : ");

        jLabel1.setForeground(new java.awt.Color(21, 179, 89));

        Tabla.setBackground(new java.awt.Color(27, 35, 41));
        Tabla.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        Tabla.setForeground(new java.awt.Color(149, 162, 166));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N°", "Fecha", "N° Carro", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setGridColor(new java.awt.Color(27, 35, 41));
        Tabla.setOpaque(false);
        Tabla.setSelectionBackground(new java.awt.Color(149, 162, 166));
        Tabla.setSelectionForeground(new java.awt.Color(50, 54, 59));
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jButton3.setBackground(new java.awt.Color(27, 35, 41));
        jButton3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(149, 162, 166));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Buscar.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Buscar Hover.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(149, 162, 166));
        jLabel4.setText("Fecha : ");

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

        TablaF.setBackground(new java.awt.Color(27, 35, 41));
        TablaF.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        TablaF.setForeground(new java.awt.Color(149, 162, 166));
        TablaF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Correlativo", "Producto", "Cantidad", "Precio U."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaF.setEnabled(false);
        TablaF.setGridColor(new java.awt.Color(27, 35, 41));
        TablaF.setOpaque(false);
        TablaF.setSelectionBackground(new java.awt.Color(149, 162, 166));
        TablaF.setSelectionForeground(new java.awt.Color(50, 54, 59));
        TablaF.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaF);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMontoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 290, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void Llenar_Tabla(){
        DefaultTableModel cl = (DefaultTableModel) Tabla.getModel();
        cl.setRowCount(0);
        retorno = fac.Factura();
        try
        {
            while(retorno.next())
            {
                Vector v = new Vector();
                v.add(retorno.getString(1));
                v.add(retorno.getString(2));
                v.add(retorno.getString(3));
                v.add(retorno.getString(4));
//                v.add(retorno.getString(5));
                cl.addRow(v);
                Tabla.setModel(cl);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }  
    }
    public void pasarDatosFila(){
        //Obtenemos los datos
        int filaseleccionada = Tabla.getSelectedRow();
        String identificador = (String)Tabla.getValueAt(filaseleccionada, 0);
        String carro = (String)Tabla.getValueAt(filaseleccionada, 2);
        String fecha = (String)Tabla.getValueAt(filaseleccionada, 1);
        String total = (String)Tabla.getValueAt(filaseleccionada,3);
        //Volcamos los datos de la tabla en los jTextFields.
        txtCarrito.setText(carro);
        txtFactura.setText(identificador);
        txtFecha.setText(fecha);
        txtMontoPago.setText(total);
        Pago.txtProducto.setText(identificador);
        
    }
    public void Filtrar_Elementos(){
        DefaultTableModel cl = (DefaultTableModel) TablaF.getModel();
        cl.setRowCount(0);       
        
        retorno = fac.Filtrar_Carro();
        try
        {
            while(retorno.next())
            {
                Vector v = new Vector();
                v.add(retorno.getString(1));
                v.add(retorno.getString(2));
                v.add(retorno.getString(3));
                v.add(retorno.getString(4));
//                v.add(retorno.getString(5));
                cl.addRow(v);
                TablaF.setModel(cl);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }  
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        pasarDatosFila();
        fac.setIdCarro(Integer.parseInt(txtCarrito.getText()));
        Pago.txtProducto.setText(txtFactura.getText());
        Filtrar_Elementos();
    }//GEN-LAST:event_TablaMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Pago.txtProducto.setText(this.txtFactura.getText());
        Pago.txtPagoFac.setText(this.txtMontoPago.getText());
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FiltroFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltroFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltroFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltroFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiltroFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTable TablaF;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCarrito;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMontoPago;
    // End of variables declaration//GEN-END:variables
}
