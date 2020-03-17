package ads.practica3;
import java.util.ArrayList;


/**
 * Esta clase modela las ventas de los diferentes electrodomésticos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Venta {

    private Electrodomestico viejo;
    private Electrodomestico nuevo;
    private static ArrayList<Venta> ventas = new ArrayList<Venta>();

    /**
     * Método constructor de la clase Venta con electrodoméstico a entregar por parte del cliente
	 * 
     * @param nuevo Electrodoméstico que se compra en la tienda
     * @param viejo Electrodoméstico entregado por el cliente para obtener un descuento
     */
    public Venta(Electrodomestico nuevo, Electrodomestico viejo) {
        this.viejo = viejo;
        this.nuevo = nuevo;
        ventas.add(this); 
    }
    /**
     * Método constructor de la clase venta sin entrega de electrodoméstico por parte del cliente
	 * 
     * @param nuevo Electrodoméstico que se compra en la tienda
    */
    public Venta(Electrodomestico nuevo) { 
        this.nuevo = nuevo; 
        ventas.add(this);
    }


    public Electrodomestico getViejo() {
        return this.viejo;
    }

    public void setViejo(Electrodomestico viejo) {
        this.viejo = viejo;
    }

    public Electrodomestico getNuevo() {
        return this.nuevo;
    }

    public void setNuevo(Electrodomestico nuevo) {
        this.nuevo = nuevo;
    }

    public static ArrayList<Venta> getVentas() {
        return ventas;
    }

    public static void setVentas(ArrayList<Venta> venta) {
        Venta.ventas = venta;
    }

    /**
     * Método que calcula el precio a pagar en una venta con descuento y sin entrega a domicilio
	 * 
	 * @return el importe requerido
     */
    public double calcularPrecio(){ 
        return nuevo.getPrecioBase() - calcularDescuento(); 
    }

    /**
     * Método que calcula el descuento a aplicar al cliente según el electrodoméstico antiguo que ha entregado
	 * 
	 * @return el importe del descuento
     */
    public double calcularDescuento(){

        if (viejo == null) return 0.00;

        if (viejo.getClase().equals(ClaseEnergetica.Desconocida)) return 10.00;
        if (viejo.getClase().ordinal() == nuevo.getClase().ordinal()){ return 25.00; }
        if (viejo.getClase().ordinal() > nuevo.getClase().ordinal()) return 25.00 + 15.00*(viejo.getClase().ordinal() - nuevo.getClase().ordinal());
        return 25.00 - 5.00*(nuevo.getClase().ordinal() - viejo.getClase().ordinal());
    }

    /**
     * Método auxiliar de getTicket() que se encarga del String relativo a los productos vendidos
	 * 
	 * @return String requerido
     */
    public String getTicketProducto(){
        String buf = String.format("%.2f", nuevo.getPrecioBase());
        return "-------------------------------------------- \n" + 
        "Producto vendido: " +  nuevo.getMarca() + " " + 
        nuevo.getModelo() + ", " + buf + " Euros\n" +
        "-------------------------------------------- \n";
    }
    
      /**
     * Método auxiliar de getTicket() que se encarga del String relativo a los precios 
     * base de los productos
	 * 
	 * @return String requerido
     */
    public String getTicketPrecioBase() {
        String buf = String.format("%15.2f", nuevo.getPrecioBase());
        return "Precio producto: " + buf + " Euros\n";
        
    }
    /**
     * Método auxiliar de getTicket() que se encarga del String relativo a los descuentos
     * en las compras al entregar un electrodoméstico antiguo
     * 
	 * @return String requerido
     */
    public String getTicketDescuento(){
        String buf = String.format("%13.2f", calcularDescuento());
        return "Descuento entrega: " + buf + " Euros\n";
    }
    /**
     * Método auxiliar de getTicket() que se encarga del String relativo a los importes totales en
     * las compras
     * 
	 * @return String requerido
     */
    public String getTicketTotal() {
        String buf = String.format("%25.2f", calcularPrecio()); 
        return "TOTAL: " + buf + " Euros\n"; 
    }
    /**
     * Método que devuelve un String a semejanza de un ticket de compra de una tienda 
     * en la que se muestra la información de los electrodomésticos vendidos, los descuentos
     * por entrega de aparatos viejos, los costes de porte por envío a domicilio y el importe
     * total de la compra
	 * 
	 * @return String requerido
     */
    public String getTicket() {
        return getTicketProducto() + getTicketPrecioBase() + getTicketDescuento() + getTicketTotal() + "\n"; 
    }


      /**
     * Método construye un String a modo de resumen de las ventas, con el importe final a pagar
	 * 
	 * @return String requerido
     */
    public static String resumenVentas(){
        String buf = "RESUMEN DE VENTAS\n";
        for (Venta v: Venta.ventas) buf = buf + v.getTicketTotal();
        return buf;
    }

    /**
     * Modificación de resumenVentas() que muestra únicamente las ventas con un importe mayor 
     * introducido por parámetro
     * 
     * @param par double del precio a partir del cual mostrar las ventas
	 * 
	 * @return String requerido
     */
    public static String resumenVentas(double par){
        String buf = "RESUMEN DE VENTAS\n";
        for (Venta v: Venta.ventas) {
            if (v.calcularPrecio() >= par) buf += v.getTicketTotal();
        }
        return buf;
    }
    /**
     * Método auxiliar de resumenVentas() que muestra únicamente las ventas de la marca 
     * pasada por parámetro
     * 
     * @param str String de la marca de la que mostrar las ventas
	 * 
	 * @return String requerido
     */
    public static String resumenVentas(String str){
        String buf = "RESUMEN DE VENTAS\n";
        for (Venta v: Venta.ventas){
            if (v.getNuevo().getMarca().contains(str)) buf += v.getTicketTotal();
        } 
        return buf;
    }

    /**
     * Método que devuelve la última venta efectuada
	 * 
	 * @return Venta requerida
     */
    public static Venta ultima(){
        if (ventas.isEmpty()) return null;
        return Venta.ventas.get(Venta.ventas.size() - 1);
    }
    /**
     * Método que elimina la última venta efectuada y posteriormente la devuelve
	 * 
	 * @return Venta requerida
     */
    public static Venta anular(){
        if (ventas.isEmpty()) return null;
        Venta v = ultima();
        //actualizarExistencias()
        Venta.ventas.remove(Venta.ventas.size() - 1);
        return v;
    }

}
