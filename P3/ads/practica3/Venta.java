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


    public Venta(Electrodomestico viejo, Electrodomestico nuevo) {
        this.viejo = viejo;
        this.nuevo = nuevo;
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

    //public getTicket()



    public double calcularPrecio(){ return nuevo.getPrecioBase() - calcularDescuento(); }

    public double calcularDescuento(){

        if (viejo.getClase().equals(nuevo.getClase())) return 25.0;
        if (viejo.getClase() > nuevo.getClase()) return 25.0 + 15.0*(viejo.getClase() - nuevo.getClase());
        if (viejo.getClase() < nuevo.getClase()) return 25.0 - 5.0*(nuevo.getClase() - viejo.getClase());
        if (viejo.getClase().equals("desconocida")) return 10.0;
        
        return 0.0;
    }


}