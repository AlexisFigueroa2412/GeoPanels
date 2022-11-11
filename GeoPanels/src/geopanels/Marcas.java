/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;
//Librerias a ocupar.
import Clases.ClaseMarcas;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Marcas extends javax.swing.JPanel {

    //Pasando los parametros de la tabla.
    static ResultSet result;
    
    public Marcas() {
        initComponents();
        cargarMarcas();
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

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnReestablecer = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(42, 51, 56));
        setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(42, 51, 56));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(149, 162, 166));
        jLabel4.setText("Marcas");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel4.setIconTextGap(20);

        jLabel5.setForeground(new java.awt.Color(21, 179, 89));

        TablaDatos.setBackground(new java.awt.Color(42, 51, 56));
        TablaDatos.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        TablaDatos.setForeground(new java.awt.Color(149, 162, 166));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Marcas de Paneles"
            }
        ));
        TablaDatos.setGridColor(new java.awt.Color(50, 54, 59));
        TablaDatos.setOpaque(false);
        TablaDatos.setSelectionBackground(new java.awt.Color(149, 162, 166));
        TablaDatos.setSelectionForeground(new java.awt.Color(50, 54, 59));
        TablaDatos.getTableHeader().setReorderingAllowed(false);
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaDatos);

        txtMarca.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(50, 54, 59));
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(149, 162, 166));
        jLabel6.setText("Marca :");

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

        jPanel8.setBackground(new java.awt.Color(42, 51, 56));

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(462, 462, 462)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscar))
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //Cargando los datos en la tabla.
    public void cargarMarcas(){

        DefaultTableModel modelo = (DefaultTableModel) TablaDatos.getModel();
        modelo.setRowCount(0);

        //Realizando consulta.
        result = Clases.Conexion.Consulta("select * from Marca");

        try{

            while(result.next()){

                //Agregando datos a la tabla.
                Vector datos = new Vector();
                datos.add(result.getInt(1));
                datos.add(result.getString(2));
                modelo.addRow(datos);
                TablaDatos.setModel(modelo);

                //Ocultando la columna 0.
                TablaDatos.getColumnModel().getColumn(0).setMaxWidth(0);
                TablaDatos.getColumnModel().getColumn(0).setMinWidth(0);
                TablaDatos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                TablaDatos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //Creando la función para la busqueda.
    public void busqueda(){

        String valor = txtMarca.getText();
        DefaultTableModel modelo = (DefaultTableModel) TablaDatos.getModel();
        modelo.setRowCount(0);

        //Realizando consulta.
        result = Clases.Conexion.Consulta("select * from Marca where marca = '"+valor+"'");

        try{

            while(result.next()){

                //Agregando datos a la tabla.
                Vector datos = new Vector();
                datos.add(result.getInt(1));
                datos.add(result.getString(2));
                modelo.addRow(datos);
                TablaDatos.setModel(modelo);

                //Ocultando la columna 0.
                TablaDatos.getColumnModel().getColumn(0).setMaxWidth(0);
                TablaDatos.getColumnModel().getColumn(0).setMinWidth(0);
                TablaDatos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                TablaDatos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       // Tomando los datos del formulario y pasandoles a los atributos de la clase.

       if (txtMarca.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Debes completar todos los campos necesarios para continuar el proceso con normalidad.");
        }else{
       
           ClaseMarcas obj = new ClaseMarcas();

        obj.setMarca(txtMarca.getText());

        if (obj.guardarProyecto()) {
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            txtMarca.setText(null);
            cargarMarcas();

        }else{

           JOptionPane.showMessageDialog(null, "Error al guardar datos"); 
           txtMarca.setText(null);
        }
       }  
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Tomando los datos del formulario y pasandoles a los atributos de la clase.

        if (txtMarca.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Debes completar todos los campos necesarios para continuar el proceso con normalidad.");
        }else{
        
        ClaseMarcas obj = new ClaseMarcas();

        obj.setId_marca(Integer.parseInt(txtID.getText()));
        obj.setMarca(txtMarca.getText());

        if (obj.modificarProyecto()) {
            JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");
            txtMarca.setText(null);
            cargarMarcas();

        }else{

           JOptionPane.showMessageDialog(null, "Error al modificar los datos"); 
           txtMarca.setText(null);
        }
      }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestablecerActionPerformed
        // Refrescando la TablaDatos.
        cargarMarcas();
    }//GEN-LAST:event_btnReestablecerActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        // Llevandose los datos a los campos.
        int col = TablaDatos.getSelectedRow();
        txtID.setText(TablaDatos.getModel().getValueAt(col, 0).toString());
        txtMarca.setText(TablaDatos.getModel().getValueAt(col, 1).toString());
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Llamando el metodo de busqueda.
        busqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Limpiando campos.
        txtMarca.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //VALIDACIONES DE CAMPOS.
    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        //Validando que no se agreguen numeros.       
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }   
    }//GEN-LAST:event_txtMarcaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReestablecer;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
