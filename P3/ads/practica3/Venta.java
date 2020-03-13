package ads.practica3;


/**
 * Esta clase modela las ventas de los diferentes electrodomésticos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Venta {

    private Electrodomestico viejo;
    private Electrodomestico nuevo;


    public Venta(Electrodomestico nuevo, Electrodomestico viejo) {
        this.viejo = viejo;
        this.nuevo = nuevo;
    }

    public Venta(Electrodomestico nuevo) { this.nuevo = nuevo; }


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


    public double calcularPrecio(){ return nuevo.getPrecioBase() - calcularDescuento(); }

    public double calcularDescuento(){

        if (viejo == null) return 0.00;

        if (viejo.getClase().equals(ClaseEnergetica.Desconocida)) return 10.00;
        if (viejo.getClase().ordinal() == nuevo.getClase().ordinal()){ return 25.00; }
        if (viejo.getClase().ordinal() > nuevo.getClase().ordinal()) return 25.00 + 15.00*(viejo.getClase().ordinal() - nuevo.getClase().ordinal());
        return 25.00 - 5.00*(nuevo.getClase().ordinal() - viejo.getClase().ordinal());
    }


    public String getTicket() {
        return "-------------------------------------------- \n" + 
        "Producto vendido: " +  nuevo.getMarca() + " " + nuevo.getModelo() + ", " + nuevo.getPrecioBase() + " Euros\n" +
        "-------------------------------------------- \n" + 
        "Precio producto: " + "        " + nuevo.getPrecioBase() + " Euros\n" +
        "Descuento entrega: " + "        "+ calcularDescuento() + " Euros\n" +
        "TOTAL: " + "                  " +calcularPrecio() + " Euros\n"; 
    }

}