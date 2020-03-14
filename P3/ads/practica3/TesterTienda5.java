package ads.practica3;

/**
 * Tester del apartado 5 de la practica 3
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class TesterTienda5 {
	  public static void main(String[] args) {
	    Electrodomestico tele1 = new TelevisionCurva("Loewe", "Art 48 4K Plata", 1699.00,
					ClaseEnergetica.A, 48, new Dimension(107.0, 60.5, 3.5), 16.7); /*Creamos una
					televisión curva para comprobar la nueva clase, que cuenta, adicionalmente
					con dimensión y peso */
                    
        Electrodomestico tele2 = new Television("Loewe", "Art 48 4K Plata", 1699.00,
					ClaseEnergetica.A, 48); /*Creamos una televisión no curva con idénticas 
					características que la anterior */

		Electrodomestico frigo1 = new Frigorifico("Bosch", "KGN39VW21", 599.0,
					ClaseEnergetica.A, new Dimension(60, 65, 201), 83.0, true);/*Creamos un 
					frigorífico */
			
	    Venta[] ventas = new Venta[3];
        ventas[0] = new VentaDomicilio(tele1); /*Venta a domicilio de la televisión curva */
		ventas[1] = new VentaCanarias(tele2); /*Venta a Canarias de la televisión no curva */
		ventas[2] = new VentaCanarias(frigo1); /*Venta a Canarias del frigorífico */
		for (Venta v : ventas) 
	    	System.out.print(v.getTicket());		
	  }
	}

