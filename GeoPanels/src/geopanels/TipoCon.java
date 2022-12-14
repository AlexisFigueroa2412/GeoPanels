/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;

import Clases.ClaseTipoContrato;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jalex
 */
public class TipoCon extends javax.swing.JPanel {
    
    /**
     * Creates new form TipoCon
     */
    
    public static ResultSet retorno;
    
    public TipoCon() {
        initComponents();
        Llenar_Tabla();
        txtID.setVisible(false);
        btnEditar.setEnabled(false);
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
        txtTipo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(42, 51, 56));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Firma.png"))); // NOI18N
        jLabel2.setText("Tipo de Contratos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setIconTextGap(20);

        jLabel1.setForeground(new java.awt.Color(21, 179, 89));

        Tabla.setBackground(new java.awt.Color(42, 51, 56));
        Tabla.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        Tabla.setForeground(new java.awt.Color(149, 162, 166));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Tipo de Contrato"
            }
        ));
        Tabla.setGridColor(new java.awt.Color(50, 54, 59));
        Tabla.setOpaque(false);
        Tabla.setSelectionBackground(new java.awt.Color(149, 162, 166));
        Tabla.setSelectionForeground(new java.awt.Color(50, 54, 59));
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        txtTipo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(50, 54, 59));

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
        btnActualizar.setText("Actualizar Lista");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setOpaque(true);
        btnActualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Actualizar Hover.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(27, 35, 41));
        btnEditar.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(149, 162, 166));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Editar.png"))); // NOI18N
        btnEditar.setText("Editar Elemento");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setOpaque(true);
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Editar Hover.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
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

        txtID.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtID.setForeground(new java.awt.Color(50, 54, 59));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
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

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void Llenar_Tabla()
    {
        ClaseTipoContrato Obj = new ClaseTipoContrato();
        DefaultTableModel tipo = (DefaultTableModel) Tabla.getModel();
        tipo.setRowCount(0);
        retorno = Obj.LlenarTabla();
        try
        {
            while(retorno.next())
            {
                Vector v = new Vector();
                v.add(retorno.getString(1));
                v.add(retorno.getString(2));                
                tipo.addRow(v);
                Tabla.setModel(tipo);
                
                Tabla.getColumnModel().getColumn(0).setMaxWidth(0);
                Tabla.getColumnModel().getColumn(0).setMinWidth(0);
                Tabla.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                Tabla.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }            
    }
    public void pasarDatosFila(){
        //Obtenemos los datos
        int filaseleccionada = Tabla.getSelectedRow();
        String identificador = (String)Tabla.getValueAt(filaseleccionada, 0);
        String tipodelcontrato = (String)Tabla.getValueAt(filaseleccionada, 1);

        //Volcamos los datos de la tabla en los jTextFields.
        txtID.setText(identificador);
        txtTipo.setText(tipodelcontrato);
    }
    private void Llenar_Tabla_Busqueda()
    {
        ClaseTipoContrato Obj = new ClaseTipoContrato();
        
        if (txtTipo.getText().isEmpty()) {
            
        }
        else{
            DefaultTableModel tipo = (DefaultTableModel) Tabla.getModel();
            tipo.setRowCount(0);
            Obj.setContrato(txtTipo.getText());
            retorno = Obj.LlenarTablaFiltro();
            try
            {
                while(retorno.next())
                {
                    Vector v = new Vector();
                    v.add(retorno.getString(1));
                    v.add(retorno.getString(2));                
                    tipo.addRow(v);
                    Tabla.setModel(tipo);
                }
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
                    
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Llenar_Tabla_Busqueda();
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        ClaseTipoContrato Obj = new ClaseTipoContrato();
        if (txtTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Asegurate de no dejar campos vac??os");
        }
        else {
            Obj.setContrato(txtTipo.getText());
            
            try {
                if (Obj.insertarDatos()) {
                    JOptionPane.showMessageDialog(this, "Datos guardados");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error al guardar datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TipoCon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        btnEditar.setEnabled(true);
        btnAgregar.setEnabled(false);        
        pasarDatosFila();
    }//GEN-LAST:event_TablaMouseClicked

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        // TODO add your handling code here:
        btnEditar.setEnabled(true);
        btnAgregar.setEnabled(false);        
        pasarDatosFila();
    }//GEN-LAST:event_TablaMousePressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Llenar_Tabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        ClaseTipoContrato Obj = new ClaseTipoContrato();
        if (txtTipo.getText().isEmpty() || txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Asegurate de no dejar campos vac??os");
        }
        else {
            Obj.setid_Tipo_Contrato(Integer.parseInt(txtID.getText()));
            Obj.setContrato(txtTipo.getText());
            
            try {
                if (Obj.insertarDatos()) {
                    JOptionPane.showMessageDialog(this, "Datos editados");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error al editar datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TipoCon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
