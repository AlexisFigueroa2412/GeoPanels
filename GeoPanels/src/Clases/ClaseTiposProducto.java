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

public class ClaseTiposProducto {
    
    private Connection cn;
    private Integer id_tipo;
    private String Tipo;
    
    public ClaseTiposProducto(){
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public boolean guardarProyecto(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO Tipo_producto (tipo_producto)"
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
            String sql = "UPDATE Tipo_producto SET tipo_producto = ? WHERE id_tipo_producto = ?;";

            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, Tipo);
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
    
/////////////////////////////////////////////////////////////////////////////////  
    
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
     * @return the id_marca
     */

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
}
