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

public class Clase_Rendimiento 
{
    private Connection cn;
    private Integer id_produccion;
    private Integer nombre_producto;
    private String produccion;
    private String nombre;
    
    public Clase_Rendimiento()
    {
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public Connection Getcn()
    {
        return cn;
    }
    public void setCn(Connection cn)
    {
        this.cn = cn;
    }
    
    public Integer Getid_produccion()
    {
        return id_produccion;
    }
    public void setid_produccion(Integer id_produccion)
    {
        this.id_produccion = id_produccion;
    }
    
    public Integer Getnombre_producto()
    {
        return nombre_producto;
    }
    public void setnombre_producto(Integer nombre_producto)
    {
        this.nombre_producto = nombre_producto;
    }
    
    public String Getproduccion()
    {
        return produccion;
    }
    public void setproduccion(String produccion)
    {
        this.produccion = produccion;
    }
    
    public String Getnombre()
    {
        return nombre;
    }
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public boolean guardarProyecto()
    {
        boolean resp = false;
        try
        {
            String sql = "Insert into produccion (produccion, id_producto)" + "Values (?, ?)";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, produccion);
            cmd.setInt(2, nombre_producto);
            
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean modificarProyecto()
    {
        boolean resp = false;
        try
        {
            String sql = "update produccion set id_producto = ?, produccion = ? where id_produccion = ?;";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, this.Getnombre_producto());
            cmd.setString(2, this.Getproduccion());
            cmd.setInt(3, this.Getid_produccion());
            
            if (!cmd.execute()) 
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public DefaultComboBoxModel ComboNombre()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        try
        {
            String sql = "Execute nombre";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            
                modelo.addElement(rs.getString(3));
            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return modelo;
    }
    
    public int MetodoCombo(String metodo)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From Producto Where nombre_producto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, metodo);
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) 
            {
                retorno = rs.getInt(1);
            }
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
}
