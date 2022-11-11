/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author fuent
 */
public class ClaseReporte_Contrato {
    
    Conexion com = new Conexion();
    private Connection cn;
    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;
    
    public ClaseReporte_Contrato() {}
    
    public ClaseReporte_Contrato(String Respuesta, String Respuesta1){
        
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }    
    
        public void LlenarComboTipoContrato(JComboBox <ClaseReporte_Contrato> cbxTipoContrato){
    
        try{
        
            String sql = "SELECT * FROM Tipo_Contrato";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            while(com.rs.next())
            {
                cbxTipoContrato.addItem(new ClaseReporte_Contrato(
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
