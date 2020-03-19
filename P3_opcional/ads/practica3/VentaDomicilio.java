package ads.practica3;


/**
 * Esta clase modela las ventas a domicilio de los diferentes electrodomésticos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class VentaDomicilio extends Venta {
     /**
     * Método constructor de la clase VentaDomicilio con electrodoméstico a entregar por parte del cliente
	 * 
     * @param nuevo Electrodoméstico que se compra en la tienda
     * @param viejo Electrodoméstico entregado por el cliente para obtener un descuento
     */
    public VentaDomicilio(Electrodomestico viejo, Electrodomestico nuevo) { 
        super(viejo,nuevo); 
    }
     /**
     * Método constructor de la clase VentaDomicilio sin electrodoméstico a entregar por 
     * parte del cliente
	 * 
     * @param nuevo Electrodoméstico que se compra en la tienda
     */
    public VentaDomicilio(Electrodomestico nuevo) { 
        super(nuevo); 
    }

    /**
     * Método que calcula el precio a pagar en una venta con descuento y contando el importe 
     * de entrega a domicilio
	 * 
	 * @return el importe requerido
     */
    @Override
    public double calcularPrecio(){ 
        return getNuevo().getPrecioBase() - calcularDescuento() + getNuevo().precioPorte();
    }


    /**
     * Método auxiliar de getTicket() que se encarga del String relativo a los portes
	 * 
	 * @return String requerido
     */

    protected String getTicketPorte(){
        String buf = String.format("%19.2f", getNuevo().precioPorte());
        return "Coste porte: " + buf + " Euros\n";
    }
   
    /**
     * Modificación de getTicket() que cuenta con los portes del envío a domicilio
	 * 
	 * @return el ticket requerido
     */
    @Override
    public String getTicket() {
        return getTicketProducto() + getTicketPrecioBase() + getTicketDescuento() + getTicketPorte()+ getTicketTotal() + "\n";        
    }
}