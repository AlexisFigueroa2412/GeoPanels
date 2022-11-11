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
 * @author Administrador
 */
public class ClaseCombo_Preguntas {

    Conexion com = new Conexion();

    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;

    public ClaseCombo_Preguntas(){}
    public ClaseCombo_Preguntas(String Respuesta, String Respuesta1) {
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }

    public void llenarPregunta(JComboBox <ClaseCombo_Preguntas> cmbPregunta){

        try{

            String sql = "SELECT * FROM Preguntas";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cmbPregunta.addItem(new ClaseCombo_Preguntas(
                com.rs.getString("id_pregunta"),
                com.rs.getString("pregunta")));
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
