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


    public Venta(Electrodomestico nuevo, Electrodomestico viejo) {
        this.viejo = viejo;
        this.nuevo = nuevo;
        ventas.add(this); 
    }

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


    public double calcularPrecio(){ return nuevo.getPrecioBase() - calcularDescuento(); }

    public double calcularDescuento(){

        if (viejo == null) return 0.00;

        if (viejo.getClase().equals(ClaseEnergetica.Desconocida)) return 10.00;
        if (viejo.getClase().ordinal() == nuevo.getClase().ordinal()){ return 25.00; }
        if (viejo.getClase().ordinal() > nuevo.getClase().ordinal()) return 25.00 + 15.00*(viejo.getClase().ordinal() - nuevo.getClase().ordinal());
        return 25.00 - 5.00*(nuevo.getClase().ordinal() - viejo.getClase().ordinal());
    }


    /*********** GET TICKET *********/

    public String getTicketProducto(){
        String buf = String.format("%.2f", nuevo.getPrecioBase());
        return "-------------------------------------------- \n" + 
        "Producto vendido: " +  nuevo.getMarca() + " " + 
        nuevo.getModelo() + ", " + buf + " Euros\n" +
        "-------------------------------------------- \n";
    }
    
    public String getTicketPrecioBase() {
        String buf = String.format("%15.2f", nuevo.getPrecioBase());
        return "Precio producto: " + buf + " Euros\n";
        
    }

    public String getTicketDescuento(){
        String buf = String.format("%13.2f", calcularDescuento());
        return "Descuento entrega: " + buf + " Euros\n";
    }

    public String getTicketTotal() {
        String buf = String.format("%25.2f", calcularPrecio()); 
        return "TOTAL: " + buf + " Euros\n"; 
    }

    public String getTicket() {
        return getTicketProducto() + getTicketPrecioBase() + getTicketDescuento() + getTicketTotal() + "\n"; 
    }


    /**************************************/
    public static String resumenVentas(){
        String buf = "RESUMEN DE VENTAS\n";
        for (Venta v: Venta.ventas) buf = buf + v.getTicketTotal();
        return buf;
    }

    
    public static String resumenVentas(double par){
        String buf = "RESUMEN DE VENTAS\n";
        for (Venta v: Venta.ventas) {
            if (v.calcularPrecio() >= par) buf += v.getTicketTotal();
        }
        return buf;
    }

    public static String resumenVentas(String str){
        String buf = "RESUMEN DE VENTAS\n";
        for (Venta v: Venta.ventas){
            if (v.getNuevo().getMarca().contains(str)) buf += v.getTicketTotal();
        } 
        return buf;
    }


    public static Venta ultima(){
        if (ventas.isEmpty()) return null;
        return Venta.ventas.get(Venta.ventas.size() - 1);
    }
    
    public static Venta anular(){
        if (ventas.isEmpty()) return null;
        Venta v;
        v = ultima();
        Venta.ventas.remove(Venta.ventas.size() - 1);
        return v;
    }

}
