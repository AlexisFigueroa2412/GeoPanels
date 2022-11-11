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
 * @author jalex
 */
public class ClaseTipoContrato {
    
    private Connection cn;
    private Integer id_TipoCon;
    private String TipoContrato;
    
    //Conexión
    
    public ClaseTipoContrato()
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
    
    
    //Contructores
    
    public Integer Getid_Tipo_Contrato()
    {
    return id_TipoCon;
    }
    public void setid_Tipo_Contrato(Integer id_empresa)
    {
    this.id_TipoCon = id_empresa;
    }
    public String GetContrato()
    {
        return TipoContrato;
    }
    public void setContrato(String TipoContrato)
    {
        this.TipoContrato = TipoContrato;
    }
    
    //Consultas
    
    public boolean insertarDatos() throws SQLException{
        boolean retorno = false;
        try{
         
            String SQL= "INSERT INTO Tipo_contrato(tipo_contrato) VALUES(?)";
            
            PreparedStatement insert = cn.prepareStatement(SQL);
            
            insert.setString(1, TipoContrato);
            
            if (!insert.execute()) 
            {
                retorno = true;
            }
            insert.close();
            cn.close();
            
        }   
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return retorno;
    }
    public boolean EditarDatos()throws SQLException{
        boolean retorno = false;
        
        try{
         
            String SQL= "UPDATE Tipo_contrato SET tipo_contrato = ? WHERE id_tipo_contrato = ? ";
            
            PreparedStatement update = cn.prepareStatement(SQL);
            
            update.setInt(1,id_TipoCon);
            update.setString(2, TipoContrato);
            
            
            if (!update.execute()) 
            {
                retorno = true;
            }
            update.close();
            cn.close();
            
        }   
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        return retorno;
    }
    public ResultSet LlenarTabla()
    {
        ResultSet res = null;
        try
        {
            String sql = "Select * From Tipo_contrato";
            PreparedStatement lista = cn.prepareStatement(sql);
            res = lista.executeQuery();
        }
        catch(Exception sql)
        {
            System.out.println(sql.toString());
        }
        return res;
    }
    public ResultSet LlenarTablaFiltro()
    {
        ResultSet res = null;
        try
        {
            String sql = "Select * From Tipo_contrato WHERE tipo_contrato = ?";
            PreparedStatement busqueda = cn.prepareStatement(sql);
            busqueda.setString(2, TipoContrato);
            res = busqueda.executeQuery();
        }
        catch(Exception sql)
        {
            System.out.println(sql.toString());
        }
        return res;
    }
}
