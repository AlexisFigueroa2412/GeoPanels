/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
//Clases a importar
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class ClaseCombo_Empleados {
    
    public ClaseCombo_Empleados(){}

    public ClaseCombo_Empleados(String Respuesta, String Respuesta1) {
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }
        
    Conexion com = new Conexion();
    
    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;
    
    
    //CARGANDO LOS COMBOBOX DE DATOS.
    public void llenarComboEstablecimiento(JComboBox <ClaseCombo_Empleados> cbxEstablecimiento){
    
        try{
        
            String sql = "SELECT * FROM Establecimiento";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cbxEstablecimiento.addItem(new ClaseCombo_Empleados(
                com.rs.getString("id_establecimiento"),
                com.rs.getString("nombre_establecimiento")));
            }
        
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }    
    }
    
    public void llenarComboTipo(JComboBox <ClaseCombo_Empleados> cbxTipo){
    
        try{
        
            String sql = "SELECT * FROM Tipo_empleado";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cbxTipo.addItem(new ClaseCombo_Empleados(
                com.rs.getString("id_tipo_empleado"),
                com.rs.getString("tipo_empleado")));
            }
        
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }    
    }
    
    public void llenarComboEstado(JComboBox <ClaseCombo_Empleados> cbxEstado){
    
        try{
        
            String sql = "SELECT * FROM Estado";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cbxEstado.addItem(new ClaseCombo_Empleados(
                com.rs.getString("id_estado"),
                com.rs.getString("estado")));
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
    
    //CAMBIANDO EL DATO DEL COMBOBOX CON CADA CLIC
    int resultado1;
    public int cargarEstablecimiento(String valor){
        Reset = Clases.Conexion.Consulta("select * from Establecimiento where nombre_establecimiento = '"+valor+"'");

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
    public int cargarTipo(String valor){
        Reset = Clases.Conexion.Consulta("select * from Tipo_empleado where tipo_empleado = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado2 = Reset.getInt(1);
                resultado2 = resultado2-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado2;
    }
    
    int resultado3;
    public int cargarEstado(String valor){
        Reset = Clases.Conexion.Consulta("select * from Estado where estado = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado3 = Reset.getInt(1);
                resultado3 = resultado3-1;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado3;
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
