/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Administrador
 */
public class ClaseDepartamento {
    
     //Declarando los atributos, pedira importar la clase Connection.
     private Connection cn;
     private Integer id_departamento;
     private String departamento;
     
    public ClaseDepartamento(){
     
        //Establecemos la conexion.
        Conexion con = new Conexion();
        cn = con.conectar();
     }
    
     //Creando el metodo insertar.
     public boolean guardarProyecto(){
    
        boolean resp = false;
        
        try{ //Realizar consulta INSERT
        
            String sql = "INSERT INTO Departamentos (departamento)"+"VALUES (?)";//Se pasan referencia por seguridad
            //pide importar la clase PreparedStatement.
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, getDepartamento());
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
        
            String sql = "UPDATE Departamentos SET departamento = ? WHERE id_departamento = ?"; //Se pasan referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, getDepartamento());
            cmd.setInt(2, getId_departamento());
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

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
