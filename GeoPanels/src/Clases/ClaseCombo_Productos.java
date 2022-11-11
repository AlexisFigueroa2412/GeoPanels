/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
/**
 *
 * @author Administrador
 */
public class ClaseCombo_Productos {
    
    Conexion com = new Conexion();

    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;

    public ClaseCombo_Productos(){}
    
    public ClaseCombo_Productos(String Respuesta, String Respuesta1) {
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }
    
    public void llenarMarca(JComboBox <ClaseCombo_Productos> cmbMarca){
        try{
            String sql= "SELECT * FROM Marca";
            com.sente= com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            while(com.rs.next()){
                cmbMarca.addItem(new ClaseCombo_Productos(
                com.rs.getString("id_marca"),
                com.rs.getString("marca")));
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void llenarTipo(JComboBox <ClaseCombo_Productos> cmbTipo){
        try{
            String sql= "SELECT * FROM Tipo";
            com.sente= com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            while(com.rs.next()){
                cmbTipo.addItem(new ClaseCombo_Productos(
                com.rs.getString("id_tipo"),
                com.rs.getString("tipo")));
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void llenarProducto(JComboBox <ClaseCombo_Productos> cmbTipoProducto){
        try{
            String sql= "SELECT * FROM Tipo_producto";
            com.sente= com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            while(com.rs.next()){
                cmbTipoProducto.addItem(new ClaseCombo_Productos(
                com.rs.getString("id_tipo_producto"),
                com.rs.getString("tipo_producto")));
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
    
    int val1,val2,val3;
    public int cargarMarca(String valor){
        Reset = Clases.Conexion.Consulta("select * from Marca where marca = '"+valor+"'");

        try{
            while(Reset.next()){
                val1 = Reset.getInt(1);
                val1 = val1-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return val1;
    }
    
    public int cargarTipoProducto(String valor){
        Reset = Clases.Conexion.Consulta("select * from Tipo_producto where tipo_producto = '"+valor+"'");

        try{
            while(Reset.next()){
                val2 = Reset.getInt(1);
                val2 = val2-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return val2;
    }
    
    public int cargarTipo(String valor){
        Reset = Clases.Conexion.Consulta("select * from Tipo where tipo = '"+valor+"'");

        try{
            while(Reset.next()){
                val3 = Reset.getInt(1);
                val3 = val3-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return val3;
    }
    
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
