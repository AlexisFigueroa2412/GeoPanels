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
import geopanels.Factura;
import javax.swing.JOptionPane;

/**
 *
 * @author jalex
 */
public class FiltroCarro extends javax.swing.JFrame {

    ClaseFactura fac= new ClaseFactura();
    public static ResultSet retorno;
    
    /**
     * Creates new form FiltroCarro
     */
    public FiltroCarro() {
        initComponents();
        txtIdCarro.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCarritos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDentro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdCarro = new javax.swing.JTextField();
        btnCerrar1 = new javax.swing.JButton();
        btnMinimizar2 = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(27, 35, 41));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setText("Carritos : ");

        tbCarritos.setAutoCreateRowSorter(true);
        tbCarritos.setBackground(new java.awt.Color(27, 35, 41));
        tbCarritos.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        tbCarritos.setForeground(new java.awt.Color(149, 162, 166));
        tbCarritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Correlativo", "Carrito"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCarritos.setGridColor(new java.awt.Color(27, 35, 41));
        tbCarritos.setOpaque(false);
        tbCarritos.setSelectionBackground(new java.awt.Color(149, 162, 166));
        tbCarritos.setSelectionForeground(new java.awt.Color(50, 54, 59));
        tbCarritos.getTableHeader().setReorderingAllowed(false);
        tbCarritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbCarritosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbCarritos);

        btnBuscar.setBackground(new java.awt.Color(27, 35, 41));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(149, 162, 166));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setOpaque(true);
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Buscar Hover.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(149, 162, 166));
        jLabel4.setText("Nombre :");

        btnAceptar.setBackground(new java.awt.Color(27, 35, 41));
        btnAceptar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(149, 162, 166));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-derecha-en-c??rculo-2-20.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setOpaque(true);
        btnAceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-derecha-en-c??rculo-2-20 (1).png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        tbDentro.setAutoCreateRowSorter(true);
        tbDentro.setBackground(new java.awt.Color(27, 35, 41));
        tbDentro.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        tbDentro.setForeground(new java.awt.Color(149, 162, 166));
        tbDentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N??", "Correlativo", "Producto", "Cantidad"
            }
        ));
        tbDentro.setEnabled(false);
        tbDentro.setGridColor(new java.awt.Color(27, 35, 41));
        tbDentro.setOpaque(false);
        tbDentro.setSelectionBackground(new java.awt.Color(149, 162, 166));
        tbDentro.setSelectionForeground(new java.awt.Color(50, 54, 59));
        tbDentro.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbDentro);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(149, 162, 166));
        jLabel6.setText("Carritos : ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(149, 162, 166));
        jLabel7.setText("Elementos : ");

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

        btnRefrescar.setBackground(new java.awt.Color(27, 35, 41));
        btnRefrescar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnRefrescar.setForeground(new java.awt.Color(149, 162, 166));
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Actualizar.png"))); // NOI18N
        btnRefrescar.setText("Actualizar Lista");
        btnRefrescar.setBorderPainted(false);
        btnRefrescar.setContentAreaFilled(false);
        btnRefrescar.setOpaque(true);
        btnRefrescar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Actualizar Hover.png"))); // NOI18N
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnMinimizar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerrar1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnRefrescar)
                                .addContainerGap())))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                    .addComponent(jLabel7))))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinimizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefrescar)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnBuscar)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Llenar_Tabla(){
        DefaultTableModel cl = (DefaultTableModel) tbCarritos.getModel();
        cl.setRowCount(0);
        retorno = fac.Mostrar_Carritos();
        try
        {
            while(retorno.next())
            {
                Vector v = new Vector();
                v.add(retorno.getString(1));
                v.add(retorno.getString(2)); 
                cl.addRow(v);
                tbCarritos.setModel(cl);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }  
    }
    public void Filtrar_Tabla(){
        DefaultTableModel cl = (DefaultTableModel) tbCarritos.getModel();
        cl.setRowCount(0);       
        
        retorno = fac.Filtrar_Elemento();
        try
        {
            while(retorno.next())
            {
                Vector v = new Vector();
                v.add(retorno.getString(1));
                v.add(retorno.getString(2)); 
                cl.addRow(v);
                tbCarritos.setModel(cl);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }  
    }
    public void pasarDatosFila(){
        //Obtenemos los datos
        int filaseleccionada = tbCarritos.getSelectedRow();
        String identificador = (String)tbCarritos.getValueAt(filaseleccionada, 0);
        String nombre = (String)tbCarritos.getValueAt(filaseleccionada, 1);
        //Volcamos los datos de la tabla en los jTextFields.
        txtIdCarro.setText(identificador);
        txtNombre.setText(nombre);
        
    }
    public void Filtrar_Elementos(){
        DefaultTableModel cl = (DefaultTableModel) tbDentro.getModel();
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
                cl.addRow(v);
                tbDentro.setModel(cl);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }  
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        fac.setCarrito(txtNombre.getText());
        fac.setIdCarro(Integer.parseInt(txtIdCarro.getText()));
        Filtrar_Tabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbCarritosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarritosMousePressed
        // TODO add your handling code here:
        pasarDatosFila();
        fac.setCarrito(txtNombre.getText());
        fac.setIdCarro(Integer.parseInt(txtIdCarro.getText()));        
        Filtrar_Elementos();
    }//GEN-LAST:event_tbCarritosMousePressed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if (!txtIdCarro.getText().isEmpty() && !txtNombre.getText().isEmpty()) {
            
            Factura.txtIdCarrito.setText(this.txtIdCarro.getText());
            Factura.txtCarro.setText(this.txtNombre.getText());
            fac.setCarrito(txtNombre.getText());
            retorno = fac.Obtener_Precio();
            try{
                        while(retorno.next())
                        {
                            Factura.txtSubtotal.setText(retorno.getString(1));
                        }
                    }
            catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se pudo obtener el id perteneciente al carrito" + e);
            }
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo obtener el id perteneciente al carrito");
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

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
        Llenar_Tabla();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    /**TX
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
            java.util.logging.Logger.getLogger(FiltroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiltroCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnMinimizar2;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbCarritos;
    private javax.swing.JTable tbDentro;
    private javax.swing.JTextField txtIdCarro;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
