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
public class ClaseReporte_Horario {
    
    Conexion com = new Conexion();
    private Connection cn;
    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;
    
    public ClaseReporte_Horario() {}
    
    public ClaseReporte_Horario(String Respuesta, String Respuesta1){
        
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }    
    
        public void LlenarComboHorario(JComboBox <ClaseReporte_Horario> cbxhorario){
    
        try{
        
            String sql = "SELECT * FROM Tipo_Mantenimiento";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            while(com.rs.next())
            {
                cbxhorario.addItem(new ClaseReporte_Horario(
                com.rs.getString("id_tipo_mantenimiento"),
                com.rs.getString("tipo_mantenimiento")));
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
