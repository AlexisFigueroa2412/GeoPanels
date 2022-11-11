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
public class ClaseCarrito_Compra {

    /**
     * @return the id_establecimiento
     */
    public Integer getId_establecimiento() {
        return id_establecimiento;
    }

    /**
     * @param id_establecimiento the id_establecimiento to set
     */
    public void setId_establecimiento(Integer id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }
    
    private Connection cn;
    private Integer id_carrito;
    private String carrito;
     private Integer id_elemento;
     private Integer id_proveedor;
     private Integer id_producto;
     private int cantidad;
     private Integer id_establecimiento;
     
    public Connection getCn(){
    return cn;
    }
    
    public void setCn(Connection cn){
    this.cn = cn;
    }
        public Integer Getid_carrito()
    {
    return id_carrito;
    }
    public void setid_carrito(Integer id_carrito)
    {
    this.id_carrito = id_carrito;
    }
    public String Getcarrito()
    {
        return carrito;
    }
    public void setcarrito(String carrito)
    {
        this.carrito = carrito;
    }
    public Integer getid_elemento(){
    return id_elemento;
    }
    
    public void setid_elemento(Integer id_elemento){
    this.id_elemento = id_elemento;
    }
    
    public Integer getid_proveedor(){
    return id_proveedor;
    }
    
    public void setid_proveedor(Integer id_proveedor){
    this.id_proveedor = id_proveedor;
    }
    
    public Integer getid_producto(){
    return id_producto;
    }
    
    public void setid_producto(Integer id_producto){
    this.id_producto = id_producto;
    }
    
    public int getcosto(){
    return cantidad;
    }
    
    public void setcantidad(int cantidad){
    this.cantidad = cantidad;
    }
        public ClaseCarrito_Compra(){
        
     Conexion con = new Conexion();
     cn = con.conectar();
    }
    public boolean guardarCarrito(){
    boolean resp = false;
    
    try{
       
        String sql = "INSERT INTO elemento_carrito_compra (id_carrito, id_proveedor, id_producto, cantidad, id_establecimiento)"
                + "VALUES(?,?,?,?,?)";
        
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setInt(1, id_carrito);
         cmd.setInt(2, id_proveedor);
         cmd.setInt(3, id_producto);
         cmd.setInt(4, cantidad);
         cmd.setInt(5, id_establecimiento);
         
         
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
    
    public boolean modificarCarrito(){
    
        boolean resp = false;
        try{
        
            String sql = "UPDATE elemento_carrito_compra SET   id_proveedor = ?, id_producto = ?, cantidad = ?, id_establecimiento = ? WHERE id_elemento = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
        
         cmd.setInt(1, id_proveedor);
         cmd.setInt(2, id_producto);
         cmd.setInt(3, cantidad);
         cmd.setInt(4, id_establecimiento);
         cmd.setInt(5, id_elemento);
         
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

            public boolean CrearCarrito()
    {
        boolean resp = false;
        try
        {
            String sql = "Insert into Carrito(carrito)"
                         +"Values(?)";
            
            try (PreparedStatement carro = cn.prepareStatement(sql)) {
                carro.setString(1,carrito);
                if (!carro.execute()) {
                    resp = true;
                }
                //cn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
                public ResultSet Obtener_carrito()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select id_carrito From Carrito  Where carrito = ?";
            PreparedStatement inv = cn.prepareStatement(sql);   
            inv.setString(1, carrito);            
            
            retorno = inv.executeQuery();
        }
        catch(Exception sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
                public ResultSet Mostrar_carro()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select c.id_elemento,r.carrito, p.nombre_proveedor, d.nombre_producto, c.cantidad, e.nombre_establecimiento From elemento_carrito_compra c,Carrito r, Proveedor  p, Producto d, Establecimiento e where c.id_carrito = r.id_carrito AND c.id_proveedor = p.id_proveedor AND c.id_producto = d.id_producto AND c.id_establecimiento = e.id_establecimiento AND r.carrito = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);
            
            tabla.setString(1, carrito);
            
            retorno = tabla.executeQuery();
        }
        catch(Exception sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }

}

