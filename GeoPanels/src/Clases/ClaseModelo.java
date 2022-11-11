
package Clases;
//Librerias a agregar.
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Administrador
 */
public class ClaseModelo {

     //Declarando los atributos, pedira importar la clase Connection.
     private Connection cn;
     private Integer id_modelo;
     private String modelo;
     private Integer id_tipo;
     
     public ClaseModelo(){
     
        //Establecemos la conexion.
        Conexion con = new Conexion();
        cn = con.conectar();
     }
    
     //Creando el metodo insertar.
     public boolean guardarProyecto(){
    
        boolean resp = false;
        
        try{ //Realizar consulta INSERT
        
            String sql = "INSERT INTO Modelo (modelo, id_tipo)"+"VALUES (?,?)";//Se pasan referencia por seguridad
            //pide importar la clase PreparedStatement.
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, getModelo());
            cmd.setInt(2, getId_tipo());
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
        
            String sql = "UPDATE Modelo SET modelo = ?, id_tipo = ? WHERE id_modelo = ?"; //Se pasan referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Llenar los parametros de la clase, se coloca en el orden de la tabla
            cmd.setString(1, getModelo());
            cmd.setInt(2, getId_tipo());
            cmd.setInt(3, getId_modelo());
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
     * @return the id_modelo
     */
    public Integer getId_modelo() {
        return id_modelo;
    }

    /**
     * @param id_modelo the id_modelo to set
     */
    public void setId_modelo(Integer id_modelo) {
        this.id_modelo = id_modelo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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

}
