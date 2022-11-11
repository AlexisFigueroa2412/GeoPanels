/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class ClaseCombo_Modelos {

    public ClaseCombo_Modelos(){}
    
    public ClaseCombo_Modelos(String Respuesta, String Respuesta1) {
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
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
    
    Conexion com = new Conexion();
    
    private String Respuesta;
    private String Respuesta1;
    
    public void LlenarCombo(JComboBox <ClaseCombo_Modelos> cbxTipo){
    
        try{
        
            String sql = "SELECT * FROM Tipo";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            cbxTipo.removeAllItems();
            while(com.rs.next()){
                cbxTipo.addItem(new ClaseCombo_Modelos(
                com.rs.getString("id_tipo"),
                com.rs.getString("tipo")));
            }
        
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }    
    }
    
    @Override
    public String toString(){
    
        return Respuesta1;
    }
    
}
