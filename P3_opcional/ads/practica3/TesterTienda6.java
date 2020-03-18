package ads.practica3;

/**
 * Tester del apartado 6 de la practica 3
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class TesterTienda6 {
	  public static void main(String[] args) {
	    Electrodomestico tele1 = new TelevisionCurva("Loewe", "Art 48 4K Plata", 1699.00,
					ClaseEnergetica.A, 48, new Dimension(107.0, 60.5, 3.5), 16.7); /*Creamos una
					televisión curva para comprobar la nueva clase, que cuenta, adicionalmente
                    con dimensión y peso */
        
        Almacen.anadirModelo(tele1, 3);

        System.out.println("Existencias en almacen: \n");
        Almacen.mostrarInventario();
        
        Venta[] ventas = new Venta[3];
        ventas[0] = new VentaDomicilio(tele1); /*Venta a domicilio de la televisión curva */

        System.out.println("Venta realizada.Exixtencias en almacen: \n");
        Almacen.mostrarInventario();

        Venta.anular();

        System.out.println("Venta anulada. Existencias en almacen: \n");
        Almacen.mostrarInventario();

        Almacen.actualizaExistencias(tele1, 10);
        System.out.print("Actualizando stock. Existencias en almacen: \n");
        Almacen.mostrarInventario();

           
        Electrodomestico tele2 = new Television("LG", "32LF592U", 271.92,
                    ClaseEnergetica.C, 32); /*Creamos una televisión no curva con idénticas 
					características que la anterior */

		Electrodomestico frigo1 = new Frigorifico("Bosch", "KGN39VW21", 599.0,
					ClaseEnergetica.A, new Dimension(60, 65, 201), 83.0, true);/*Creamos un 
					frigorífico */
			
        Almacen.anadirModelo(tele2, 7);
        Almacen.anadirModelo(frigo1, 15);

        System.out.println("Descatalogando el modelo de televisión LG\n");
        
        Almacen.descatalogarModelo(tele2);
        
        System.out.println("Mostrando stock de televisiones\n");
        Almacen.mostrarInventario("television");
	  }
	}