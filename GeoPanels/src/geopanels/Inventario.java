/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;
import Clases.ClaseCarrito;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jalex
 */
public class Inventario extends javax.swing.JPanel {

    /**
     * Creates new form Inventario
     */
    public static ResultSet retorno;
ClaseCarrito car = new ClaseCarrito();

    public Inventario() {
        initComponents();
        Llenar_ComboBox();
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
        jLabel6 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSKU = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(42, 51, 56));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Lista.png"))); // NOI18N
        jLabel2.setText("En Inventario");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setIconTextGap(20);

        jLabel1.setForeground(new java.awt.Color(21, 179, 89));

        Tabla.setBackground(new java.awt.Color(27, 35, 41));
        Tabla.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        Tabla.setForeground(new java.awt.Color(149, 162, 166));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Correlativo", "Nombre", "SKU", "Cantidad", "Ingreso", "Marca", "Tipo", "Tp", "Precio Unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jLabel4.setText("Nombre : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(149, 162, 166));
        jLabel6.setText("Tipo : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(149, 162, 166));
        jLabel5.setText("SKU:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3)
                    .addComponent(jLabel6)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Llenar_Tabla_Busqueda();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
     pasarDatosFila();
    }//GEN-LAST:event_TablaMouseClicked
private void Llenar_Tabla()
    {
        DefaultTableModel inv = (DefaultTableModel) Tabla.getModel();
        inv.setRowCount(0);
        retorno = car.Mostrar_inventario();
        try
        {
            while(retorno.next())
            {
                Vector v = new Vector();
                v.add(retorno.getString(1));
                v.add(retorno.getString(2));
                v.add(retorno.getString(3));
                v.add(retorno.getString(4));
                v.add(retorno.getString(5));
                v.add(retorno.getString(6));
                v.add(retorno.getString(7));
                v.add(retorno.getString(8));
                v.add(retorno.getString(9));
                inv.addRow(v);
                Tabla.setModel(inv);
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
        String nombre = (String)Tabla.getValueAt(filaseleccionada, 1);
        String Sku = (String)Tabla.getValueAt (filaseleccionada,2);
        String Tipo = (String)Tabla.getValueAt (filaseleccionada, 7);
        
        
        //Volcamos los datos de la tabla en los jTextFields.
        txtNombre.setText(nombre);
        txtSKU.setText(Sku);
        cmbTipo.setSelectedItem(Tipo);
    }
    private void Llenar_Tabla_Busqueda()
    {
        DefaultTableModel tipo = (DefaultTableModel) Tabla.getModel();
        tipo.setRowCount(0);        
        car.setnombre(txtNombre.getText());
//        car.setmarca(cmbMarca.getSelectedItem().toString());
//        car.settipo_producto(cmbTipoP.getSelectedItem().toString());
//        car.settipo(cmbTipo.getSelectedItem().toString());
        retorno = car.Filtrar_inventario();
        try
        {
            while(retorno.next())
            {
                Vector v = new Vector();
                v.add(retorno.getString(1));
                v.add(retorno.getString(2)); 
                v.add(retorno.getString(3));
                v.add(retorno.getString(4));
                v.add(retorno.getString(5));
                v.add(retorno.getString(6));
                v.add(retorno.getString(7));
                v.add(retorno.getString(8));
                v.add(retorno.getString(9));
                tipo.addRow(v);
                Tabla.setModel(tipo);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        
                    
    }
private void Llenar_ComboBox()
    {
        cmbTipo.setModel(car.Tip());
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSKU;
    // End of variables declaration//GEN-END:variables
}
