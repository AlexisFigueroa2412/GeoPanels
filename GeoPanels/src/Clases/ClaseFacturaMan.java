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
public class ClaseFacturaMan {
    
    //Conexión
    private Connection cn;
    //Busqueda
    private String Cliente;
    private String Empleado;
    //
    private String Fecha;
    private Integer Mantenimiento;
    private Double Sub;
    private Integer Impuesto;
    private Double Total;
    private Integer Pago;
    
    public ClaseFacturaMan()
    {
    Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the Empleado
     */
    public String getEmpleado() {
        return Empleado;
    }

    /**
     * @param Empleado the Empleado to set
     */
    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Mantenimiento
     */
    public Integer getMantenimiento() {
        return Mantenimiento;
    }

    /**
     * @param Mantenimiento the Mantenimiento to set
     */
    public void setMantenimiento(Integer Mantenimiento) {
        this.Mantenimiento = Mantenimiento;
    }

    /**
     * @return the Sub
     */
    public Double getSub() {
        return Sub;
    }

    /**
     * @param Sub the Sub to set
     */
    public void setSub(Double Sub) {
        this.Sub = Sub;
    }

    /**
     * @return the Impuesto
     */
    public Integer getImpuesto() {
        return Impuesto;
    }

    /**
     * @param Impuesto the Impuesto to set
     */
    public void setImpuesto(Integer Impuesto) {
        this.Impuesto = Impuesto;
    }

    /**
     * @return the Total
     */
    public Double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(Double Total) {
        this.Total = Total;
    }

    /**
     * @return the Pago
     */
    public Integer getPago() {
        return Pago;
    }

    /**
     * @param Pago the Pago to set
     */
    public void setPago(Integer Pago) {
        this.Pago = Pago;
    }
    
    //Tablas
    
    //Mantenimeinto
    
     public ResultSet Mostrar_Mantenimiento()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select m.id_mantenimiento,m.fecha,m.descripcion, t.Nombre_cliente,u.nombre_usuario,tm.costo from Mantenimiento_Generado m , Contrato c, Usuario u, Cliente t,Tipo_mantenimiento tm where m.id_contrato = c.id_contrato and c.id_cliente = t.id_cliente and u.id_usuario = m.id_usuario and m.id_tipo = tm.id_tipo_mantenimiento AND m.id_estado_mantenimiento = 2 order by m.id_mantenimiento desc";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
     public ResultSet Filtrar_MantenimientoUsuario()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select m.id_mantenimiento,m.fecha,m.descripcion, t.Nombre_cliente,u.nombre_usuario,tm.costo from Mantenimiento_Generado m , Contrato c, Usuario u, Cliente t,Tipo_mantenimiento tm where m.id_contrato = c.id_contrato and c.id_cliente = t.id_cliente and u.id_usuario = m.id_usuario and m.id_tipo = tm.id_tipo_mantenimiento AND m.id_estado_mantenimiento = 2"
                    + "and u.nombre like '%"+Empleado+"%' order by m.id_mantenimiento desc";
            PreparedStatement tabla = cn.prepareStatement(sql);
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
      public ResultSet Filtrar_MantenimientoCliente()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select m.id_mantenimiento,m.fecha,m.descripcion, t.Nombre_cliente,u.nombre_usuario,tm.costo from Mantenimiento_Generado m , Contrato c, Usuario u, Cliente t,Tipo_mantenimiento tm where m.id_contrato = c.id_contrato and c.id_cliente = t.id_cliente and u.id_usuario = m.id_usuario and m.id_tipo = tm.id_tipo_mantenimiento AND m.id_estado_mantenimiento = 2"
                    + "and t.nombre_cliente like '%"+Cliente+"%' order by m.id_mantenimiento desc";
            PreparedStatement tabla = cn.prepareStatement(sql); 
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
      
      //Mantenimiento Programado
      
      public ResultSet Mostrar_MantenimientoP()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select m.id_mantenimiento_programado,m.fechayhora,m.descripcion, t.Nombre_cliente,u.nombre_usuario,c.mensualidad from Mantenimiento_Programado m , Contrato c, Usuario u, Cliente t,Tipo_mantenimiento tm where m.id_contrato = c.id_contrato and c.id_cliente = t.id_cliente and u.id_usuario = m.id_usuario and m.id_tipo = tm.id_tipo_mantenimiento AND m.id_estado_mantenimiento = 2 order by m.id_mantenimiento_programado desc";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
       public ResultSet Filtrar_MantenimientoClienteP()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select m.id_mantenimiento_programado,m.fechayhora,m.descripcion, t.Nombre_cliente,u.nombre_usuario,c.mensualidad from Mantenimiento_Programado m , Contrato c, Usuario u, Cliente t,Tipo_mantenimiento tm where m.id_contrato = c.id_contrato and c.id_cliente = t.id_cliente and u.id_usuario = m.id_usuario and m.id_tipo = tm.id_tipo_mantenimiento AND m.id_estado_mantenimiento = 2"
                    + "and t.nombre_cliente like '%"+Cliente+"%' order by m.id_mantenimiento_programado desc";
            PreparedStatement tabla = cn.prepareStatement(sql); 
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
       public ResultSet Filtrar_MantenimientoUsuarioP()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select m.id_mantenimiento_programado,m.fechayhora,m.descripcion, t.Nombre_cliente,u.nombre_usuario,c.mensualidad from Mantenimiento_Programado m , Contrato c, Usuario u, Cliente t,Tipo_mantenimiento tm where m.id_contrato = c.id_contrato and c.id_cliente = t.id_cliente and u.id_usuario = m.id_usuario and m.id_tipo = tm.id_tipo_mantenimiento AND m.id_estado_mantenimiento = 2"
                    + "and u.nombre like '%"+Empleado+"%' order by m.id_mantenimiento_programado desc";
            PreparedStatement tabla = cn.prepareStatement(sql);
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    
      
      //Facturación
      
      public boolean Añadir_factura()
    {
        boolean resp = false;        
        try
        {
            String sql = "insert into Factura_Mantenimiento(fecha, subtotal, id_mantenimiento, id_impuesto,total,id_pago) Values(?,?,?,?,?,?)";            
            PreparedStatement elemento = cn.prepareStatement(sql);
            
            elemento.setString(1,Fecha);
            elemento.setDouble(2,Sub);
            elemento.setInt(3,Mantenimiento);
            elemento.setInt(4,Impuesto);
            elemento.setDouble(5,Total);            
            elemento.setInt(6, Pago);
            
            
            if (!elemento.execute()) 
            {
                resp = true;
            }
            elemento.close();
            //cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
      public boolean Añadir_facturaP()
    {
        boolean resp = false;        
        try
        {
            String sql = "Insert into Factura_Mantenimiento_Programado(fecha, id_mantenimiento_programado, subtotal,id_impuesto,total,id_pago) Values(?,?,?,?,?,?);";            
            PreparedStatement elemento = cn.prepareStatement(sql);
            
            elemento.setString(1,Fecha);
            elemento.setInt(2,Mantenimiento);
            elemento.setDouble(3,Sub);
            elemento.setInt(4,Impuesto);
            elemento.setDouble(5,Total);            
            elemento.setInt(6, Pago);
            
            
            if (!elemento.execute()) 
            {
                resp = true;
            }
            elemento.close();
            //cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    
}
