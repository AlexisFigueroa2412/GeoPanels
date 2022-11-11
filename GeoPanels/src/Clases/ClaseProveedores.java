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
public class ClaseProveedores {

    private Connection cn;
    private Integer id_proveedor;
    private String nombre_empresa;
    private String nombre_proveedor;
    private String numero;
    private String correo;
    
    public ClaseProveedores(){
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public boolean guardarProyecto(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO Proveedor (nombre_empresa, nombre_proveedor, " + "numero_telefono, correo)"
                    + "VALUES(?, ?, ?, ?)";

            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, nombre_empresa);
            cmd.setString(2, nombre_proveedor);
            cmd.setString(3, numero);
            cmd.setString(4, correo);

            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean modificarProyecto(){
        boolean resp = false;
        try{
            String sql = "UPDATE Proveedor SET nombre_empresa = ?, nombre_proveedor = ?, " + "numero_telefono = ?, correo = ? WHERE id_proveedor = ?;";

            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, nombre_empresa);
            cmd.setString(2, nombre_proveedor);
            cmd.setString(3, numero);
            cmd.setString(4, correo);
            cmd.setInt(5, id_proveedor);

            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }

/////////////////////////////////////////////////////////////////////////////////
    
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
     * @return the id_proveedor
     */
    public Integer getId_proveedor() {
        return id_proveedor;
    }

    /**
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    /**
     * @return the nombre_empresa
     */
    public String getNombre_empresa() {
        return nombre_empresa;
    }

    /**
     * @param nombre_empresa the nombre_empresa to set
     */
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    /**
     * @return the nombre_proveedor
     */
    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    /**
     * @param nombre_proveedor the nombre_proveedor to set
     */
    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
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
    

    
}
