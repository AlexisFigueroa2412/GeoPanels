
package Clases;
//Importaciones necesarias.
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

public class Encriptacion {
    
    //Metodo para encriptamiento para MD5.
    public String encriptar(String secretKey, String cadena){
        
        String Encriptacion = ""; 
        
        try{
        
            //Especificamos el tipo de encriptacion que queremos utilizar.
            MessageDigest md5 = MessageDigest.getInstance("MD5");

            //Transformar en arreglo de bytes la llave de encriptacion.
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));

            //Creamos una copia del arreglo anterior.
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);

            //Con esta instancia procederemos hacer la encriptacion.
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            
            //Se encargara del cifrado.
            Cipher cifrado = Cipher.getInstance("DESede");
            
            //A continuacion procedemos a especificar el tipo de cifrado que queremos y cual es la llave.
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            
            //Realizar la encriptacion. (Transformando nuestra cadena en un array de bytes)
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            
            //Creamos de nuevo un arreglo de bytes para guardar nuestro cifrado.
            byte[] buf = cifrado.doFinal(plainTextBytes);
            
            //Creamos por ultimo un arreglo mas de byte donde se realizara la encriptacion final.
            byte[] base64Bytes = Base64.encodeBase64(buf);
            
            //Pasamos como parametro la varible principal.
            Encriptacion = new String (base64Bytes);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Algo salio mal");
        }
        return Encriptacion;
    }
    
}
