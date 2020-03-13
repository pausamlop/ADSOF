package ads.practica3;


/**
 * Esta clase modela las ventas a domicilio de los diferentes electrodomésticos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class VentaDomicilio extends Venta {

    public VentaDomicilio(Electrodomestico viejo, Electrodomestico nuevo) { super(viejo,nuevo); }

    public VentaDomicilio(Electrodomestico nuevo) { super(nuevo); }

    @Override
    public double calcularPrecio(){ return getNuevo().getPrecioBase() - calcularDescuento() + getNuevo().precioPorte();

    }
    @Override
    public String getTicket() {
        return "-------------------------------------------- \n" + 
        "Producto vendido: " + getNuevo().getMarca() + " " + getNuevo().getModelo()+ ", " + getNuevo().getPrecioBase() + " Euros"+ 
        "\n-------------------------------------------- \n" +
        "Precio producto: " + getNuevo().getPrecioBase() + " Euros\n" +
        "Descuento entrega: " + calcularDescuento() + " Euros\n" +
        "Coste porte: " + getNuevo().precioPorte() + " Euros\n" +
        "TOTAL: " + calcularPrecio() + " Euros\n";
    }
}