/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
//Clases a importar
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Administrador
 */
public class ClaseCombo_Municipio {
    
    public ClaseCombo_Municipio(){}
    
    public ClaseCombo_Municipio(String Respuesta, String Respuesta1) {
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }
    
    Conexion com = new Conexion();
    
    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;
    
    public void llenarCombo(JComboBox <ClaseCombo_Municipio> cbxDepartamento){
    
        try{
        
            String sql = "SELECT * FROM Departamentos";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cbxDepartamento.addItem(new ClaseCombo_Municipio(
                com.rs.getString("id_departamento"),
                com.rs.getString("departamento")));
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
    
    int resultado;
    public int cargarDepartamento(String valor){
        Reset = Clases.Conexion.Consulta("select * from Departamentos where departamento = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado = Reset.getInt(1);
                resultado = resultado-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado;
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
