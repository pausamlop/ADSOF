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

        String pBase = String.format("%15.2f", getNuevo().getPrecioBase());
        String desc = String.format("%13.2f", calcularDescuento());
        String pPorte = String.format("%19.2f", getNuevo().precioPorte()); 
        String precio = String.format("%25.2f", calcularPrecio()); 

        return "-------------------------------------------- \n" + 
        "Producto vendido: " + getNuevo().getMarca() + " " + getNuevo().getModelo()+ ", " + getNuevo().getPrecioBase() + " Euros"+ 
        "\n-------------------------------------------- \n" +
        "Precio producto: " + pBase + " Euros\n" +
        "Descuento entrega: " + desc + " Euros\n" +
        "Coste porte: " + pPorte + " Euros\n" +
        "TOTAL: " + precio + " Euros\n";
    }
}