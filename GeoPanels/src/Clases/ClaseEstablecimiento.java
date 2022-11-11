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
public class ClaseEstablecimiento {
    
    //Declarando los atributos, pedira importar la clase Connection.
     private Connection cn;
     private Integer id_establecimiento;
     private String ubicacion;
     private String telefono;
     private String nombre_establecimiento;
     private Integer id_municipio;
     private Integer id_empresa;
     private Integer id_estado;
     
     public ClaseEstablecimiento(){
     
        //Establecemos la conexion.
        Conexion con = new Conexion();
        cn = con.conectar();
     }
     
     //Creando el metodo insertar.
     public boolean guardarProyecto(){
    
        boolean resp = false;
        
        try{ //Realizar consulta INSERT
        
            String sql = "INSERT INTO Establecimiento (ubicacion, numero_telefonico, nombre_establecimiento, id_municipio, id_empresa, id_estado)"+"VALUES (?,?,?,?,?,?)";//Se pasan referencia por seguridad
            //pide importar la clase PreparedStatement.
            PreparedStatement cmd = cn.prepareStatement(sql); 
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, getUbicacion());
            cmd.setString(2, getTelefono());
            cmd.setString(3, getNombre_establecimiento());
            cmd.setInt(4, getId_municipio());
            cmd.setInt(5, getId_empresa());
            cmd.setInt(6, getId_estado());
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
        
            String sql = "UPDATE Establecimiento SET ubicacion = ?, numero_telefonico = ?, nombre_establecimiento = ?, id_municipio = ?, id_empresa = ?, id_estado = ? WHERE id_establecimiento = ?"; //Se pasan referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, getUbicacion());
            cmd.setString(2, getTelefono());
            cmd.setString(3, getNombre_establecimiento());
            cmd.setInt(4, getId_municipio());
            cmd.setInt(5, getId_empresa());
            cmd.setInt(6, getId_estado());
            cmd.setInt(7, getId_establecimiento());
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
     * @return the id_establecimiento
     */
    public Integer getId_establecimiento() {
        return id_establecimiento;
    }

    /**
     * @param id_establecimiento the id_establecimiento to set
     */
    public void setId_establecimiento(Integer id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nombre_establecimiento
     */
    public String getNombre_establecimiento() {
        return nombre_establecimiento;
    }

    /**
     * @param nombre_establecimiento the nombre_establecimiento to set
     */
    public void setNombre_establecimiento(String nombre_establecimiento) {
        this.nombre_establecimiento = nombre_establecimiento;
    }

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
     * @return the id_empresa
     */
    public Integer getId_empresa() {
        return id_empresa;
    }

    /**
     * @param id_empresa the id_empresa to set
     */
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    /**
     * @return the id_estado
     */
    public Integer getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }
    
}
