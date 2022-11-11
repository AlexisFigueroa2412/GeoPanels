/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;

/**
 *
 * @author Master
 */
public class ClaseLogin {
    
    //Verificion de login.
    int Entrar;
    static ResultSet Res;
    public static int nivel;
    public static int ID;
    public static String primera;
    int Primer;
    public static String perfil;
    public static Integer generica;//Capturando valor de contraseña generica.

    public int Login(String Nombre, String Contraseña){
        Res = Clases.Conexion.Consulta("select id_tipo_empleado, id_usuario, primer_uso, perfil, contra from Usuario where nombre_usuario ='" +Nombre+"' and contraseña ='" +Contraseña+"'");

        try{
            while(Res.next()){
                Entrar = 1;
                nivel = Res.getInt(1);
                ID = Res.getInt(2);
                primera = Res.getString(3);
                perfil = Res.getString(4);
                generica = Res.getInt(5);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return Entrar;
       }
    
 public int PrimerUso(){
        Res = Clases.Conexion.Consulta("Select * from Empresa");
        try{
            while(Res.next()){
                Primer = 1;
                Res = Clases.Conexion.Consulta("Select * from Establecimiento");
                try{
                    while(Res.next()){
                    Primer = 2;
                    Res = Clases.Conexion.Consulta("Select * from Usuario");
                        try{
                            while(Res.next()){
                            Primer = 3;
                            }
                        }
                        catch(Exception e){
                        System.out.println(e.getMessage());
                        }
                    }
                }
                catch(Exception e){
                System.out.println(e.getMessage());
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return Primer;
    }
    
    //METODOS PARA LA VERIFICACION DE CONTRASEÑAS.
    
    //Verificion de encriptacion.
    int Acceder;
    static ResultSet Reset; 
    String Contra;
    String secretKey = "Ejemplo";
    
    public String EncriptarPalabra(String valor){       
        
        Encriptacion en = new Encriptacion();
        
        Contra = en.encriptar(secretKey, valor);
        
        return Contra;
    }
}
