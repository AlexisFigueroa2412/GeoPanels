/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
//Importar clases.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
    static Connection comu = null;
    public ResultSet rs;
    public Statement sente;
    
        public static Connection conectar(){
    
        Connection cn = null;
        try{
            
//            CONEXION DE ALEXIS (NO TOCAR)  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AU8D1GC;"+
                    "databaseName=GeoPanelsB;integratedSecurity=true;");
            
//            CONEXION DE PARDO (NO TOCAR)  
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//           cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-2ECQO24\\SQLEXPRESS;"+
//                    "databaseName=GeoPanelsB;integratedSecurity=true;");
        
  //CONEXION DE EMILIO (NO TOCAR)          
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-61V7GEEE\\SQLEXPRESS;"+
//                    "databaseName=GeoPanelsB123;integratedSecurity=true;");

//  CONEXION DE ALEJANDRO (NO TOCAR EN ESPECIAL EMILIO)              
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//          cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-PC\\\\SQLEXPRESS;"+
//                  "databaseName=GeoPanelsB;integratedSecurity=true;");
   
  //CONEXION DE MARCOS (NO TOCAR)
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-LM62G6S3\\SQLEXPRESS;" + 
//                   "databaseName=GeoPanelsB;integratedSecurity=true;");

//              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//              cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-61V7GEEE\\SQLEXPRESS;"+
//                    "databaseName=GeoPanelsB;integratedSecurity=true;");
        }
        catch(Exception ex){
        
            System.out.println(ex.getMessage());
        }
        
        return cn;
    }
        
        public static ResultSet Consulta(String consulta){
    
            Connection con =  conectar();
            Statement declara;

            try{

                declara = con.createStatement();
                ResultSet respuesta = declara.executeQuery(consulta);
                return respuesta;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            return null;
    }    
    
}
