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
public class ClaseCombo_Contrato {
    
    Conexion com = new Conexion();
    
    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;
    
    public ClaseCombo_Contrato() {}
    
    public ClaseCombo_Contrato(String Respuesta, String Respuesta1){
        
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }

    
    
        public void LlenarComboTipoContrato(JComboBox <ClaseCombo_Contrato> cbxTipoContrato){
    
        try{
        
            String sql = "SELECT * FROM Tipo_Contrato";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cbxTipoContrato.addItem(new ClaseCombo_Contrato(
                com.rs.getString("id_tipo_contrato"),
                com.rs.getString("tipo_contrato")));
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
    public int CargarTipoContrato(String valor){
        Reset = Clases.Conexion.Consulta("select * from Tipo_Contrato where tipo_contrato = '"+valor+"'");

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
    public int CargarCliente(String valor){
        Reset = Clases.Conexion.Consulta("select * from Cliente where nombre_cliente = '"+valor+"'");

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
    public int CargarCosto(String valor){
        Reset = Clases.Conexion.Consulta("select * from tipo_mantenimiento where tipo_mantenimiento = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado3 = Reset.getInt(1);
                
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado3;
    }
                int resultado4;
    public int CargarProduccion(String valor){
        Reset = Clases.Conexion.Consulta("select * from Produccion where produccion = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado4 = Reset.getInt(1);
                
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado4;
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

