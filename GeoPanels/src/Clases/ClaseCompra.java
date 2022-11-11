/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fuent
 */
public class ClaseCompra {
    
    private Connection cn;
    private Integer id_compra;
    private Double total;
    private String descripcion;
    private String fecha;
   
    private Integer id_carrito;
    private Integer id_establecimiento;
    
    private String Carrito;
    
    
    public Connection getCn(){
    return cn;
    }
    
    public void setCn(Connection cn){
    this.cn = cn;
    }
    
    public Integer getid_compra(){
    return id_compra;
    }
    
    public void setid_compra(Integer id_compra){
    this.id_compra = id_compra;
    }
    
    public Double getcantidad(){
    return total;
    }
    
    public void setcantidad(Double total){
    this.total = total;
    }
    
    public String getdescripcion(){
    return descripcion;
    }
    
    public void setdescripcion(String descripcion){
    this.descripcion = descripcion;
    }
    
    public String getfecha(){
    return fecha;
    }
    
    public void setfecha(String fecha){
    this.fecha = fecha;
    }
    

    
    public Integer getid_carrito(){
    return id_carrito;
    }
    
    public void setid_carrito(Integer id_carrito){
    this.id_carrito = id_carrito;
    }
    public Integer getid_establecimiento(){
    return id_establecimiento;
    }
    
    public void setid_establecimiento(Integer id_establecimiento){
    this.id_establecimiento = id_establecimiento;
    }
        public String getCarrito() {
        return Carrito;
    }
    
    public void setCarrito(String Carrito) {
        this.Carrito = Carrito;
    }
    
    public ClaseCompra(){
        
     Conexion con = new Conexion();
     cn = con.conectar();
    }
    
    public boolean guardarCompra(){
    boolean resp = false;
    try{
      
        String sql = "INSERT INTO Compra(total,descripcion,fecha,"
                + " id_carrito, id_establecimiento)"
                + "VALUES(?,?,?,?,?)";
        
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setDouble(1, total);
            cmd.setString(2, descripcion);
            cmd.setString(3, fecha);
           
            cmd.setInt(4, id_carrito);
            cmd.setInt(5, id_establecimiento);
            
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
    
    public boolean actualizarCompra(){
    boolean resp = false;
    
    try{
        
    String sql = "UPDATE Compra SET total = ?, descripcion = ?, fecha = ?, id_carrito = ?, id_establecimiento = ? WHERE id_compra = ?";
        
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setDouble(1, total);
            cmd.setString(2, descripcion);
            cmd.setString(3, fecha);
           
            cmd.setInt(4, id_carrito);
            cmd.setInt(5, id_establecimiento);
            cmd.setInt(6,id_compra);
            
            if (!cmd.execute()) {
                  resp = true;
               }
                   
                   cmd.close();
                   cn.close();
    }
    catch(SQLException e){
    
    }
    return resp;
    }
    
     public ResultSet Obtener_Precio()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select SUM  (Producto.precio_entrada * elemento_carrito_compra.cantidad) As 'Total' From elemento_carrito_compra, Producto, Carrito Where elemento_carrito_compra.id_producto = Producto.id_producto AND Carrito.carrito = ?";
            
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setString(1, Carrito);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
}
