/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geopanels;
import Clases.ClaseRecuperador_Permiso;
import Clases.ClaseLogin;
import Clases.Encriptacion;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author jalex
 */
public class Permiso extends javax.swing.JFrame {
    
    public Permiso() {
        initComponents();
        setLocationRelativeTo(null);
        //Bloqueando campos.
        txtUsuario.setEnabled(false);
        txtPassword.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        //Botones.
        btnComprobarUsuario.setEnabled(false);
        btnAceptar.setEnabled(false);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPrimerUso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnComprobarUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnComprobarAdmin = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(27, 35, 41));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(149, 162, 166));
        jLabel1.setText("Permisos de Administrador");

        btnPrimerUso.setBackground(new java.awt.Color(42, 51, 56));
        btnPrimerUso.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnPrimerUso.setForeground(new java.awt.Color(149, 162, 166));
        btnPrimerUso.setText("Volver");
        btnPrimerUso.setBorderPainted(false);
        btnPrimerUso.setContentAreaFilled(false);
        btnPrimerUso.setOpaque(true);
        btnPrimerUso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrimerUsoMouseClicked(evt);
            }
        });
        btnPrimerUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimerUsoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(149, 162, 166));
        jLabel2.setText("Usuario : ");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        btnComprobarUsuario.setBackground(new java.awt.Color(42, 51, 56));
        btnComprobarUsuario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnComprobarUsuario.setForeground(new java.awt.Color(149, 162, 166));
        btnComprobarUsuario.setText("Comprobar");
        btnComprobarUsuario.setBorderPainted(false);
        btnComprobarUsuario.setContentAreaFilled(false);
        btnComprobarUsuario.setOpaque(true);
        btnComprobarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(149, 162, 166));
        jLabel4.setText("Contraseña nueva : ");

        txtConfirmacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmacionKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(149, 162, 166));
        jLabel5.setText("Compruebe Contraseña : ");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(42, 51, 56));
        btnAceptar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(149, 162, 166));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setOpaque(true);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(149, 162, 166));
        jLabel6.setText("Admin : ");

        txtAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdminKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(149, 162, 166));
        jLabel7.setText("Contraseña : ");

        btnComprobarAdmin.setBackground(new java.awt.Color(42, 51, 56));
        btnComprobarAdmin.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnComprobarAdmin.setForeground(new java.awt.Color(149, 162, 166));
        btnComprobarAdmin.setText("Comprobar");
        btnComprobarAdmin.setBorderPainted(false);
        btnComprobarAdmin.setContentAreaFilled(false);
        btnComprobarAdmin.setOpaque(true);
        btnComprobarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarAdminActionPerformed(evt);
            }
        });

        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConfirmacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnComprobarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnComprobarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPrimerUso, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnComprobarAdmin)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprobarUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnPrimerUso))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimerUsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrimerUsoMouseClicked
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrimerUsoMouseClicked

    private void btnPrimerUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimerUsoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPrimerUsoActionPerformed

    private void btnComprobarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarUsuarioActionPerformed
        //Este boton servira para comprobar la existencia del usuario a recuperar.
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre del usuario es de caracter obligatorio para continuar con el proceso, por favor completar el campo para continuar.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
        }else{
        
            //Capturando los datos ingresados.
            String Usuario = txtUsuario.getText();
            
            //Llama a las clases.
            ClaseRecuperador_Permiso Verificar = new ClaseRecuperador_Permiso();//Verificar usuario.
            
            if (Verificar.verificarUsuario(Usuario) == 1) {
                JOptionPane.showMessageDialog(null, "La credencial del Usuario ha sido comprobada exitosamente, por favor proceda a la creación de la nueva contraseña.", "Solicitud Aprobada", JOptionPane.INFORMATION_MESSAGE);
                
                //Desbloqueando campos.
                txtPassword.setEnabled(true);
                txtConfirmacion.setEnabled(true);
                //Boton.
                btnAceptar.setEnabled(true);
                
                //Bloqueando campos.
                txtUsuario.setEnabled(false);
                btnComprobarUsuario.setEnabled(false);
                
                //Capturando el ID y nombre del usuario.
                int id_usuario = Verificar.ID_Usuario;
                txtID.setText(String.valueOf(id_usuario));
                
            }else{
            
                JOptionPane.showMessageDialog(null, "La credencial del Usuario ha sido rechazada, por favor verifique la identificación de dicho usuario.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnComprobarUsuarioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //En este botón se hara la comparación de contraseñas para proceder a la actualizacion del registro.
        if (txtPassword.getText().equals("") || txtConfirmacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El llenado de los campos es de caracter obligatorio para continuar con el proceso, por favor completar los campos para continuar.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
        }else{
        
            if (txtPassword.getText().equals(txtConfirmacion.getText())) {

                //Llamando a la clase.
                ClaseRecuperador_Permiso Contra = new ClaseRecuperador_Permiso();
                
                //Llamando a la encriptacion.
                Encriptacion encriptar = new Encriptacion();
                //Encriptacion.
                String secretKey = "Ejemplo";
                String CadenaAEncriptar = txtConfirmacion.getText();

                //Llevando argumentos al metodo.
                String encriptado = encriptar.encriptar(secretKey, CadenaAEncriptar);
                
                Contra.setContraseña(encriptado);
                
                Contra.setId_usuario(Integer.parseInt(txtID.getText()));
                //Mandando dato quemado para contraseña generica.
                Contra.setContraGenerica(1);
                
                if (Contra.actualizarUsuario()) {
                    JOptionPane.showMessageDialog(null, "El proceso se ha completado con exito, por favor continue al ingreso del usuario al sistema.", "Solicitud Aceptada", JOptionPane.INFORMATION_MESSAGE);
                                    
                    Login lg = new Login();
                    lg.setVisible(true);
                    this.dispose();
                    
                }else{
                 JOptionPane.showMessageDialog(null, "Oops ha ocurrido un error al momento de actualizar la contraseña, verifica la conexión.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
                    System.out.println(encriptado);
                    System.out.println(txtID.getText());
                }

                

            }else{
            
              JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, por favor verificar.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnComprobarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarAdminActionPerformed
        //Este boton se encargara de la comprobacion de los datos ingresados por el admin,
        //para proceder con el proceso de recuperacion.
        if (txtAdmin.getText().equals("") || txtContra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Las credenciales del Admin son de caracter obligatorio, por favor completarlas para continuar.", "Solicitud Denegada", JOptionPane.ERROR_MESSAGE);
        }else{
        
            //Capturando los datos ingresados.
            String Usuario = txtAdmin.getText();
            String Contra = txtContra.getText();

            //Llamando a las clases.
            ClaseRecuperador_Permiso Verificar = new ClaseRecuperador_Permiso();//Verificar usuario.
            ClaseLogin Encriptar = new ClaseLogin();//Tranformar contraseña a encriptada.

            //Pasando la lista de argumentos.
            String contra = Encriptar.EncriptarPalabra(Contra);//Pasando el parametro a encriptar.
            
            if (Verificar.verificarAdmin(Usuario, contra) == 1 && Verificar.Empleado == 3) {
                JOptionPane.showMessageDialog(null, "Las credenciales del Admin han sido comprobadas exitosamente, por favor continuar con el proceso.", "Solicitud Aprobada", JOptionPane.INFORMATION_MESSAGE);
                //Desbloqueando campos.
                txtUsuario.setEnabled(true);
                //Botones.
                btnComprobarUsuario.setEnabled(true);

                //Bloqueando campos.
                txtAdmin.setEnabled(false);
                txtContra.setEnabled(false);
                btnComprobarAdmin.setEnabled(false);
            }else{

                JOptionPane.showMessageDialog(null, "Las credenciales del Admin no coinciden con ningun registro perteneciente a este sistema, por favor verificar.", "Advertencia", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnComprobarAdminActionPerformed

    //VALIDACIONES DE CAMPOS.
    private void txtAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminKeyTyped
        //Validando que no se agreguen numeros.        
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAdminKeyTyped

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        //Validando que no se agreguen puntos ni comas.       
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txtContraKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        //Validando que no se agreguen numeros.        
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        //Validando que no se agreguen puntos ni comas.       
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtConfirmacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmacionKeyTyped
        //Validando que no se agreguen puntos ni comas.       
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar()) ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txtConfirmacionKeyTyped

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
            java.util.logging.Logger.getLogger(Permiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Permiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Permiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Permiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Permiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnComprobarAdmin;
    private javax.swing.JButton btnComprobarUsuario;
    private javax.swing.JButton btnPrimerUso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
