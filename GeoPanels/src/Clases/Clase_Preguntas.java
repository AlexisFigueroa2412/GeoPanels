/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pardo
 */
public class Clase_Preguntas 
{
    private Connection cn;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private String nombre_usuario;
    private String contraseña;
    private Integer pregunta1;
    private Integer pregunta2;
    private Integer pregunta3;
    private Integer pregunta4;
    private Integer usuario;
    private Integer id_respuesta;
    
    public Connection getCn()
    {
        return cn;
    }
    
    public void setCn(Connection cn)
    {
        this.cn = cn;
    }
    
    public Clase_Preguntas()
    {
     Conexion con = new Conexion();
     cn = con.conectar();
    }
    
    public String getrespuesta1()
    {
        return respuesta1;
    }
    
    public void setrespuesta1(String respuesta1)
    {
        this.respuesta1 = respuesta1;
    }
    
    public String getrespuesta2()
    {
        return respuesta2;
    }
    
    public void setrespuesta2(String respuesta2)
    {
        this.respuesta2 = respuesta2;
    }
    
    public String getrespuesta3()
    {
        return respuesta3;
    }
    
    public void setrespuesta3(String respuesta3)
    {
        this.respuesta3 = respuesta3;
    }
    
    public String getrespuesta4()
    {
        return respuesta4;
    }
    
    public void setrespuesta4(String respuesta4)
    {
        this.respuesta4 = respuesta4;
    }
    
    public String getnombre_usuario()
    {
        return nombre_usuario;
    }
    
    public void setnombre_usuario(String nombre_usuario)
    {
        this.nombre_usuario = nombre_usuario;
    }
    
    public String getcontraseña()
    {
        return contraseña;
    }
    
    public void setcontraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }
    
    public Integer getpregunta1()
    {
        return pregunta1;
    }
    
    public void setpregunta1(Integer pregunta1)
    {
        this.pregunta1 = pregunta1;
    }
    
    public Integer getpregunta2()
    {
        return pregunta2;
    }
    
    public void setpregunta2(Integer pregunta2)
    {
        this.pregunta2 = pregunta2;
    }
    
    public Integer getpregunta3()
    {
        return pregunta3;
    }
    
    public void setpregunta3(Integer pregunta3)
    {
        this.pregunta3 = pregunta3;
    }
    
    public Integer getpregunta4()
    {
        return pregunta4;
    }
    
    public void setpregunta4(Integer pregunta4)
    {
        this.pregunta4 = pregunta4;
    }
    
    public Integer getusuario()
    {
        return usuario;
    }
    
    public void setusuario(Integer usuario)
    {
        this.usuario = usuario;
    }
    
    public Integer getid_respuesta()
    {
        return id_respuesta;
    }
    
    public void setid_respuesta(Integer id_respuesta)
    {
        this.id_respuesta = id_respuesta;
    }
    
    public boolean agregarRespuestas()
    {
        boolean resp = false;
        try
        {
            String sql = "Insert Into Respuestas (id_usuario, id_pregunta1, respuesta1, id_pregunta2, respuesta2, id_pregunta3, respuesta3, id_pregunta4, repuesta4)" + "Values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, usuario);
            cmd.setInt(2, pregunta1);
            cmd.setString(3, respuesta1);
            cmd.setInt(4, pregunta2);
            cmd.setString(5, respuesta2);
            cmd.setInt(6, pregunta3);
            cmd.setString(7, respuesta3);
            cmd.setInt(8, pregunta4);
            cmd.setString(9, respuesta4);
            
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
    
    public boolean modificarContraseña()
    {
        boolean resp = false;
        
        try
        {
            String sql = "Update Usuario Set contraseña = ? WHERE id_usuario = ?";
             PreparedStatement cmd = cn.prepareStatement(sql);
             
            cmd.setInt(1, id_respuesta); 
            cmd.setInt(2, usuario);
            cmd.setInt(3, pregunta1);
            cmd.setString(4, respuesta1);
            cmd.setInt(5, pregunta2);
            cmd.setString(6, respuesta2);
            cmd.setInt(7, pregunta3);
            cmd.setString(8, respuesta3);
            cmd.setInt(9, pregunta4);
            cmd.setString(10, respuesta4);
            
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
    
    public boolean consultarUsuario()
    {
        ResultSet res;
        boolean resp = false;
        try
        {
            String sql = "Select * From Usuario Where nombre_usuario = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre_usuario);
            res = cmd.executeQuery();
            if (res.next()) 
            {
                resp = true;                
                usuario = res.getInt(1);
            }            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean consultarRespuestas()
    {
        ResultSet res;
        boolean resp = false;
        try
        {
            String sql = "Select * From Respuestas Where respuesta1 = ? and respuesta2 = ? and respuesta3 = ? and respuesta4 = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, respuesta1);
            cmd.setString(2, respuesta2);
            cmd.setString(3, respuesta3);
            cmd.setString(4, respuesta4);
            res = cmd.executeQuery();
            if (res.next()) 
            {
                resp = true;
            }            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean reestablecerContraseña()
    {
        boolean resp = false;
        try
        {
            String sql = "Update Usuario SET contraseña = ? Where id_usuario = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);            
            cmd.setString(1, contraseña);
            cmd.setInt(2, usuario);
            cmd.executeUpdate();   
            resp = true;                      
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public DefaultComboBoxModel Pregunta1()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        try
        {
            String sql = "Execute pregunta1";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
            modelo.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return modelo;
    }
    
    public DefaultComboBoxModel Pregunta2()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        try
        {
            String sql = "Execute pregunta2";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
            modelo.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return modelo;
    }
    
    public DefaultComboBoxModel Pregunta3()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        try
        {
            String sql = "Execute pregunta3";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
            modelo.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return modelo;
    }
    
    public DefaultComboBoxModel Pregunta4()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        try
        {
            String sql = "Execute pregunta4";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
            modelo.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return modelo;
    }
    
    public int metodo1(String dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From Preguntas Where pregunta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, dato);
            ResultSet res = cmd.executeQuery();
            if (res.next()) 
            {
                retorno = res.getInt(1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return retorno;
    }
    
    public int metodo2(String dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From Preguntas Where pregunta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, dato);
            ResultSet res = cmd.executeQuery();
            if (res.next()) 
            {
                retorno = res.getInt(1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return retorno;
    }
    
    public int metodo3(String dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From Preguntas Where pregunta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, dato);
            ResultSet res = cmd.executeQuery();
            if (res.next()) 
            {
                retorno = res.getInt(1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return retorno;
    }
    
    public int metodo4(String dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From Preguntas Where pregunta = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, dato);
            ResultSet res = cmd.executeQuery();
            if (res.next()) 
            {
                retorno = res.getInt(1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return retorno;
    }
}
