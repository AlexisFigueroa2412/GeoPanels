/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jalex
 */
public class ClaseFactura {

    
    
    
    //Conexión
    private Connection cn;
    
    //Combobox
    private String Impuesto;
    private String Instalacion;
    private Integer IdInstalacion;
    private Integer IdImpuesto;
    private Integer IdCarro;
    //Precios
    private Double PrecioInstalacion;
    private Double PrecioImpusto;
    private Double Subtotal;
    private Double Total;
    //Interfaz
    private String Fecha;
    private Integer ClienteId;
    private Integer Pago;
    //Filtro
    private String Nombre;
    private String Apellido;
    private String Dui;
    private String Tel;
    private String Carrito;
    private String FechaCarro;
    private Integer Factura;
    //Pago
    private String NombrePago;
    private Double MontoPago;
    private Double MontoRecibo;
    private Double MontoRetorno;
    //Tarjeta
    private Integer IdTarjeta;
    private String NombreTarjeta;
    private String ApellidoTarjeta;
    private String Pan;
    private String vencimiento;
    private String CVV;
    //Cobro
    private Integer IdCobro;    
    //Indicador
    private String Indicador;
    private Integer Generado;
    private Integer Programado;
    //Conexión
    public ClaseFactura()
    {
    Conexion con = new Conexion();
        cn = Conexion.conectar();
    }
    public Connection GetCn()
    {
        return cn;
    }
    public void setCn(Connection cn)
    {
        this.cn = cn;
    }

    
    public String getImpuesto() {
        return Impuesto;
    }
    
    public void setImpuesto(String Impuesto) {
        this.Impuesto = Impuesto;
    }

    public String getInstalacion() {
        return Instalacion;
    }

    public void setInstalacion(String Instalacion) {
        this.Instalacion = Instalacion;
    }

    public Integer getIdInstalacion() {
        return IdInstalacion;
    }

    public void setIdInstalacion(Integer IdInstalacion) {
        this.IdInstalacion = IdInstalacion;
    }

    public Integer getIdImpuesto() {
        return IdImpuesto;
    }

    public void setIdImpuesto(Integer IdImpuesto) {
        this.IdImpuesto = IdImpuesto;
    }

    public Double getPrecioInstalacion() {
        return PrecioInstalacion;
    }

    public void setPrecioInstalacion(Double PrecioInstalacion) {
        this.PrecioInstalacion = PrecioInstalacion;
    }

    public Double getPrecioImpusto() {
        return PrecioImpusto;
    }

    public void setPrecioImpusto(Double PrecioImpusto) {
        this.PrecioImpusto = PrecioImpusto;
    }

    public Double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Integer getClienteId() {
        return ClienteId;
    }

    public void setClienteId(Integer ClienteId) {
        this.ClienteId = ClienteId;
    }
    
    //Filtro
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }
    
    public String getCarrito() {
        return Carrito;
    }
    
    public void setCarrito(String Carrito) {
        this.Carrito = Carrito;
    }

    public String getFechaCarro() {
        return FechaCarro;
    }

    public void setFechaCarro(String FechaCarro) {
        this.FechaCarro = FechaCarro;
    }
    
    //Tablas
    
    public ResultSet Mostrar_Clientes()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_cliente, nombre_cliente, apellido_cliente, dui, numero_telefonico, correo  from Cliente order by nombre_cliente";
            PreparedStatement tabla = cn.prepareStatement(sql);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Filtrar_Clientes1()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_cliente, nombre_cliente, apellido_cliente, dui, numero_telefonico, correo  from Cliente "
                    + "Where nombre_cliente LIKE '%"+Nombre+"%'";
            PreparedStatement tabla = cn.prepareStatement(sql);  
                        
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
     public ResultSet Filtrar_Clientes2()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_cliente, nombre_cliente, apellido_cliente, dui, numero_telefonico, correo  from Cliente "
                    + "Where apellido_cliente LIKE '%"+Apellido+"%'";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
     public ResultSet Filtrar_Clientes3()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_cliente, nombre_cliente, apellido_cliente, dui, numero_telefonico, correo  from Cliente "
                    + "Where dui = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setString(1, Dui);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Filtrar_Clientes4()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_cliente, nombre_cliente, apellido_cliente, dui, numero_telefonico, correo  from Cliente "
                    + "Where numero_telefonico = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
                        
            tabla.setString(1, Tel);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Mostrar_Carritos()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_carrito, carrito From Carrito WHERE carrito not like '%Facturado%' AND carrito not like '%*Compra%' AND carrito not like '%Pagado%' order by id_carrito desc";
            PreparedStatement tabla = cn.prepareStatement(sql);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Filtrar_Carrito()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select * From Carrito Where carrito "
                    + "LIKE '%"+Carrito+"%' AND carrito not like '%Facturado%' AND carrito not like '%Pagado%'";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
//            tabla.setString(1, Carrito);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Factura()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_factura, fecha,id_carrito, total from Factura_producto where id_pago = 1 order by id_factura desc";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
//            tabla.setString(1, Carrito);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Mantenimiento()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_facturaM, fecha, id_mantenimiento, total from Factura_Mantenimiento where id_pago = 1 order by id_facturaM desc";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
//            tabla.setString(1, Carrito);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet MantenimientoP()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_facturaMP, fecha, id_mantenimiento_programado, total from Factura_Mantenimiento_Programado where id_pago = 1 order by id_facturaMP desc";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
//            tabla.setString(1, Carrito);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Filtrar_Elemento()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select * From Carrito Where carrito "
                    + "LIKE '%"+Carrito+"%' AND carrito not like '%Facturado%' AND carrito not like '%Pagado%'";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
//            tabla.setString(1, Carrito);            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
     public ResultSet Filtrar_Carro()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select elemento_Carrito.id_elemento ,Producto.id_producto,Producto.nombre_producto,elemento_Carrito.cantidad From elemento_Carrito, Carrito, Producto, Inventario Where elemento_Carrito.id_carrito = Carrito.id_carrito AND elemento_Carrito.id_inventario = Inventario.id_inventariado And Inventario.id_producto = Producto.id_producto"
                    + " AND Carrito.id_carrito = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setInt(1,IdCarro);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Filtrar_Mantenimiento()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_mantenimiento, descripcion,fecha from Mantenimiento_Generado where id_mantenimiento = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setInt(1, IdCarro);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Filtrar_MantenimientoP()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_mantenimiento_programado, descripcion,fechayhora from Mantenimiento_Programado where id_mantenimiento_programado = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setInt(1, IdCarro);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
   
    public ResultSet Obtener_Precio()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select SUM(Producto.precio_salida * elemento_Carrito.cantidad) from elemento_Carrito, Carrito, Inventario, Producto "
                    + "where elemento_Carrito.id_carrito = Carrito.id_carrito AND elemento_Carrito.id_inventario = Inventario.id_inventariado AND Inventario.id_producto = Producto.id_producto "
                    + "AND Carrito.carrito = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setString(1, Carrito);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Obtener_Precio_Instalacion()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select costo From Tipo_mantenimiento Where tipo_mantenimiento = ?";
            PreparedStatement inv = cn.prepareStatement(sql);   
            inv.setString(1, Instalacion);            
            
            retorno = inv.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
       
    }
    public ResultSet Obtener_Precio_Impuesto()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select precio from Impuestos_producto where id_impuesto = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setInt(1, IdImpuesto);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Obtener_idInstalacion()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "Select id_tipo_mantenimiento From Tipo_mantenimiento WHERE tipo_mantenimiento = ?";
            PreparedStatement tabla = cn.prepareStatement(sql);  
            
            tabla.setString(1, Instalacion);
            
            retorno = tabla.executeQuery();
        }
            catch(SQLException sql)
            {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Obtener_idImpuesto()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_impuesto from Impuestos_producto where impuesto = ? AND precio = ?";
            PreparedStatement tabla = cn.prepareStatement(sql); 
            
            System.out.println(Instalacion);
            System.out.println(PrecioImpusto);
            tabla.setString(1, Instalacion);
            tabla.setDouble(2,PrecioImpusto);
            
            
            retorno = tabla.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    public ResultSet Obtener_Pago()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_pago from Pago where pago = ?";
            PreparedStatement tabla = cn.prepareStatement(sql); 
            
            tabla.setString(1, NombrePago);
            
            
            retorno = tabla.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }    
    public ResultSet Obtener_Tarjeta()
    {
        ResultSet retorno = null;
        try
        {
            String sql = "select id_tarjeta from Tarjeta where pan = ? AND cvv = ?";
            PreparedStatement tabla = cn.prepareStatement(sql); 
            
            tabla.setString(1, Pan);
            tabla.setString(2, CVV);
            
            retorno = tabla.executeQuery();
        }
        catch(SQLException sql)
        {
            System.out.println(sql.toString());
        }
        return retorno;
    }
    
    //Combobox
    public DefaultComboBoxModel Impuesto()
    {
        DefaultComboBoxModel mark = new DefaultComboBoxModel();
        mark.addElement("Seleccione");
        try{
            String sql = "select concat(impuesto,' $ ',precio)AS sx from Impuestos_producto order by id_impuesto";
            PreparedStatement Markar = cn.prepareStatement(sql);
            ResultSet rs = Markar.executeQuery();
            while(rs.next())
                mark.addElement(rs.getString(1));                
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return mark;
    }

    //Añadir 
    public boolean Añadir_factura()
    {
        boolean resp = false;        
        try
        {
            String sql = "Insert into Factura_producto(fecha, subtotal, id_carrito, id_costo, id_cliente, id_impuesto,total,id_pago) \n" +
            "values(?,?,?,?,?,?,?,?)";            
            try (PreparedStatement elemento = cn.prepareStatement(sql)) {
                elemento.setString(1,Fecha);
                elemento.setDouble(2,Subtotal);
                elemento.setInt(3,IdCarro);
                elemento.setInt(4,IdInstalacion);
                elemento.setInt(5,ClienteId);
                elemento.setDouble(6,IdImpuesto);
                elemento.setDouble(7,Total);
                elemento.setInt(8, getPago());
                if (!elemento.execute()) {
                    resp = true;
                }
                //cn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean Agregar_Pago(){
        boolean resp = false;
        try{
            String SQL = "Insert into Pago(pago, MontoPago, MontoRecibo, MontoRetorno) values(?,?,?,?)";
            PreparedStatement pago = cn.prepareStatement(SQL);
            pago.setString(1, NombrePago);
            pago.setDouble(2, MontoPago);
            pago.setDouble(3, MontoRecibo);
            pago.setDouble(4, MontoRetorno);
            if (!pago.execute()) {
                    resp = true;
                }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }    
    public boolean Agregar_Tarjeta(){
        boolean resp = false;
        try{
            String SQL = "Insert into Tarjeta(nombre,apellido,pan,cvv,vencimiento) Values(?,?,?,?,?)";
            PreparedStatement tar = cn.prepareStatement(SQL);
            tar.setString(1, NombreTarjeta);
            tar.setString(2, ApellidoTarjeta);
            tar.setString(3, Pan);
            tar.setString(4, CVV);
            tar.setString(5, vencimiento);
            if (!tar.execute()) {
                    resp = true;
                }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }   

    public boolean Agregar_Cobro(){
        boolean resp = false;
        try{
            String SQL = "Insert into Cobro(pago, tarjeta) values(?,?);";
            PreparedStatement pago = cn.prepareStatement(SQL);
            pago.setInt(1, Pago);
            pago.setInt(2, IdTarjeta);
            if (!pago.execute()) {
                    resp = true;
                }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }   
    public boolean Actualizar_factura()
    {
        boolean resp = false;        
        try
        {
            String sql = "update Factura_producto set id_pago = ? where id_factura = ?";            
            try (PreparedStatement elemento = cn.prepareStatement(sql)) {
                elemento.setInt(1,Pago);
                elemento.setInt(2, Factura);

                if (!elemento.execute()) {
                    resp = true;
                }
                //cn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean Actualizar_Programado()
    {
        boolean resp = false;        
        try
        {
            String sql = "update  Factura_Mantenimiento_Programado set id_pago = ? where id_facturaMP = ?";            
            try (PreparedStatement elemento = cn.prepareStatement(sql)) {
                elemento.setInt(1, Pago);
                elemento.setInt(2, Programado);
                if (!elemento.execute()) {
                    resp = true;
                }
                //cn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    public boolean Actualizar_Generado()
    {
        boolean resp = false;        
        try
        {
            String sql = "update  Factura_Mantenimiento set id_pago = ? where id_facturaM = ?";            
            try (PreparedStatement elemento = cn.prepareStatement(sql)) {
                elemento.setInt(1, Pago);
                elemento.setInt(2, Generado);
                if (!elemento.execute()) {
                    resp = true;
                }
                //cn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    //Encriptación
    
    String cRYPT;
    String secretKey = "Ejemplo";
    
    public String EncriptarPalabra(String valor){       
        
        Encriptacion en = new Encriptacion();
        
        cRYPT = en.encriptar(secretKey, valor);
        
        return cRYPT;
    }
    
    
    
    
    /**
     * @return the IdCarro
     */
    public Integer getIdCarro() {
        return IdCarro;
    }

    /**
     * @param IdCarro the IdCarro to set
     */
    public void setIdCarro(Integer IdCarro) {
        this.IdCarro = IdCarro;
    }

    /**
     * @return the pago
     */
    public Integer getPago() {
        return Pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(Integer pago) {
        this.Pago = pago;
    }    

    /**
     * @return the Factura
     */
    public Integer getFactura() {
        return Factura;
    }

    /**
     * @param Factura the Factura to set
     */
    public void setFactura(Integer Factura) {
        this.Factura = Factura;
    }

    /**
     * @return the NombrePago
     */
    public String getNombrePago() {
        return NombrePago;
    }

    /**
     * @param NombrePago the NombrePago to set
     */
    public void setNombrePago(String NombrePago) {
        this.NombrePago = NombrePago;
    }

    /**
     * @return the MontoPago
     */
    public Double getMontoPago() {
        return MontoPago;
    }

    /**
     * @param MontoPago the MontoPago to set
     */
    public void setMontoPago(Double MontoPago) {
        this.MontoPago = MontoPago;
    }

    /**
     * @return the MontoRecibo
     */
    public Double getMontoRecibo() {
        return MontoRecibo;
    }

    /**
     * @param MontoRecibo the MontoRecibo to set
     */
    public void setMontoRecibo(Double MontoRecibo) {
        this.MontoRecibo = MontoRecibo;
    }

    /**
     * @return the MontoRetorno
     */
    public Double getMontoRetorno() {
        return MontoRetorno;
    }

    /**
     * @param MontoRetorno the MontoRetorno to set
     */
    public void setMontoRetorno(Double MontoRetorno) {
        this.MontoRetorno = MontoRetorno;
    }

    /**
     * @return the IdTarjeta
     */
    public Integer getIdTarjeta() {
        return IdTarjeta;
    }

    /**
     * @param IdTarjeta the IdTarjeta to set
     */
    public void setIdTarjeta(Integer IdTarjeta) {
        this.IdTarjeta = IdTarjeta;
    }

    /**
     * @return the NombreTarjeta
     */
    public String getNombreTarjeta() {
        return NombreTarjeta;
    }

    /**
     * @param NombreTarjeta the NombreTarjeta to set
     */
    public void setNombreTarjeta(String NombreTarjeta) {
        this.NombreTarjeta = NombreTarjeta;
    }

    /**
     * @return the ApellidoTarjeta
     */
    public String getApellidoTarjeta() {
        return ApellidoTarjeta;
    }

    /**
     * @param ApellidoTarjeta the ApellidoTarjeta to set
     */
    public void setApellidoTarjeta(String ApellidoTarjeta) {
        this.ApellidoTarjeta = ApellidoTarjeta;
    }

    /**
     * @return the Pan
     */
    public String getPan() {
        return Pan;
    }

    /**
     * @param Pan the Pan to set
     */
    public void setPan(String Pan) {
        this.Pan = Pan;
    }

    /**
     * @return the vencimiento
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * @param vencimiento the vencimiento to set
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * @return the CVV
     */
    public String getCVV() {
        return CVV;
    }

    /**
     * @param CVV the CVV to set
     */
    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    /**
     * @return the IdCobro
     */
    public Integer getIdCobro() {
        return IdCobro;
    }

    /**
     * @param IdCobro the IdCobro to set
     */
    public void setIdCobro(Integer IdCobro) {
        this.IdCobro = IdCobro;
    }

    /**
     * @return the Indicador
     */
    public String getIndicador() {
        return Indicador;
    }

    /**
     * @param Indicador the Indicador to set
     */
    public void setIndicador(String Indicador) {
        this.Indicador = Indicador;
    }

    /**
     * @return the Generado
     */
    public Integer getGenerado() {
        return Generado;
    }

    /**
     * @param Generado the Generado to set
     */
    public void setGenerado(Integer Generado) {
        this.Generado = Generado;
    }

    /**
     * @return the Programado
     */
    public Integer getProgramado() {
        return Programado;
    }

    /**
     * @param Programado the Programado to set
     */
    public void setProgramado(Integer Programado) {
        this.Programado = Programado;
    }

    /**
     * @param Indicador the Indicador to set
     */


   
    
}
