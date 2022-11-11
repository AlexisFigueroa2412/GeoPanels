/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.PreparedStatement;
import java.sql.Connection;
/**
 *
 * @author fuent
 */
public class ClaseTipo_Mantenimiento {
    
     private Connection cn;
    private Integer id_tipo_mantenimiento;
    private String tipo_mantenimiento;
    private Double costo;
    
    public Connection getCn(){
    return cn;
    }
    
    public void setCn(Connection cn){
    this.cn = cn;
    }
    
    public Integer getid_tipo_mantenimiento(){
    return id_tipo_mantenimiento; 
    }
    
    public void setid_tipo_mantenimiento(Integer id_tipo_mantenimiento){
    this.id_tipo_mantenimiento = id_tipo_mantenimiento;
    }
    
    public String gettipo_mantenimiento(){
    return tipo_mantenimiento;
    }
    
    public void settipo_mantenimiento(String tipo_mantenimiento){
    this.tipo_mantenimiento = tipo_mantenimiento;
    }
    
    public Double getcosto(){
    return costo;
    }
    
    public void setcosto(Double costo){
    this.costo = costo;
    }
    
    public ClaseTipo_Mantenimiento(){
     
     Conexion con = new Conexion();
     cn = con.conectar();
    }
    
    public boolean guardarTipoM(){
     boolean resp = false;
     
     try{
              String sql = "INSERT INTO Tipo_mantenimiento(tipo_mantenimiento, costo)"
                      + "VALUES(?,?)";
                      
                   PreparedStatement cmd = cn.prepareStatement(sql);
                  
                   
                   cmd.setString(1,tipo_mantenimiento);
                   cmd.setDouble(2, costo);
                   
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
    
    public boolean actualizarTipoM(){
    boolean resp = false;
    
    try{
    
        String sql = "UPDATE Tipo_mantenimiento SET tipo_mantenimiento = ?, costo = ? WHERE id_tipo_mantenimiento = ?";
        PreparedStatement cmd = cn.prepareStatement(sql);
                  
                   
                   cmd.setString(1,tipo_mantenimiento);
                   cmd.setDouble(2, costo);
                   cmd.setInt(3, id_tipo_mantenimiento);
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
