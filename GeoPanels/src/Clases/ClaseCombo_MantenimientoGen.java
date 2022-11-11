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
public class ClaseCombo_MantenimientoGen {
    
    Conexion com = new Conexion();
    
    static ResultSet Reset;
    private String Respuesta;
    private String Respuesta1;
    
    public ClaseCombo_MantenimientoGen(){}
    
    public ClaseCombo_MantenimientoGen(String Respuesta, String Respuesta1) {
        this.Respuesta = Respuesta;
        this.Respuesta1 = Respuesta1;
    }   
    
        public void LlenarComboTipoMan(JComboBox <ClaseCombo_MantenimientoGen> cmbTipoMan){
    
        try{
        
            String sql = "SELECT * FROM Tipo_mantenimiento";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cmbTipoMan.addItem(new ClaseCombo_MantenimientoGen(
                com.rs.getString("id_tipo_mantenimiento"),
                com.rs.getString("costo")));
            }
        
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }    
    }
        
            public void LlenarComboEstado(JComboBox <ClaseCombo_MantenimientoGen> cmbEstado){
    
        try{
        
            String sql = "SELECT * FROM Estado_mantenimiento";
            com.sente = com.conectar().createStatement();
            com.rs= Clases.Conexion.Consulta(sql);
            //cbxTipo.removeAllItems();
            while(com.rs.next()){
                cmbEstado.addItem(new ClaseCombo_MantenimientoGen(
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
 ////////////////////////////////////////////////////////////////////////////////////////////
    int resultado1;
    public int CargarTipoMan(String valor){
        Reset = Clases.Conexion.Consulta("select * from Tipo_mantenimiento where costo = '"+valor+"'");

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
    public int CargarEstado(String valor){
        Reset = Clases.Conexion.Consulta("select * from Estado_mantenimiento where estado = '"+valor+"'");

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
    public int CargarCodigo(String valor){
        Reset = Clases.Conexion.Consulta("select * from Contrato where codigo = '"+valor+"'");

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
    public int CargarUsuario(String valor){
        Reset = Clases.Conexion.Consulta("select * from Usuario where nombre_usuario = '"+valor+"'");

        try{
            while(Reset.next()){
                resultado4 = Reset.getInt(1);
                
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultado4;
    }
    
    
    
    
    
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
