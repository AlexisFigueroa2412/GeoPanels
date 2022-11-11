/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;

import Clases.ClaseCombo_Productos;
import static geopanels.Producto.res;
import geopanels.Inventariado;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import geopanels.Compra;

/**
 *
 * @author fuent
 */
public class FiltroProduc extends javax.swing.JFrame {

    /**
     * Creates new form FiltroProduc
     */
    public FiltroProduc() {
        initComponents();
        cargarValores();
        txtID.setVisible(false);
        ClaseCombo_Productos h = new ClaseCombo_Productos();
        h.llenarMarca(cmbMarca);
        h.llenarTipo(cmbTipo);
        h.llenarProducto(cmbTipoProducto);
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
        txtSku = new javax.swing.JTextField();
        cmbTipoProducto = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultado = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(27, 35, 41));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Panel.png"))); // NOI18N
        jLabel2.setText("Productos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setIconTextGap(20);

        txtSku.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtSku.setForeground(new java.awt.Color(50, 54, 59));

        cmbTipoProducto.setBorder(null);
        cmbTipoProducto.setOpaque(false);

        txtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(149, 162, 166));
        jLabel4.setText("Nombre :");

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(50, 54, 59));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(149, 162, 166));
        jLabel7.setText("Descripción :");

        btnLimpiar.setBackground(new java.awt.Color(27, 35, 41));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(149, 162, 166));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Toalla.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpiar Campos");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setOpaque(true);
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Toalla Hover.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cmbTipo.setBorder(null);
        cmbTipo.setOpaque(false);

        cmbMarca.setBorder(null);
        cmbMarca.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(149, 162, 166));
        jLabel8.setText("Tipo :");

        tabla_resultado.setBackground(new java.awt.Color(27, 35, 41));
        tabla_resultado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        tabla_resultado.setForeground(new java.awt.Color(149, 162, 166));
        tabla_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "SKU", "Nombre Producto", "descripcion", "precio entrada", "Precio salida", "Marca", "Tipo Producto", "Tipo"
            }
        ));
        tabla_resultado.setGridColor(new java.awt.Color(27, 35, 41));
        tabla_resultado.setOpaque(false);
        tabla_resultado.setSelectionBackground(new java.awt.Color(149, 162, 166));
        tabla_resultado.setSelectionForeground(new java.awt.Color(50, 54, 59));
        tabla_resultado.getTableHeader().setReorderingAllowed(false);
        tabla_resultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_resultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_resultado);

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

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(149, 162, 166));
        jLabel10.setText("SKU: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(149, 162, 166));
        jLabel11.setText("Nombre :");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(149, 162, 166));
        jLabel9.setText("Marca :");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(149, 162, 166));
        jLabel12.setText("Producto:");

        txtDescripcion.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(50, 54, 59));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(txtSku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoProducto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSku)
                    .addComponent(cmbMarca)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        CarritoCompra.txtProducto.setText(txtNombre.getText());
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Consulta();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tabla_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_resultadoMouseClicked
        int col = tabla_resultado.getSelectedRow();
        txtID.setText(tabla_resultado.getModel().getValueAt(col, 0).toString());
        txtSku.setText(tabla_resultado.getModel().getValueAt(col, 1).toString());
        txtNombre.setText(tabla_resultado.getModel().getValueAt(col, 2).toString());
        txtDescripcion.setText(tabla_resultado.getModel().getValueAt(col, 3).toString());
        txtPrecio.setText(tabla_resultado.getModel().getValueAt(col, 4).toString());

        String valor = tabla_resultado.getModel().getValueAt(col, 5).toString();
        ClaseCombo_Productos mostrar = new ClaseCombo_Productos();
        cmbMarca.setSelectedIndex(mostrar.cargarMarca(valor));
        String valor2 = tabla_resultado.getModel().getValueAt(col, 6).toString();
        cmbTipoProducto.setSelectedIndex(mostrar.cargarTipoProducto(valor2));
        String valor3= tabla_resultado.getModel().getValueAt(col, 7).toString();
        cmbTipo.setSelectedIndex(mostrar.cargarTipo(valor3));
    }//GEN-LAST:event_tabla_resultadoMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNombre.setText(null);
        txtSku.setText(null);
        txtPrecio.setText(null);
        txtDescripcion.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed
  
    public void cargarValores(){
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        res = Clases.Conexion.Consulta("select p.id_producto, p.sku, p.nombre_producto, p.descripcion, p.precio_entrada,p.precio_salida, m.marca, t.tipo_producto, l.tipo from Producto p, Marca m, Tipo_producto t, Tipo l where p.id_marca = m.id_marca and p.id_tipo_producto = t.id_tipo_producto and p.id_tipo = l.id_tipo");
        try{
            while(res.next()){
                Vector valor = new Vector();
                valor.add(res.getInt(1));
                valor.add(res.getString(2));
                valor.add(res.getString(3));
                valor.add(res.getString(4));
                valor.add(res.getString(5));
                valor.add(res.getString(6));
                valor.add(res.getString(7));
                valor.add(res.getString(8));
                valor.add(res.getString(9));
                modelo.addRow(valor);
                tabla_resultado.setModel(modelo);

                tabla_resultado.getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getColumnModel().getColumn(0).setMinWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void Consulta(){
        String nombre = (txtNombre.getText());
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        res = Clases.Conexion.Consulta("select p.id_producto, p.sku, p.nombre_producto, p.descripcion, p.precio, m.marca, t.tipo_producto, l.tipo from Producto p, Marca m, Tipo_producto t, Tipo l where p.id_marca = m.id_marca and p.id_tipo_producto = t.id_tipo_producto and p.id_tipo = l.id_tipo and nombre_producto = '"+nombre+"'");
        try{
            while(res.next()){
                Vector valor = new Vector();
                valor.add(res.getInt(1));
                valor.add(res.getString(2));
                valor.add(res.getString(3));
                valor.add(res.getString(4));
                valor.add(res.getString(5));
                valor.add(res.getString(6));
                valor.add(res.getString(7));
                valor.add(res.getString(8));
                modelo.addRow(valor);
                tabla_resultado.setModel(modelo);

                tabla_resultado.getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getColumnModel().getColumn(0).setMinWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    
    
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
            java.util.logging.Logger.getLogger(FiltroProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltroProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltroProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltroProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiltroProduc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Clases.ClaseCombo_Productos> cmbMarca;
    private javax.swing.JComboBox<Clases.ClaseCombo_Productos> cmbTipo;
    private javax.swing.JComboBox<Clases.ClaseCombo_Productos> cmbTipoProducto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultado;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JTextField txtSku;
    // End of variables declaration//GEN-END:variables
}
