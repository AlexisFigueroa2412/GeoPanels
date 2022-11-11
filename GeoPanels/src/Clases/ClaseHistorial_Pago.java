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
 * @author Pardo
 */
public class ClaseHistorial_Pago 
{
   private Connection cn;
   private Integer id_factura;
   private String fecha;
   private String subtotal;
   private Integer id_carrito;
   private Integer id_costo;
   private Integer id_cliente;
   private Integer id_impuesto;
   private String Total;
   private Integer id_pago;
   
   public ClaseHistorial_Pago()
   {
       Conexion con = new Conexion();
       cn = con.conectar();       
   }
   
   public String Getfecha()
   {
       return fecha;
   }    
   public void setfecha(String fecha)
   {
       this.fecha = fecha;
   }
   
   public String getsubtotal()
   {
       return subtotal;
   }
   public void setsubtotal(String subtotal)
   {
       this.subtotal = subtotal;
   }
   
   public Integer getid_carrito()
   {
       return id_carrito;
   }
   public void setid_carrito(Integer id_carrito)
   {
       this.id_carrito = id_carrito;
   }
   
   public Integer getid_costo()
   {
       return id_costo;
   }
   public void set(Integer id_costo)
   {
       this.id_costo = id_costo;
   }
   public Integer getid_cliente()
   {
       return id_cliente;
   }
   public void setid_cliente(Integer id_cliente)
   {
       this.id_cliente = id_cliente;
   }
   
   public Integer getid_impuesto()
   {
       return id_impuesto;
   }
   public void setid_impuesto(Integer id_impuesto)
   {
       this.id_impuesto = id_impuesto;
   }
   
   public String gettotal()
   {
       return Total;
   }
   public void settotal(String Total)
   {
       this.Total = Total;
   }
   
   public Integer getid_pago()
   {
       return id_pago;
   }
   public void setid_pago(Integer id_pago)
   {
       this.id_pago = id_pago;
   }
   
}

