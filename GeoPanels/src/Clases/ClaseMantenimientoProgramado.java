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
import javax.swing.JOptionPane;

/**
 *
 * @author Pardo
 */
public class ClaseMantenimientoProgramado 
{
    private Connection cn;
    private Integer id_mantenimiento_programado;
    private String fechayhora;
    private String descripcion;
    private Integer id_contrato;
    private Integer id_tipo;
    private Integer id_usuario;
    private String estado;
    private Integer idestado;
    
    public ClaseMantenimientoProgramado()
    {
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public Connection GetCn()
    {
        return cn;
    }
    
    public void setCn(Connection cn)
    {
        this.cn = cn;
    }
    
    public Integer Getidestado()
    {
        return idestado;
    }
    public void setidestado(Integer idestado)
    {
        this.idestado = idestado;
    }
    
    public String Getestado()
    {
        return estado;
    }
    
    public void setestado(String estado)
    {
        this.estado = estado;
    }
    
    public Integer Getid_mantenimiento_programado()
    {
        return id_mantenimiento_programado;
    }
    
    public void setid_mantenimiento_programado(Integer id_mantenimiento_programado)
    {
        this.id_mantenimiento_programado = id_mantenimiento_programado;
    }
    
    public String Getfechayhora()
    {
        return fechayhora;
    }
    
    public void setfechayhora(String fechayhora)
    {
        this.fechayhora = fechayhora;
    }
    
    public String Getdescripcion()
    {
        return descripcion;
    }
    
    public void setdescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    public Integer Getid_contrato()
    {
        return id_contrato;
    }
    public void setid_contrato(Integer id_contrato)
    {
        this.id_contrato = id_contrato;
    }
     
    public Integer Getid_tipo()
    {
        return id_tipo;
    }
    public void setid_tipo(Integer id_tipo)
    {
        this.id_tipo = id_tipo;
    }
     
    public Integer Getid_usuario()
    {
        return id_usuario;
    }
    public void setid_usuario(Integer id_usuario)
    {
        this.id_usuario = id_usuario;
    }
     
        public boolean guardarProyecto()
    {
        boolean resp = false;
        try
        {
            String sql = ("Insert Into Mantenimiento_Programado (fechayhora, descripcion, id_contrato, id_tipo, id_usuario, id_estado_mantenimiento)" + "Values (?, ?, ?, ?, ?, ?)");
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, fechayhora);
            cmd.setString(2, descripcion);
            cmd.setInt(3, id_contrato);
            cmd.setInt(4, id_tipo);
            cmd.setInt(5, id_usuario);
            cmd.setInt(6, idestado);
            
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
    
    public boolean modificarMantenimiento()
    {
        boolean resp = false;
        
        try
        {
            String sql = "UPDATE mantenimiento_programado SET fechayhora = ?, descripcion = ?, id_contrato = ?,"
                + "id_tipo = ?, id_usuario = ?, id_estado_mantenimiento = ? WHERE id_mantenimiento_programado = ?;";
            
            PreparedStatement cmd = cn.prepareStatement(sql);            
            
            cmd.setString(1, fechayhora);
            cmd.setString(2, descripcion);
            cmd.setInt(3, id_contrato);
            cmd.setInt(4, id_tipo);
            cmd.setInt(5, id_usuario);
            cmd.setInt(6, idestado);
            cmd.setInt(7, id_mantenimiento_programado);
            
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
    
    public DefaultComboBoxModel Estado()
    {
        DefaultComboBoxModel estado = new DefaultComboBoxModel();
        estado.addElement("Seleccione");
        try
        {
            String sql = "Execute combomarca";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
                estado.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return estado;
    }
    
    public DefaultComboBoxModel Tipo()
    {
        DefaultComboBoxModel estado = new DefaultComboBoxModel();
        estado.addElement("Seleccione");
        try
        {
            String sql = "Execute tiopp";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
                estado.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return estado;
    }
    
    public DefaultComboBoxModel Tecnico()
    {
        DefaultComboBoxModel estado = new DefaultComboBoxModel();
        estado.addElement("Seleccione");
        try
        {
            String sql = "Execute tecnico";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
                estado.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return estado;
    }
    
    public DefaultComboBoxModel Contrato()
    {
        DefaultComboBoxModel estado = new DefaultComboBoxModel();
        estado.addElement("Seleccione");
        try
        {
            String sql = "Execute contra";
            PreparedStatement Estados  = cn.prepareStatement(sql);
            ResultSet rs = Estados.executeQuery();
            while(rs.next())
                estado.addElement(rs.getString(2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return estado;
    }
    
    public int idmetodo(String Dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From estado Where estado = ?";
            PreparedStatement ass = cn.prepareStatement(sql);
            ass.setString(1, Dato);            
            ResultSet pendejo = ass.executeQuery();
            if (pendejo.next()) 
            {
                retorno = pendejo.getInt(1);
            }
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());            
        }
        return retorno;
    }
    
    public int idmetodo2(String Dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From Tipo Where Tipo = ?";
            PreparedStatement ass = cn.prepareStatement(sql);
            ass.setString(1, Dato);            
            ResultSet pendejo = ass.executeQuery();
            if (pendejo.next()) 
            {
                retorno = pendejo.getInt(1);
            }
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());            
        }
        return retorno;
    }
    
    public int idmetodo3(String Dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From contrato Where mensualidad = ?";
            PreparedStatement ass = cn.prepareStatement(sql);
            ass.setString(1, Dato);            
            ResultSet pendejo = ass.executeQuery();
            if (pendejo.next()) 
            {
                retorno = pendejo.getInt(1);
            }
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());            
        }
        return retorno;
    }         
    
    public int idmetodo4(String Dato)
    {
        int retorno = 0;
        try
        {
            String sql = "Select * From usuario Where nombre = ?";
            PreparedStatement ass = cn.prepareStatement(sql);
            ass.setString(1, Dato);            
            ResultSet pendejo = ass.executeQuery();
            if (pendejo.next()) 
            {
                retorno = pendejo.getInt(1);
            }
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());            
        }
        return retorno;
    }         
    
    public ResultSet Obtener_Mantenimiento()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "SELECT id_estado FROM estado_mantenimiento WHERE estado = ?";
            PreparedStatement cmb = cn.prepareStatement(sql);
            cmb.setString(1, estado);
            
            retorno = cmb.executeQuery();        
        }    
        catch(Exception sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
}
