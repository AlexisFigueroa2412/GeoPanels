/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;
//Librerias.
import javax.swing.JOptionPane;
import Clases.*;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

public class Proveedores extends javax.swing.JPanel {

    static ResultSet res;
    
    public Proveedores() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnReestablecer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultado = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtEmpresa = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(42, 51, 56));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(42, 51, 56));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(42, 51, 56));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Proveedor.png"))); // NOI18N
        jLabel2.setText("Proveedores");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setIconTextGap(20);

        jLabel1.setForeground(new java.awt.Color(21, 179, 89));

        jPanel7.setBackground(new java.awt.Color(42, 51, 56));

        btnAgregar.setBackground(new java.awt.Color(27, 35, 41));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(149, 162, 166));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/A??adir.png"))); // NOI18N
        btnAgregar.setText("A??adir Elemento");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setOpaque(true);
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/A??adir Hover.png"))); // NOI18N
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

        tabla_resultado.setBackground(new java.awt.Color(42, 51, 56));
        tabla_resultado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        tabla_resultado.setForeground(new java.awt.Color(149, 162, 166));
        tabla_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Empresa", "Proveedor", "N??mero de tel??fono", "Correo electronico"
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

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(149, 162, 166));
        jLabel4.setText(" Nombre : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(149, 162, 166));
        jLabel6.setText("Correo : ");

        txtTelefono.setBorder(null);
        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(50, 54, 59));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(149, 162, 166));
        jLabel8.setText("Telefono : ");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(149, 162, 166));
        jLabel9.setText(" Empresa : ");

        txtCorreo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(50, 54, 59));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

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

        txtEmpresa.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtEmpresa.setForeground(new java.awt.Color(50, 54, 59));
        txtEmpresa.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyTyped(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtEmpresa)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //Mostrando los datos en la tabla.
    public void cargarValores(){
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        //Realizando la consulta
        res = Clases.Conexion.Consulta("select * from Proveedor");
        try{
            while(res.next()){
                //Enviando los datos a la tabla.
                Vector valor = new Vector();
                valor.add(res.getInt(1));
                valor.add(res.getString(2));
                valor.add(res.getString(3));
                valor.add(res.getString(4));
                valor.add(res.getString(5));
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
    
    //Realiza la busqueda.
    public void consulta(){
        String nombre = (txtEmpresa.getText());
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        //Creando la consulta.
        res = Clases.Conexion.Consulta("select * from Proveedor where nombre_empresa ='"+nombre+"'");
        try{
            while(res.next()){
                //Enviando valores a la tabla.
                Vector valor = new Vector();
                valor.add(res.getInt(1));
                valor.add(res.getString(2));
                valor.add(res.getString(3));
                valor.add(res.getString(4));
                valor.add(res.getString(5));
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
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         // Tomando los datos del formulario y pasandoles a los atributos de la clase.
        if (txtEmpresa.getText().equals("") || txtNombre.getText().equals("") || txtTelefono.getText().equals("") || txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Es de caracter obligatorio el llenado de todos los campos para continuar con el proceso.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
        }else{
  
           // Patr??n para validar el email.
	   Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");           
           
           // El email a validar.
           String email = txtCorreo.getText();
           
           Matcher mather = pattern.matcher(email);
           
            if (mather.find() == true){
            
                ClaseProveedores obj = new ClaseProveedores();
                obj.setNombre_empresa(txtEmpresa.getText());
                obj.setNombre_proveedor(txtNombre.getText());
                obj.setNumero(txtTelefono.getText());
                obj.setCorreo(txtCorreo.getText());

                if (obj.guardarProyecto()) {
                    JOptionPane.showMessageDialog(this, "Datos guardados");
                    cargarValores();
                    // limpiando campos.
                    txtNombre.setText(null);
                    txtEmpresa.setText(null);
                    txtTelefono.setText(null);
                    txtCorreo.setText(null);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al guardar datos");
                    // limpiando campos.
                    txtNombre.setText(null);
                    txtEmpresa.setText(null);
                    txtTelefono.setText(null);
                    txtCorreo.setText(null);
                }
                
            }else{
            
                JOptionPane.showMessageDialog(null, "El correo ingresado no corresponde a una escritura valida, favor corregirlo", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
            }
        
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       // Tomando los datos del formulario y pasandoles a los atributos de la clase.
        if (txtEmpresa.getText().equals("") || txtNombre.getText().equals("") || txtTelefono.getText().equals("") || txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Es de caracter obligatorio el llenado de todos los campos para continuar con el proceso.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
        }else{
        
           // Patr??n para validar el email.
	   Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");           
           
           // El email a validar.
           String email = txtCorreo.getText();
           
           Matcher mather = pattern.matcher(email);
           
           if (mather.find() == true){
           
                ClaseProveedores obj = new ClaseProveedores();
                obj.setId_proveedor(Integer.parseInt(txtID.getText()));
                obj.setNombre_empresa(txtEmpresa.getText());
                obj.setNombre_proveedor(txtNombre.getText());
                obj.setNumero(txtTelefono.getText());
                obj.setCorreo(txtCorreo.getText());

                if (obj.modificarProyecto()) {
                    JOptionPane.showMessageDialog(this, "Datos Modificados");
                    cargarValores();
                    // limpiando campos.
                    txtNombre.setText(null);
                    txtEmpresa.setText(null);
                    txtTelefono.setText(null);
                    txtCorreo.setText(null);
                }else{
                    JOptionPane.showMessageDialog(this, "Error al Modificar los datos");
                    // limpiando campos.
                    txtNombre.setText(null);
                    txtEmpresa.setText(null);
                    txtTelefono.setText(null);
                    txtCorreo.setText(null);
                }
           }else{
           
                JOptionPane.showMessageDialog(null, "El correo ingresado no corresponde a una escritura valida, favor corregirlo", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
           }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tabla_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_resultadoMouseClicked
       //Mostrando datos de la tabla en los JTextField.
        int col = tabla_resultado.getSelectedRow();
        txtID.setText(tabla_resultado.getModel().getValueAt(col, 0).toString());
        txtEmpresa.setText(tabla_resultado.getModel().getValueAt(col, 1).toString());
        txtNombre.setText(tabla_resultado.getModel().getValueAt(col, 2).toString());
        txtTelefono.setText(tabla_resultado.getModel().getValueAt(col, 3).toString());
        txtCorreo.setText(tabla_resultado.getModel().getValueAt(col, 4).toString());
    }//GEN-LAST:event_tabla_resultadoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        consulta();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestablecerActionPerformed
        // TODO add your handling code here:
        cargarValores();
    }//GEN-LAST:event_btnReestablecerActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiando campos.
        txtNombre.setText(null);
        txtEmpresa.setText(null);
        txtTelefono.setText(null);
        txtCorreo.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //VALIDACIONES DE CAMPOS.
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Validando que no se agreguen numeros.        
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyTyped
        //Validando que no se agreguen numeros.        
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txtEmpresaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultado;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
