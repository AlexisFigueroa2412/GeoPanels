/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import geopanels.Empleados;
import geopanels.PrimerUsuario;
import geopanels.Imagen;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Administrador
 */
public class ClaseImagen_Empleado {
    
    public String Seleccionar_Imagen(JLabel lblLogo){
        String path = null;
        Imagen ventana = new Imagen();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        ventana.jFileChooser1.setFileFilter(filtro);
        int resultado = ventana.jFileChooser1.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {
            File fichero = ventana.jFileChooser1.getSelectedFile();
            path = fichero.toString();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
                lblLogo.setText(null);
                lblLogo.setIcon(icono);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al abrir la imagen "+ ex);
            }
        }
        return path;
    }
    
        public String GuardarImagen(JLabel lbl){
        String ruta = null;
        try{
            ImageIcon icon = (ImageIcon) Empleados.lblFoto.getIcon();
            BufferedImage image = new BufferedImage(icon.getIconWidth(),
            icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            g2.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
            g2.dispose();
            Random r = new Random();
            ruta = "src/Multimedia/"+"Img"+r.nextInt(9999+1)+".jpg";
            ImageIO.write(image, "jpg", new File(ruta));
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return ruta;
    }
        
        public String GuardarImagenUser(JLabel lbl){
            String ruta = null;
            try{
                ImageIcon icon = (ImageIcon) PrimerUsuario.lblPerfil.getIcon();
                BufferedImage image = new BufferedImage(icon.getIconWidth(),
                icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2 = image.createGraphics();
                g2.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
                g2.dispose();
                Random r = new Random();
                ruta = "src/Multimedia/"+"Img"+r.nextInt(9999+1)+".jpg";
                ImageIO.write(image, "jpg", new File(ruta));
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, e);
            }
            return ruta;
        }
        
        public void CargarLogo(String ruta,JLabel lblIcono){
        try{
            ImageIcon icon = new ImageIcon(ruta);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(108, 85, Image.SCALE_DEFAULT));
            lblIcono.setText(null);
            lblIcono.setIcon(icono);
        }catch(Exception e){
            System.out.println(e);
        }
    }    
    
}
