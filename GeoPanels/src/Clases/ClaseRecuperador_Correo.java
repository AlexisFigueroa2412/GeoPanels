/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author fuent
 */
public class ClaseRecuperador_Correo {
    
   private Connection cn;
   private String correo;
   private String contraseña;
   
   public Connection getCn(){
    return cn;
    }
    
    public void setCn(Connection cn){
    this.cn = cn;
    }
    
    public String getcorreo(){
    return correo;
    }
    
    public void setcorreo(String correo){
    this.correo = correo;
    }
    
    public String getcontraseña(){
    return contraseña;
    }
    
    public void setcontraseña(String contraseña){
    this.contraseña = contraseña;
    }
    
    public ClaseRecuperador_Correo(){
    Conexion con = new Conexion();
     cn = con.conectar();
    }
    
        public boolean actualizarContra(){
    boolean resp = false;
    
    try{
    
        String sql = "UPDATE Usuario SET contraseña = ? Where correo = ?";
        PreparedStatement cmd = cn.prepareStatement(sql);
                  
                   
                   cmd.setString(1,contraseña);
                   cmd.setString(2, correo);
                   
                   if (!cmd.execute()) {
                     resp = true;
                   }
                   
                   cmd.close();
                   cn.close();
        
    }
    catch(Exception e){
    
        System.out.println(e.toString());
      }
    return resp;
    }
    
}
