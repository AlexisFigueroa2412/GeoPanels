/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
//Librerias a agregar.
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Administrador
 */
public class ClaseMunicipio {

    //Declarando los atributos, pedira importar la clase Connection.
     private Connection cn;
     private Integer id_municipio;
     private String municipio;
     private Integer id_departamento;
     
     public ClaseMunicipio(){
     
        //Establecemos la conexion.
        Conexion con = new Conexion();
        cn = con.conectar();
     }
     
     //Creando el metodo insertar.
     public boolean guardarProyecto(){
    
        boolean resp = false;
        
        try{ //Realizar consulta INSERT
        
            String sql = "INSERT INTO Municipio (municipio, id_departamento)"+"VALUES (?,?)";//Se pasan referencia por seguridad
            //pide importar la clase PreparedStatement.
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, municipio);
            cmd.setInt(2, id_departamento);
            //Si da error devuelve 1, coso contrario 0.
            //Tomar en cuenta el "!" de negación.
            
            if (!cmd.execute()) {
                resp = true;
            }
            //Cerrando conexion.
            cmd.close();
            cn.close();
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }
        return resp;
    }  
    
     //Creando el metodo modificar.
     public boolean modificarProyecto(){
    
        boolean resp = false;
        
        try{ //Realizar consulta UPDATE.
        
            String sql = "UPDATE Municipio SET municipio = ?, id_departamento = ? WHERE id_municipio = ?"; //Se pasan referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, municipio);
            cmd.setInt(2, id_departamento);
            cmd.setInt(3, id_municipio);
            //Si da error devuelve 1, coso contrario 0.
            //Tomar en cuenta el "!" de negación.
            
            if (!cmd.execute()) {
                resp = true;
            }
            //Cerrando conexion.
            cmd.close();
            cn.close();
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }
        return resp;
    }     

//////////////////////////////////////////////////////////////////////////////////////////////////      
      
      //ENCAPSULAMIENTO:     
     
    /**
     * @return the id_municipio
     */
    public Integer getId_municipio() {
        return id_municipio;
    }

    /**
     * @param id_municipio the id_municipio to set
     */
    public void setId_municipio(Integer id_municipio) {
        this.id_municipio = id_municipio;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the id_departamento
     */
    public Integer getId_departamento() {
        return id_departamento;
    }

    /**
     * @param id_departamento the id_departamento to set
     */
    public void setId_departamento(Integer id_departamento) {
        this.id_departamento = id_departamento;
    }
    
     
}
