/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fuent
 */
public class ClaseContrato {
    
    private Connection cn;
    private Integer id_contrato;
    private Double mensualidad;
    private String garantia;
    private String fecha_inicio;
    private String fecha_fin;
    private String rendimiento;
    private Integer costo;
    private Integer produccion;
    private Double recargo;
    private Integer id_cliente;
    private Integer id_tipo_contrato;
    private int codigo;
    
    public Connection getCn(){
    return cn;
    }
    
    public void setCn(Connection cn){
    this.cn = cn;
    }
    
      public Integer getid_contrato(){
      return id_contrato;
    }
      
      public void  setid_contrato(Integer id_contrato){
      this.id_contrato = id_contrato;
      }
      
    public Double getmensualidad(){
   return mensualidad;
}  
    
    public void setmensualidad(Double mensualidad){
    this.mensualidad = mensualidad;
    }
    
    public String getgarantia(){
    return garantia;
    }
    
    public void setgarantia(String garantia){
    this.garantia = garantia;
    }
    
    public String getfecha_inicio(){
    return fecha_inicio;
    }
    public void setfecha_inicio(String fecha_inicio){
    this.fecha_inicio = fecha_inicio;
    }
    
    public String getfecha_fin(){
    return fecha_fin;
    }
    
    public void setfecha_fin(String fecha_fin){
    this.fecha_fin = fecha_fin;
    }
    
    public String getrendimiento(){
    return rendimiento;
    }
    
    public void setrendimiento(String rendimiento){
    this.rendimiento = rendimiento;
    }  
    
    public Integer getcosto(){
    return costo;
    }
    
    public void setcosto(Integer costo){
    this.costo = costo;
    }
    
    public Integer getproduccion(){
    return produccion;
    }
    
    public void setproduccion(Integer produccion){
    this.produccion = produccion;
    }
    
    public Double getrecargo(){
    return recargo;
    }
    
    public void setrecargo(Double recargo){
    this.recargo = recargo;
    }
    
    public Integer getid_cliente(){
    return id_cliente;
    }
    
    public void setid_cliente(Integer id_cliente){
    this.id_cliente = id_cliente;
    }
    
    public Integer getid_tipo_contrato(){
    return id_tipo_contrato;
    }
    
    public void setid_tipo_contrato(Integer id_tipo_contrato){
    this.id_tipo_contrato = id_tipo_contrato;
    }
    public int getcodigo(){
    return codigo;
    }
    
    public void setcodigo(int codigo){
    this.codigo = codigo;
    }
    
    public ClaseContrato(){
     Conexion con = new Conexion();
        cn = con.conectar();
    
     }
    
    public boolean guardarContrato(){
    boolean resp = false;
    
    try{
      
        String sql = "INSERT INTO Contrato (mensualidad, garantia, fecha_inicio,"
                + " fecha_fin, rendimiento, costo,"
                + " produccion, recargo, id_cliente, id_tipo_contrato, codigo)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
         PreparedStatement cmd = cn.prepareStatement(sql);
         
     cmd.setDouble(1,mensualidad);
     cmd.setString(2, garantia);
     cmd.setString(3,fecha_inicio);
     cmd.setString(4, fecha_fin);
     cmd.setString(5, rendimiento);
     cmd.setInt(6, costo);
     cmd.setInt(7, produccion);
     cmd.setDouble(8, recargo);
     cmd.setInt(9, id_cliente);
     cmd.setInt(10, id_tipo_contrato);
     cmd.setInt(11,codigo);
     
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
    
    public boolean modificarContrato(){
    boolean resp = false;
    
    try{
    
        String sql = "Update Contrato Set mensualidad = ?, garantia = ?, fecha_inicio = ?, fecha_fin = ?, rendimiento = ?, costo = ?, produccion = ?, recargo = ?, id_cliente = ?, id_tipo_contrato = ?, codigo = ? Where id_contrato = ?";
         
        PreparedStatement cmd = cn.prepareStatement(sql);
         
     cmd.setDouble(1,mensualidad);
     cmd.setString(2, garantia);
     cmd.setString(3,fecha_inicio);
     cmd.setString(4, fecha_fin);
     cmd.setString(5, rendimiento);
     cmd.setInt(6, costo);
     cmd.setInt(7, produccion);
     cmd.setDouble(8, recargo);
     cmd.setInt(9, id_cliente);
     cmd.setInt(10, id_tipo_contrato);
     cmd.setInt(11,codigo);
     cmd.setInt(12, id_contrato);
    
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
