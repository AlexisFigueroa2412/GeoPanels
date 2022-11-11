/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public class ClaseRecuperador_Permiso {
    
    //Declarando las variables a ocupar.
    int permiso;//Confirmacion de consulta a la base para el admin.
    int confirmacion;//Confirmacion de consulta a la base para el usuario a recuperar.
    static ResultSet Res;//Consulta a la base.   
    public static int Empleado;//Variable para capturar y verificar el nivel del usuario.
    public static int ID_Usuario;//Variable para capturar el id del usuario a recuperar.
    private Connection cn;//Conexion a la base.
    
    //Variables para el proceso de actualizacion.
    private Integer id_usuario;
    private String contraseña;
    private Integer contraGenerica;

    
    public ClaseRecuperador_Permiso(){

        //Establecemos la conexion.
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    //Metodo para la verificacion del administrador.
    public int verificarAdmin(String Usuario, String Contraseña){
    
        //Creando la consulta para la verificacion de la existencia del admin, recuperando su nivel de empleado.
        Res = Clases.Conexion.Consulta("select id_tipo_empleado from Usuario where nombre_usuario ='" +Usuario+"' and contraseña ='" +Contraseña+"'");
        
        try{
            while(Res.next()){
                permiso = 1;
                Empleado = Res.getInt(1);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return permiso;
       }  
    
    //Metodo para la verificacion del usuario a recuperar.
    public int verificarUsuario(String Usuario){
    
        //Creando la consulta para la verificación y existencia del usuario a recuperar.
        Res = Clases.Conexion.Consulta("Select id_usuario From Usuario Where nombre_usuario ='" +Usuario+"'");
        
        try{
            while(Res.next()){
                confirmacion = 1;
                ID_Usuario = Res.getInt(1);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return confirmacion;
       }  
    
    //Metodo para la actualizacion del registro del usuario.
    public boolean actualizarUsuario(){
    
        boolean resp = false;
        try{
        
            String sql = "UPDATE Usuario SET contraseña = ?, contra = ? WHERE id_usuario = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, contraseña);
            cmd.setInt(2, contraGenerica);
            cmd.setInt(3, id_usuario);
                   
            if (!cmd.execute()) {
                resp = true;
            }                   
             cmd.close();
             cn.close();
        }
        catch(Exception ex){
        
            System.out.println(ex.toString());
        }
        return resp;   
    }

    /**
     * @return the id_usuario
     */
    public Integer getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
       
    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the contraGenerica
     */
    public Integer getContraGenerica() {
        return contraGenerica;
    }

    /**
     * @param contraGenerica the contraGenerica to set
     */
    public void setContraGenerica(Integer contraGenerica) {
        this.contraGenerica = contraGenerica;
    }
    
}
 
    

