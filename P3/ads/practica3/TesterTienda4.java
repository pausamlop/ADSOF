package ads.practica3;

/**
 * Tester el apartado 4 de la pr�ctica 3
 * @author Profesores ADS
 */
public class TesterTienda4 {	
	public static void main(String[] args) {		
		// ejecutamos el tester1 para cargar electrodomesticos y ventas
		TesterTienda1.main(null);  
		
		System.out.println( Venta.resumenVentas() );
		System.out.println( Venta.ultima().getTicket());
		
		Venta anulada = Venta.anular();  // anulamos la �ltima venta    
		System.out.println("Venta anulada:\n" + anulada.getTicket());
		
		Venta.anular();  // anulamos otra
		// eliminado por redundante    Venta.resumenVentas(); // sin las dos ultimas ventas		
		System.out.println( Venta.resumenVentas(500) ); // sin las dos ultimas ventas, ni la de importe < 500
		System.out.println( Venta.resumenVentas("Indes") ); // solo ventas (no anuladas) de marca Indesit

	}
}
