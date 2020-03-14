package ads.practica3;

public class VentaCanarias extends VentaDomicilio {

     /**
     * Método constructor de la clase VentaCanarias 
	 * 
     * @param nuevo Electrodoméstico que se compra en la tienda con envío a Canarias
     */
    public VentaCanarias(Electrodomestico nuevo) {
        super(nuevo);
    }

    /**
     * Método que calcula el precio a pagar en una venta con envío a Canarias
	 * 
	 * @return el importe requerido
     */
    @Override
    public double calcularPrecio() {
        return getNuevo().getPrecioBase() +getNuevo().getPrecioBase()*0.07;
    }

   
    /**
     * Método auxiliar de getTicket() que se encarga del String relativo a los portes a Canarias
	 * 
	 * @return String requerido
     */
     @Override
     public String getTicketPorte(){
        String buf = String.format("%19.2f", getNuevo().getPrecioBase()*0.07);
        return "Coste porte: " + buf + " Euros\n";
    }
     /**
     * Modificación de getTicket() que cuenta con los portes del envío a domicilio a Canarias
	 * 
	 * @return el ticket requerido
     */
    @Override
    public String getTicket() {
        return getTicketProducto() + getTicketPrecioBase() + getTicketDescuento() + getTicketPorte()+ getTicketTotal() + "\n";        
    }
}