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
public class ClaseProductos {
    
    private Connection cn;

    private String Sku;
    private String Nombre;
    private String Descripcion;
    private double precio;
    private Integer marca;
    private Integer Tipo;
    private Integer TipoProducto;
    private Integer id_Producto;
    private double precioSalida;
    
    public ClaseProductos(){
        Conexion con = new Conexion();
        cn = con.conectar();
    }

    public boolean guardarProyecto(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO Producto (sku, nombre_producto, descripcion, precio_entrada, id_marca, id_tipo_producto, id_tipo, precio_salida)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement cmd = getCn().prepareStatement(sql);

            cmd.setString(1, Sku);
            cmd.setString(2, Nombre);
            cmd.setString(3, Descripcion);
            cmd.setDouble(4, precio);
            cmd.setInt(5, marca);
            cmd.setInt(6, TipoProducto);
            cmd.setInt(7, Tipo);
            cmd.setDouble(8, precioSalida);

            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            getCn().close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
      
    public boolean modificarProyecto(){
        boolean resp = false;
        try{
            String sql = "UPDATE Producto SET sku = ?, nombre_producto = ?, descripcion = ?, precio_entrada = ?, id_marca = ?, id_tipo_producto = ?, id_tipo = ?, precio_salida = ? WHERE id_producto = ?;";

            PreparedStatement cmd = getCn().prepareStatement(sql);

            cmd.setString(1, Sku);
            cmd.setString(2, Nombre);
            cmd.setString(3, Descripcion);
            cmd.setDouble(4, precio);
            cmd.setInt(5, marca);
            cmd.setInt(6, TipoProducto);
            cmd.setInt(7, Tipo);
            cmd.setDouble(8, precioSalida);
            cmd.setInt(9, id_Producto);

            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            getCn().close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
    
    /**
     * @return the Sku
     */
    public String getSku() {
        return Sku;
    }

    /**
     * @param Sku the Sku to set
     */
    public void setSku(String Sku) {
        this.Sku = Sku;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public Integer getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    /**
     * @return the Tipo
     */
    public Integer getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(Integer Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the TipoProducto
     */
    public Integer getTipoProducto() {
        return TipoProducto;
    }

    /**
     * @param TipoProducto the TipoProducto to set
     */
    public void setTipoProducto(Integer TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    /**
     * @return the id_Producto
     */
    public Integer getId_Producto() {
        return id_Producto;
    }

    /**
     * @param id_Producto the id_Producto to set
     */
    public void setId_Producto(Integer id_Producto) {
        this.id_Producto = id_Producto;
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
     * @return the precioSalida
     */
    public double getPrecioSalida() {
        return precioSalida;
    }

    /**
     * @param precioSalida the precioSalida to set
     */
    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }
}
