/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;
import Clases.ClaseTiposProducto;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jalex
 */
public class TipoProducto extends javax.swing.JPanel {

    //Pasando los parametros de la tabla.
    static ResultSet Reset;
    
    public TipoProducto() {
        initComponents();
        cargarValores();
        txtID.setVisible(false);
        
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
        tabla_resultado = new javax.swing.JTable();
        txtTipo_producto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnReestablecer = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(42, 51, 56));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/icons8-lista-de-verificación-30.png"))); // NOI18N
        jLabel2.setText("Tipos de Productos :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setIconTextGap(20);

        jLabel1.setForeground(new java.awt.Color(21, 179, 89));

        tabla_resultado.setBackground(new java.awt.Color(42, 51, 56));
        tabla_resultado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        tabla_resultado.setForeground(new java.awt.Color(149, 162, 166));
        tabla_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Tipo de Producto"
            }
        ));
        tabla_resultado.setGridColor(new java.awt.Color(50, 54, 59));
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

        txtTipo_producto.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtTipo_producto.setForeground(new java.awt.Color(50, 54, 59));
        txtTipo_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipo_productoKeyTyped(evt);
            }
        });

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
        jLabel4.setText(" Tipo producto: ");

        jPanel7.setBackground(new java.awt.Color(42, 51, 56));

        btnAgregar.setBackground(new java.awt.Color(27, 35, 41));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(149, 162, 166));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Añadir.png"))); // NOI18N
        btnAgregar.setText("Añadir Elemento");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setOpaque(true);
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Añadir Hover.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(27, 35, 41));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(149, 162, 166));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar Elemento");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setOpaque(true);
        btnActualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Actualizar Hover.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnReestablecer.setBackground(new java.awt.Color(27, 35, 41));
        btnReestablecer.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnReestablecer.setForeground(new java.awt.Color(149, 162, 166));
        btnReestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Editar.png"))); // NOI18N
        btnReestablecer.setText("Reestablecer Lista");
        btnReestablecer.setBorderPainted(false);
        btnReestablecer.setContentAreaFilled(false);
        btnReestablecer.setOpaque(true);
        btnReestablecer.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Editar Hover.png"))); // NOI18N
        btnReestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReestablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpiar.setBackground(new java.awt.Color(42, 51, 56));
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnBuscar))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //Cargando los datos en la tabla.
    public void cargarValores(){
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        //Realizando consulta.
        Reset = Clases.Conexion.Consulta("select * from Tipo_producto");
        try{
            while(Reset.next()){
                //Agregando datos a la tabla.
                Vector valor = new Vector();
                valor.add(Reset.getInt(1));
                valor.add(Reset.getString(2));
                
                modelo.addRow(valor);
                tabla_resultado.setModel(modelo);

                //Ocultando la columna 0.
                tabla_resultado.getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getColumnModel().getColumn(0).setMinWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    //Creando la función para la busqueda.
    public void consulta(){
        String nombre = (txtTipo_producto.getText());
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        //Realizando consulta.
        Reset = Clases.Conexion.Consulta("select * from Tipo_producto where tipo_producto='"+nombre+"'");

        try{
            while(Reset.next()){
                //Agregando datos a la tabla.
                Vector valor = new Vector();
                valor.add(Reset.getInt(1));
                valor.add(Reset.getString(2));
                modelo.addRow(valor);
                tabla_resultado.setModel(modelo);

                //Ocultando la columna 0.
                tabla_resultado.getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getColumnModel().getColumn(0).setMinWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Llamando al metodo de busqueda.
        consulta();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Tomando los datos del formulario y pasandoles a los atributos de la clase.
       if (txtTipo_producto.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Debes completar todos los campos necesarios para continuar el proceso con normalidad.");
       }else{
       
            ClaseTiposProducto obj = new ClaseTiposProducto();
            obj.setTipo(txtTipo_producto.getText());

            if (obj.guardarProyecto()) {
                JOptionPane.showMessageDialog(this, "Datos guardados");
                txtTipo_producto.setText(null);
                cargarValores();
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar datos");
                txtTipo_producto.setText(null);
            }
       }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Tomando los datos del formulario y pasandoles a los atributos de la clase.
       if (txtTipo_producto.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Debes completar todos los campos necesarios para continuar el proceso con normalidad.");
       }else{
               
            ClaseTiposProducto obj = new ClaseTiposProducto();
            obj.setTipo(txtTipo_producto.getText());
            obj.setId_tipo(Integer.parseInt(txtID.getText()));
        
            if (obj.modificarProyecto()) {
              JOptionPane.showMessageDialog(this, "Datos guardados");
              txtTipo_producto.setText(null);
              cargarValores();
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar datos");
                txtTipo_producto.setText(null);
            }
       }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpiando los campos de los formularios.
        txtTipo_producto.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tabla_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_resultadoMouseClicked
        //Mostrando datos de en los lugares establecidos.
        int col = tabla_resultado.getSelectedRow();
        txtID.setText(tabla_resultado.getModel().getValueAt(col, 0).toString());
        txtTipo_producto.setText(tabla_resultado.getModel().getValueAt(col, 1).toString());

    }//GEN-LAST:event_tabla_resultadoMouseClicked

    private void btnReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestablecerActionPerformed
        //Refrescando los datos en la tabla.
        cargarValores();
    }//GEN-LAST:event_btnReestablecerActionPerformed

    //VALIDACIONES DE CAMPOS.
    private void txtTipo_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipo_productoKeyTyped
        //Validando que no se agreguen puntos ni comas.
        
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txtTipo_productoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultado;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTipo_producto;
    // End of variables declaration//GEN-END:variables
}