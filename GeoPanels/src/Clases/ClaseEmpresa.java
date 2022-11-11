/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public class ClaseEmpresa {

    private Connection cn;
    private Integer id_empresa;
    private String nombre_empresa;
    private String giro_comercial;
    private String razon_social;
    private String correo;
    private String logo;
    private String registro_patronal;
    private String direccion;
    private String representante;
    private String fecha_registro;

    public ClaseEmpresa()
    {
    Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public boolean GuardarEmpresa(){
        boolean resp = false;
        try
        {
            String sql = "Insert into Empresa( nombre_empresa, giro_comercial, razon_social, correo, logo, registro_patronal, direccion, representante)"
                         +"Values(?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, nombre_empresa);
            cmd.setString(2, giro_comercial);
            cmd.setString(3, razon_social);
            cmd.setString(4, correo);
            cmd.setString(5, logo);
            cmd.setString(6, registro_patronal);
            cmd.setString(7, direccion);
            cmd.setString(8, representante);

            if (!cmd.execute()) 
            {
                resp = true;
            }

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean ModificarEmpresa(){
        boolean resp = false;
        try
        {
            String sql = "Update Empresa Set nombre_empresa = ?, giro_comercial = ?, razon_social = ?, correo = ?, logo = ?, registro_patronal = ?, direccion = ?, representante = ? Where id_empresa = ?";

            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, nombre_empresa);
            cmd.setString(2, giro_comercial);
            cmd.setString(3, razon_social);
            cmd.setString(4, correo);
            cmd.setString(5, getLogo());
            cmd.setString(6, registro_patronal);
            cmd.setString(7, direccion);
            cmd.setString(8, representante);
            cmd.setInt(9, id_empresa);

            if (!cmd.execute()) 
            {
                resp = true;
            }

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return resp;
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
     * @return the giro_comercial
     */
    public String getGiro_comercial() {
        return giro_comercial;
    }

    /**
     * @param giro_comercial the giro_comercial to set
     */
    public void setGiro_comercial(String giro_comercial) {
        this.giro_comercial = giro_comercial;
    }

    /**
     * @return the razon_social
     */
    public String getRazon_social() {
        return razon_social;
    }

    /**
     * @param razon_social the razon_social to set
     */
    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
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
     * @return the registro_patronal
     */
    public String getRegistro_patronal() {
        return registro_patronal;
    }

    /**
     * @param registro_patronal the registro_patronal to set
     */
    public void setRegistro_patronal(String registro_patronal) {
        this.registro_patronal = registro_patronal;
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
     * @return the representante
     */
    public String getRepresentante() {
        return representante;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    /**
     * @return the fecha_registro
     */
    public String getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /**
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }
    

}
