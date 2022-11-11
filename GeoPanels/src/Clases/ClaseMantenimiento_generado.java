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
public class ClaseMantenimiento_generado {
    private Connection cn;
    private Integer id_mantenimiento;
    private String fecha;
    private String descripcion;
    private Integer id_contrato;
    private Integer id_tipo;
    private Integer id_usuario;
    private Integer id_estado_mantenimiento;
    
    public Connection getcn(){
    return cn;
    }
    
    public void setcn(Connection cn){
    this.cn = cn;
    }
    
    public Integer getid_mantenimiento(){
    return id_mantenimiento;
    }
    
    public void setid_mantenimiento(Integer id_mantenimiento){
    this.id_mantenimiento = id_mantenimiento;
    }
    
    public String getfecha(){
    return fecha;
    }
    
    public void setfecha(String fecha){
    this.fecha = fecha;
    }
    
    public String getdescripcion(){
    return descripcion;
    }
    
    public void setdescripcion(String descripcion){
    this.descripcion = descripcion;
    }
    
    public Integer getid_contrato(){
    return id_contrato;
    }
    
    public void setid_contrato(Integer id_contrato){
    this.id_contrato = id_contrato;
    }
    
    public Integer getid_tipo(){
    return id_tipo;
    }
    
    public void setid_tipo(Integer id_tipo){
    this.id_tipo = id_tipo;
    }
    
    public Integer getid_usuario(){
    return id_usuario;
    }
    
    public void setid_usuario(Integer id_usuario){
    this.id_usuario = id_usuario;
    }
    
    public Integer getid_estado_mantenimiento(){
    return id_estado_mantenimiento;
    }
    
    public void setid_estado_mantenimiento(Integer id_estado_mantenimiento){
    this.id_estado_mantenimiento = id_estado_mantenimiento;
    }
    
    public ClaseMantenimiento_generado(){
     Conexion con = new Conexion();
     cn = con.conectar();
    }
    
    public boolean guardarMantenimientoGen(){
    boolean resp = false;
    try{
    
        String sql = "INSERT INTO Mantenimiento_generado (fecha, descripcion, id_contrato,"
                + "id_tipo, id_usuario, id_estado_mantenimiento)"
                + "VALUES(?,?,?,?,?,?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, fecha);
            cmd.setString(2, descripcion);
            cmd.setInt(3, id_contrato);
            cmd.setInt(4,id_tipo);
            cmd.setInt(5, id_usuario);
            cmd.setInt(6, id_estado_mantenimiento);
            
            if (!cmd.execute()) {
                  resp = true;
               }
                   
                   cmd.close();
                   cn.close();
        
    }catch(Exception e){
         System.out.println(e.toString());
    }
    return resp;
    }
    
    public boolean modificarMantenimientoGen(){
    boolean resp = false;
    try{
       
        String sql = "UPDATE Mantenimiento_generado SET fecha = ?, descripcion = ?, id_contrato = ?, id_tipo = ?, id_usuario = ?, id_estado_mantenimiento = ? WHERE id_mantenimiento = ? ";
        PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, fecha);
            cmd.setString(2, descripcion);
            cmd.setInt(3, id_contrato);
            cmd.setInt(4,id_tipo);
            cmd.setInt(5, id_usuario);
            cmd.setInt(6, id_estado_mantenimiento);
            cmd.setInt(7, id_mantenimiento);
            
            if (!cmd.execute()) {
                  resp = true;
               }
                   
                   cmd.close();
                   cn.close();
        
    }catch(Exception e){
    System.out.println(e.toString());
    }
    return resp;
    }
}

