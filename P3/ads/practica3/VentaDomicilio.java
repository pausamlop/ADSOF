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


    /*********** GET TICKET *********/

    public String getTicketPorte(){
        String buf = String.format("%19.2f", getNuevo().precioPorte());
        return "Coste porte: " + buf + " Euros\n";
    }
   
    @Override
    public String getTicket() {
        return getTicketProducto() + getTicketPrecioBase() + getTicketDescuento() + getTicketPorte()+ getTicketTotal() + "\n";        
    }
}