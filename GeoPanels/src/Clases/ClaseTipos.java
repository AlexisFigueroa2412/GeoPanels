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
 * @author Master
 */
public class ClaseTipos {

    
    private Connection cn;
    private Integer id_tipo;
    private Integer id_tipo_producto;
    private String tipo;
    
    public ClaseTipos(){
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    public boolean guardarProyecto(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO Tipo (tipo)"
                    + "VALUES(?)";

            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, getTipo());


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
            String sql = "UPDATE Tipo SET tipo = ?   WHERE id_tipo = ?;";

            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, tipo);
            cmd.setInt(2, id_tipo);

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
    /**
     * @return the id_tipo
     */
    public Integer getId_tipo() {
        return id_tipo;
    }

    /**
     * @param id_tipo the id_tipo to set
     */
    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }

    /**
     * @return the id_tipo_producto
     */
    public Integer getId_tipo_producto() {
        return id_tipo_producto;
    }

    /**
     * @param id_tipo_producto the id_tipo_producto to set
     */
    public void setId_tipo_producto(Integer id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
