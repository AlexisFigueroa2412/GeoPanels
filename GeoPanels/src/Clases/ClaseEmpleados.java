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
public class ClaseEmpleados {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     //Declarando los atributos, pedira importar la clase Connection.
     private Connection cn;
     private Integer id_usuario;
     private String nombre;
     private String apellido;
     private String direccion;
     private String telefono;
     private String correo;
     private String nombre_usuario;
     private String contra;
     private String fecha_nacimiento;
     private String genero;
     private Integer id_estado;
     private Integer id_tipo_empleado;
     private Integer id_establecimiento;
     //private String fecha_registro;
     private String perfil;
     
     public ClaseEmpleados(){
     
        //Establecemos la conexion.
        Conexion con = new Conexion();
        cn = con.conectar();
     }
     
     //Creando el metodo insertar.
     public boolean guardarProyecto(){
    
        boolean resp = false;
        
        try{ //Realizar consulta INSERT
        
            String sql = "INSERT INTO Usuario (nombre, apellido, direccion, numero_telefonico, correo, nombre_usuario, contraseña, fecha_nacimiento, genero, id_estado, id_tipo_empleado, id_establecimiento, perfil)"+"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";//Se pasan referencia por seguridad
            //pide importar la clase PreparedStatement.
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, nombre);
            cmd.setString(2, apellido);
            cmd.setString(3, direccion);
            cmd.setString(4, telefono);
            cmd.setString(5, correo);
            cmd.setString(6, nombre_usuario);
            cmd.setString(7, contra);
            cmd.setString(8, fecha_nacimiento);
            cmd.setString(9, genero);
            cmd.setInt(10, id_estado);
            cmd.setInt(11, id_tipo_empleado);
            cmd.setInt(12, id_establecimiento);
            cmd.setString(13, perfil);
            //Si da error devuelve 1, coso contrario 0.
            //Tomar en cuenta el "!" de negación.
            
            if (!cmd.execute()) {
                resp = true;
            }
//            //Cerrando conexion.
//            cmd.close();
//            cn.close();
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
        
            String sql = "UPDATE Usuario SET nombre = ?, apellido = ?, direccion = ?, numero_telefonico = ?, correo = ?, nombre_usuario = ?, contraseña = ?, fecha_nacimiento = ?, genero = ?, id_estado = ?, id_tipo_empleado = ?, id_establecimiento = ?, perfil = ? WHERE id_usuario = ?"; //Se pasan referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, getNombre());
            cmd.setString(2, apellido);
            cmd.setString(3, direccion);
            cmd.setString(4, telefono);
            cmd.setString(5, correo);
            cmd.setString(6, nombre_usuario);
            cmd.setString(7, contra);
            cmd.setString(8, fecha_nacimiento);
            cmd.setString(9, genero);
            cmd.setInt(10, id_estado);
            cmd.setInt(11, id_tipo_empleado);
            cmd.setInt(12, id_establecimiento);
            cmd.setString(13, perfil);
            cmd.setInt(14, id_usuario);
            //Si da error devuelve 1, coso contrario 0.
            //Tomar en cuenta el "!" de negación.
            
            if (!cmd.execute()) {
                resp = true;
            }
//            //Cerrando conexion.
//            cmd.close();
//            cn.close();
        }
        catch(Exception e){
        
            System.out.println(e.toString());
        }
        return resp;
    }     
     
//////////////////////////////////////////////////////////////////////////////////////////////////      
      
      //ENCAPSULAMIENTO:  
     
    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the id_usuario
     */
    public Integer getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the contra
     */
    public String getContra() {
        return contra;
    }

    /**
     * @param contra the contra to set
     */
    public void setContra(String contra) {
        this.contra = contra;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
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

    /**
     * @return the id_tipo_empleado
     */
    public Integer getId_tipo_empleado() {
        return id_tipo_empleado;
    }

    /**
     * @param id_tipo_empleado the id_tipo_empleado to set
     */
    public void setId_tipo_empleado(Integer id_tipo_empleado) {
        this.id_tipo_empleado = id_tipo_empleado;
    }

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

//    /**
//     * @return the fecha_registro
//     */
//    public String getFecha_registro() {
//        return fecha_registro;
//    }
//
//    /**
//     * @param fecha_registro the fecha_registro to set
//     */
//    public void setFecha_registro(String fecha_registro) {
//        this.fecha_registro = fecha_registro;
//    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }        
     
}
