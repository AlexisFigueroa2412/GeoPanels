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
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jalex
 */
public class ClaseCarrito {
    
    private Connection cn;
    private Integer id_carrito;
    private String carrito;
    private Integer id_producto;
    private Integer cantidad;
    private String marca;
    private String tipo_producto;
    private String tipo;
    private String nombre;
    private Integer id_elemento;
    
    
    
    //Conexión
    
    public ClaseCarrito()
    {
    Conexion con = new Conexion();
        cn = Conexion.conectar();
    }
    public Connection GetCn()
    {
        return cn;
    }
    public void setCn(Connection cn)
    {
        this.cn = cn;
    }
    
    // Constructores
    
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
    public Integer Getid_producto()
    {
        return id_producto;
    }
    public void setid_producto(Integer id_producto)
    {
        this.id_producto = id_producto;
    }
    public Integer Getcantidad()
    {
        return cantidad;
    }
    public void setcantidad(Integer cantidad)
    {
        this.cantidad = cantidad;
    }
    public String Getmarca()
    {
        return marca;
    }
    public void setmarca(String marca)
    {
        this.marca = marca;
    }
    public String Gettipo_producto()
    {
        return carrito;
    }
    public void settipo_producto(String tipo_producto)
    {
        this.tipo_producto = tipo_producto;
    }
    public String Gettipo()
    {
        return carrito;
    }
    public void settipo(String tipo)
    {
        this.tipo = tipo;
    }
    public String Getnombre()
    {
        return carrito;
    }
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    public Integer Getid_elemento()
    {
    return id_elemento;
    }
    public void setid_elemento(Integer id_elemento)
    {
    this.id_elemento = id_elemento;
    }
    
    // Procesos
    
    //Tablas
    public ResultSet Mostrar_carro()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select elemento_Carrito.id_elemento ,Producto.id_producto,Producto.nombre_producto,elemento_Carrito.cantidad,Producto.precio_salida From elemento_Carrito, Carrito, Producto, Inventario Where elemento_Carrito.id_carrito = Carrito.id_carrito AND elemento_Carrito.id_inventario = Inventario.id_inventariado And Inventario.id_producto = Producto.id_producto AND Carrito.carrito = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);
            
            tabla.setString(1, carrito);
            
            retorno = tabla.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Mostrar_inventario()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select Inventario.id_inventariado, Producto.nombre_producto, Producto.SKU, Inventario.cantidad, Inventario.fecha_ingreso, Marca.marca, Tipo_producto.tipo_producto, Tipo.tipo,Producto.precio_salida From Inventario, Producto, Marca, Tipo_producto, Tipo, Establecimiento Where Inventario.id_establecimiento = Establecimiento.id_establecimiento AND Inventario.id_producto = Producto.id_producto AND Producto.id_marca = Marca.id_marca AND Producto.id_tipo_producto = tipo_producto.id_tipo_producto AND Producto.id_tipo = Tipo.id_tipo";
            PreparedStatement inv = cn.prepareStatement(sql);            
            
            retorno = inv.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Filtrar_inventario()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select Inventario.id_inventariado, Producto.nombre_producto, Producto.SKU, Inventario.cantidad, Inventario.fecha_ingreso, Marca.marca, Tipo_producto.tipo_producto, Tipo.tipo,Producto.precio_salida From Inventario, Producto, Marca, Tipo_producto, Tipo, Establecimiento Where Inventario.id_establecimiento = Establecimiento.id_establecimiento AND Inventario.id_producto = Producto.id_producto AND Producto.id_marca = Marca.id_marca AND Producto.id_tipo_producto = tipo_producto.id_tipo_producto AND Producto.id_tipo = Tipo.id_tipo AND \n" +
            "Producto.nombre_producto like '%"+nombre+"%'";
            PreparedStatement inv = cn.prepareStatement(sql);   
            inv.setString(1, nombre);
//            inv.setString(2, marca);
//            inv.setString(3, tipo_producto);
//            inv.setString(4, tipo);
//            
            retorno = inv.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    //Límitadores
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
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet maximo()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select Inventario.cantidad From Inventario, Producto  Where Inventario.id_producto = Producto.id_producto And Producto.nombre_producto = ?";
            PreparedStatement inv = cn.prepareStatement(sql);   
            inv.setString(1, nombre);            
            
            retorno = inv.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    //Combobox
    public DefaultComboBoxModel Marca()
    {
        DefaultComboBoxModel mark = new DefaultComboBoxModel();
        mark.addElement("Seleccione");
        try{
            String sql = "Select marca from Marca";
            PreparedStatement Markar = cn.prepareStatement(sql);
            ResultSet rs = Markar.executeQuery();
            while(rs.next())
                mark.addElement(rs.getString(1));                
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return mark;
    }
    public DefaultComboBoxModel TipoP()
    {
        DefaultComboBoxModel mark = new DefaultComboBoxModel();
        mark.addElement("Seleccione");
        try{
            String sql = "Select tipo_producto FROM Tipo_producto";
            PreparedStatement Tip = cn.prepareStatement(sql);
            ResultSet rs = Tip.executeQuery();
            while(rs.next())
                mark.addElement(rs.getString(1));                
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return mark;
    }
    public DefaultComboBoxModel Tip()
    {
        DefaultComboBoxModel mark = new DefaultComboBoxModel();
        mark.addElement("Seleccione");
        try{
            String sql = "Select tipo FROM Tipo";
            PreparedStatement Tp = cn.prepareStatement(sql);
            ResultSet rs = Tp.executeQuery();
            while(rs.next())
                mark.addElement(rs.getString(1));                
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return mark;
    }
 
    
    //Crud
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
    public boolean Añadir_elemento()
    {
        boolean resp = false;
        try
        {
            String sql = "Insert into elemento_Carrito(id_carrito,id_inventario,cantidad)"
                         +"Values(?,?,?)";            
            try (PreparedStatement elemento = cn.prepareStatement(sql)) {
                elemento.setInt(1,id_carrito);
                elemento.setInt(2,id_producto);
                elemento.setInt(3,cantidad);
                if (!elemento.execute()) {
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
     
    public boolean Editar_elemento()
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE elemento_Carrito SET id_inventario = ? , cantidad = ? WHERE id_elemento = ? ";            
            try (PreparedStatement update = cn.prepareStatement(sql)) {            
                update.setInt(1,id_producto);
                update.setInt(2,cantidad);
                update.setInt(3,id_elemento);
                if (!update.execute()) {
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
    
    public boolean Quitar_elemento()
    {
        boolean resp = false;
        try
        {
            String sql = "delete from elemento_Carrito where id_elemento = ?;";            
            try (PreparedStatement quitar = cn.prepareStatement(sql)) {
                quitar.setInt(1,id_elemento);
                if (!quitar.execute()) {
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
    public boolean Carrito_Facturado()
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE Carrito SET carrito = ? WHERE id_carrito = ? ";            
            try (PreparedStatement update = cn.prepareStatement(sql)) {            
                update.setString(1,carrito);
                update.setInt(2,id_carrito);
                if (!update.execute()) {
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
    
}

