/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import geopanels.Clientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jalex
 */
public class ClaseCliente {
    
    //Conexión
    private Connection cn;
    
    //Combobox
    private String Departamento;
    private String Municipio;
    //Procesos
    private Integer DepId;
    private Integer MunId;
    //Interfaz
    private Integer ClienteId;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Numero;
    private String DUI;
    private String Direccion;
    
    
    //Procedimientos
    
    //Conexión
    public ClaseCliente()
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
    
    //Constructores
    
    //Combobox
    public String getDepartamento() {
        return Departamento;
    }    
    
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    
    public String getMunicipio() {
        return Municipio;
    }
    
    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }
    
    //Datos
    public Integer getDepId() {
        return DepId;
    }
    
    public void setDepId(Integer DepId) {
        this.DepId = DepId;
    }
    
    public Integer getMunId() {
        return MunId;
    }
    
    public void setMunId(Integer MunId) {
        this.MunId = MunId;
    }
    //Interfaz
    public Integer getClienteId() {
        return ClienteId;
    }
    
        public void setClienteId(Integer ClienteId) {
        this.ClienteId = ClienteId;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public String getCorreo() {
        return Correo;
    }
    
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public String getNumero() {
        return Numero;
    }
    
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    public String getDUI() {
        return DUI;
    }
    
    public void setDUI(String DUI) {
        this.DUI = DUI;
    }
    
    public String getDireccion() {
        return Direccion;
    }
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    //Procesos
    
    //Tablas
    public ResultSet Buscar_Cliente()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select Cliente.id_cliente, Cliente.nombre_cliente, Cliente.apellido_cliente, Cliente.numero_telefonico, Cliente.correo, Cliente.dui, Cliente.direccion, Municipio.municipio from Cliente, Municipio, Departamentos Where Cliente.id_municipio = Municipio.id_municipio AND Departamentos.id_departamento = Municipio.id_departamento "
                    + "AND Cliente.nombre_cliente = ? Or Cliente.apellido_cliente = ? Or Cliente.numero_telefonico = ? OR Cliente.correo = ? OR Cliente.dui = ? OR Municipio.municipio = ? OR Departamentos.departamento = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);    
            tabla.setString(1, Nombre);
            tabla.setString(2, Apellido);
            tabla.setString(3, Numero);
            tabla.setString(4, Correo);
            tabla.setString(5, DUI); 
            tabla.setString(6, Municipio);
            tabla.setString(7, Departamento);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Mostrar_Clientes()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select Cliente.id_cliente, Cliente.nombre_cliente, Cliente.apellido_cliente, Cliente.correo, Cliente.numero_telefonico, Cliente.dui, Cliente.direccion, Municipio.municipio from Cliente, Municipio Where Cliente.id_municipio = Municipio.id_municipio";
            PreparedStatement tabla = cn.prepareStatement(sql);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    //Combobox
    public DefaultComboBoxModel Depto()
    {
        DefaultComboBoxModel dep = new DefaultComboBoxModel();
        dep.addElement("Seleccione");
        try{
            String sql = "select departamento from departamentos order by id_departamento";
            PreparedStatement de = cn.prepareStatement(sql);
            ResultSet rs = de.executeQuery();
            while(rs.next())
                dep.addElement(rs.getString(1));                
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return dep;
    }
    public DefaultComboBoxModel Munc()
    {
        DefaultComboBoxModel mun = new DefaultComboBoxModel();
        mun.addElement("Seleccione");
        try{
            String sql = "select municipio from Municipio where id_departamento = ? order by id_municipio ";
            PreparedStatement mu = cn.prepareStatement(sql);
            mu.setInt(1,DepId);
            ResultSet rs = mu.executeQuery();
            while(rs.next())
                mun.addElement(rs.getString(1));                
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return mun;
    }
    public ResultSet Obtener_MunId()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select MIN(id_municipio) From Municipio  Where municipio = ?";
            PreparedStatement inv = cn.prepareStatement(sql);   
            inv.setString(1, Municipio);            
            
            retorno = inv.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Obtener_DeptoId()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select id_departamento From Municipio  Where municipio = ?";
            PreparedStatement inv = cn.prepareStatement(sql);   
            inv.setString(1, Municipio);            
            
            retorno = inv.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Obtener_DeptoIdby()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select id_departamento From Departamentos  Where departamento = ?";
            PreparedStatement inv = cn.prepareStatement(sql);   
            inv.setString(1, Departamento);            
            
            retorno = inv.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    //Cruds
    public boolean Agregar_Cliente()
    {
        boolean resp = false;
        try
        {
            String sql = "Insert into Cliente(nombre_cliente, apellido_cliente,numero_telefonico, correo, dui, direccion,  id_municipio)" +
            "Values(?,?,?,?,?,?,?)";            
            try (PreparedStatement cliente = cn.prepareStatement(sql)) {
                cliente.setString(1,Nombre);
                cliente.setString(2,Apellido);
                cliente.setString(3,Numero);
                cliente.setString(4,Correo);
                cliente.setString(5,DUI);
                cliente.setString(6,Direccion);
                cliente.setInt(7, MunId);
                if (!cliente.execute())
                {
                    resp = true;
                }
            } 
            //cn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    public boolean Editar_Cliente()
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE Cliente SET nombre_cliente = ?, apellido_cliente = ?, numero_telefonico = ? ,correo = ?, dui = ?, direccion = ?, id_municipio = ? WHERE id_cliente = ? ";            
            PreparedStatement update = cn.prepareStatement(sql);
                        
            update.setString(1,Nombre);
            update.setString(2,Apellido);
            update.setString(3,Numero);
            update.setString(4,Correo);
            update.setString(5,DUI);
            update.setString(6, Direccion);
            update.setInt(7,MunId);
            update.setInt(8,ClienteId);
            
            
            
            if (!update.execute()) 
            {
                resp = true;
            }
            update.close();
            //cn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
}
