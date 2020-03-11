package ads.practica3;


/**
 * Esta clase modela las ventas a domicilio de los diferentes electrodomésticos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class VentaDomicilio extends Venta {
    


    @override
    public double calcularPrecio(){ return nuevo.getPrecioBase() - calcularDescuento() + nuevo.precioPorte();

    }
}