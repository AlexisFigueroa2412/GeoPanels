/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;
//Librerias a ocupar.
import Clases.ClaseTipos;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jalex
 */
public class Tipos extends javax.swing.JPanel {

    //Pasando los parametros de la tabla.
    static ResultSet Reset;
    
    public Tipos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultado = new javax.swing.JTable();
        txtTipo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 62, 69));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(42, 51, 56));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Categorizar.png"))); // NOI18N
        jLabel2.setText("Tipos");
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
                "Title 1", "Tipo"
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

        txtTipo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(50, 54, 59));
        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
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
        jLabel4.setText(" Tipo : ");

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

        btnRestaurar.setBackground(new java.awt.Color(27, 35, 41));
        btnRestaurar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnRestaurar.setForeground(new java.awt.Color(149, 162, 166));
        btnRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Actualizar.png"))); // NOI18N
        btnRestaurar.setText("Reestablecer Lista");
        btnRestaurar.setBorderPainted(false);
        btnRestaurar.setContentAreaFilled(false);
        btnRestaurar.setOpaque(true);
        btnRestaurar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Actualizar Hover.png"))); // NOI18N
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(27, 35, 41));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(149, 162, 166));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Editar.png"))); // NOI18N
        btnActualizar.setText("Actualizar Elemento");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setOpaque(true);
        btnActualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Editar Hover.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestaurar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton10.setBackground(new java.awt.Color(42, 51, 56));
        jButton10.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jButton10.setForeground(new java.awt.Color(149, 162, 166));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Toalla.png"))); // NOI18N
        jButton10.setText("Limpiar");
        jButton10.setToolTipText("Limpiar Campos");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setOpaque(true);
        jButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Toalla Hover.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //Cargando los datos en la tabla.
    public void cargarValores(){
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        //Realizando Consultas.
        Reset = Clases.Conexion.Consulta("select * from Tipo");
        try{
            while(Reset.next()){
                //Enviando datos a la tabla.
                Vector valor = new Vector();
                valor.add(Reset.getInt(1));
                valor.add(Reset.getString(2));
                
                modelo.addRow(valor);
                tabla_resultado.setModel(modelo);

                //Ocultando columna 0.
                tabla_resultado.getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getColumnModel().getColumn(0).setMinWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                tabla_resultado.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    //Cargando los datos en la tabla.
    public void consulta(){
        String nombre = (txtTipo.getText());
        DefaultTableModel modelo = (DefaultTableModel) tabla_resultado.getModel();
        modelo.setRowCount(0);
        //Realizando consulta.
        Reset = Clases.Conexion.Consulta("select * from Tipo where tipo_producto='"+nombre+"'");

        try{
            while(Reset.next()){
                //Enviando datos a la tabla.
                Vector valor = new Vector();
                valor.add(Reset.getInt(1));
                valor.add(Reset.getString(2));
                modelo.addRow(valor);
                tabla_resultado.setModel(modelo);

                //Ocultando columna 0
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
        // Llamando el metodo de busqueda.
        consulta();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       // Tomando los datos del formulario y pasandoles a los atributos de la clase.

        if(txtTipo.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Debes completar todos los campos necesarios para continuar el proceso con normalidad.");
        }else{
       
           ClaseTipos obj = new ClaseTipos();
            obj.setTipo(txtTipo.getText());
            obj.setId_tipo(Integer.parseInt(txtID.getText()));

             if (obj.guardarProyecto()) {
                JOptionPane.showMessageDialog(this, "Datos guardados");
                txtTipo.setText(null);
                cargarValores();
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar datos");
                txtTipo.setText(null);
            }
       }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Tomando los datos del formulario y pasandoles a los atributos de la clase.

        if(txtTipo.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Debes completar todos los campos necesarios para continuar el proceso con normalidad.");
        }else{
        
            ClaseTipos obj = new ClaseTipos();
            obj.setTipo(txtTipo.getText());
            obj.setId_tipo(Integer.parseInt(txtID.getText()));

             if (obj.modificarProyecto()) {
                JOptionPane.showMessageDialog(this, "Datos guardados");
                txtTipo.setText(null);
                cargarValores();
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar datos");
                txtTipo.setText(null);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tabla_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_resultadoMouseClicked
        // Llevandose los datos a los campos.
        int col = tabla_resultado.getSelectedRow();
        txtID.setText(tabla_resultado.getModel().getValueAt(col, 0).toString());
        txtTipo.setText(tabla_resultado.getModel().getValueAt(col, 1).toString());                                     
    }//GEN-LAST:event_tabla_resultadoMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //Limpiando los campos.
        txtTipo.setText(null);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        // Refrescando la TablaDatos.
        cargarValores();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    //VALIDACIONES DE CAMPOS.
    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        //Validando que no se agreguen numeros.
        
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txtTipoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultado;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}