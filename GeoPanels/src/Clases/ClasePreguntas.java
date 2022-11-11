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
public class ClasePreguntas {

    public ClasePreguntas(){
        //Establecemos la conexion.
        Conexion con = new Conexion();
        cn = con.conectar();
     }
    
    public boolean guardarProyecto(){

        boolean resp = false;

        try{ //Realizar consulta INSERT

            String sql = "INSERT INTO Respuestas (id_usuario, id_pregunta1, respuesta1, id_pregunta2, respuesta2, id_pregunta3, respuesta3, id_pregunta4, respuesta4)"+"VALUES (?,?,?,?,?,?,?,?,?)";//Se pasan referencia por seguridad
            //pide importar la clase PreparedStatement.
            PreparedStatement cmd = cn.prepareStatement(sql); 
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setInt(1, getId_usuario());
            cmd.setInt(2, getId_pregunta1());
            cmd.setString(3, getRespuesta1());
            cmd.setInt(4, getId_pregunta2());
            cmd.setString(5, getRespuesta2());
            cmd.setInt(6, getId_pregunta3());
            cmd.setString(7, getRespuesta3());
            cmd.setInt(8, getId_pregunta4());
            cmd.setString(9, getRespuesta4());
            //Si da error devuelve 1, coso contrario 0.
            //Tomar en cuenta el "!" de negación.

            //Consulta para Hacer que se modifique el Primer Uso
            String sql2 = "UPDATE Usuario SET primer_uso = 1 WHERE id_usuario = ?";

            PreparedStatement cm = cn.prepareStatement(sql2); 

            cm.setInt(1, getId_usuario());

            if (!cmd.execute() && !cm.execute()) {
                resp = true;
            }
            //Cerrando conexion.
            cmd.close();
            cn.close();
            cm.close();
        }
        catch(Exception e){

            System.out.println(e.toString());
        }
        return resp;
    }

    
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
     * @return the id_pregunta1
     */
    public Integer getId_pregunta1() {
        return id_pregunta1;
    }

    /**
     * @param id_pregunta1 the id_pregunta1 to set
     */
    public void setId_pregunta1(Integer id_pregunta1) {
        this.id_pregunta1 = id_pregunta1;
    }

    /**
     * @return the respuesta1
     */
    public String getRespuesta1() {
        return respuesta1;
    }

    /**
     * @param respuesta1 the respuesta1 to set
     */
    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    /**
     * @return the id_pregunta2
     */
    public Integer getId_pregunta2() {
        return id_pregunta2;
    }

    /**
     * @param id_pregunta2 the id_pregunta2 to set
     */
    public void setId_pregunta2(Integer id_pregunta2) {
        this.id_pregunta2 = id_pregunta2;
    }

    /**
     * @return the respuesta2
     */
    public String getRespuesta2() {
        return respuesta2;
    }

    /**
     * @param respuesta2 the respuesta2 to set
     */
    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    /**
     * @return the id_pregunta3
     */
    public Integer getId_pregunta3() {
        return id_pregunta3;
    }

    /**
     * @param id_pregunta3 the id_pregunta3 to set
     */
    public void setId_pregunta3(Integer id_pregunta3) {
        this.id_pregunta3 = id_pregunta3;
    }

    /**
     * @return the respuesta3
     */
    public String getRespuesta3() {
        return respuesta3;
    }

    /**
     * @param respuesta3 the respuesta3 to set
     */
    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    /**
     * @return the id_pregunta4
     */
    public Integer getId_pregunta4() {
        return id_pregunta4;
    }

    /**
     * @param id_pregunta4 the id_pregunta4 to set
     */
    public void setId_pregunta4(Integer id_pregunta4) {
        this.id_pregunta4 = id_pregunta4;
    }

    /**
     * @return the respuesta4
     */
    public String getRespuesta4() {
        return respuesta4;
    }

    /**
     * @param respuesta4 the respuesta4 to set
     */
    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }
    
    private Connection cn;
    private Integer id_usuario;
    private Integer id_pregunta1;
    private String respuesta1;
    private Integer id_pregunta2;
    private String respuesta2;
    private Integer id_pregunta3;
    private String respuesta3;
    private Integer id_pregunta4;
    private String respuesta4;
    
}
