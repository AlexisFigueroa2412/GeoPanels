/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author fuent
 */
public class ClaseCombo_CarritoCompra {
    Conexion com = new Conexion();
    
    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;
    
    
    public ClaseCombo_CarritoCompra(){}
    
    public ClaseCombo_CarritoCompra(String Respuesta, String Respuesta1){
    
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }
    
            public void LlenarComboProveedor(JComboBox <ClaseCombo_CarritoCompra> cmbProveedor){
     
        try{
        
            String sql = "SELECT * FROM Proveedor";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cmbProveedor.addItem(new ClaseCombo_CarritoCompra(
                com.rs.getString("id_proveedor"),
                com.rs.getString("nombre_proveedor")));
            }
        
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }  
        
    }
            public void llenarComboEstablecimiento(JComboBox <ClaseCombo_CarritoCompra> cbxEstablecimiento){
    
        try{
        
            String sql = "SELECT * FROM Establecimiento";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cbxEstablecimiento.addItem(new ClaseCombo_CarritoCompra(
                com.rs.getString("id_establecimiento"),
                com.rs.getString("nombre_establecimiento")));
            }
        
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        } 
            }
            
            
    
                @Override
    public String toString(){
    
        return getRespuesta1();
    }
    
    int resultado1;
    public int CargarProveedor(String valor){
        Reset = Clases.Conexion.Consulta("select * from Proveedor where nombre_proveedor = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado1 = Reset.getInt(1);
                resultado1 = resultado1-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado1;
    }
    
            int resultado2;
    public int CargarProducto(String valor){
        Reset = Clases.Conexion.Consulta("select * from Producto where nombre_producto = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado2 = Reset.getInt(1);
            }
            

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado2;
    }
    int resultado3;
    public int cargarEstablecimiento(String valor){
        Reset = Clases.Conexion.Consulta("select * from Establecimiento where nombre_establecimiento = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado3 = Reset.getInt(1);
                resultado3 = resultado3-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado1;
    }
    
    
    
    
    
    
    
        //////////////////////////////////////////////////////////////////////////////////////////////////      
      
    //ENCAPSULAMIENTO:
    
    /**
     * @return the Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     * @param Respuesta the Respuesta to set
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    /**
     * @return the Respuesta1
     */
    public String getRespuesta1() {
        return Respuesta1;
    }

    /**
     * @param Respuesta1 the Respuesta1 to set
     */
    public void setRespuesta1(String Respuesta1) {
        this.Respuesta1 = Respuesta1;
    }
}
