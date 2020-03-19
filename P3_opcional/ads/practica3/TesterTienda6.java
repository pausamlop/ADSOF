package ads.practica3;

/**
 * Tester del apartado 6 de la practica 3
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class TesterTienda6 {
	  public static void main(String[] args) {
	    Electrodomestico tele1 = new Television("Loewe", "Art 48 4K Plata", 1699.00,
					ClaseEnergetica.A, 48); /*Modelo de television a añadir al almacén */

        /*Añadimos el modelo de televisión anterior */
        Almacen.anadirModelo(tele1, 5);

        System.out.println("Existencias en almacen: \n");
        Almacen.mostrarInventario();
        
        Venta[] ventas = new Venta[3];
        ventas[0] = new VentaDomicilio(tele1); /*Venta a domicilio de la televisión*/

        /*Comprobamos que hay una televisión menos en stock tras la venta*/
        System.out.println("Venta realizada.Existencias en almacen: \n");
        Almacen.mostrarInventario();

        /*Anulamos la venta anterior, y comprobamos que hay una televisión más disponible*/
        Venta.anular();
        System.out.println("Venta anulada. Existencias en almacen: \n");
        Almacen.mostrarInventario();


        /*Recibimos 5 unidades extra, 10 en total. Actualizamos el stock */
        Almacen.actualizaExistencias(tele1, 10);
        System.out.print("Actualizando stock. Existencias en almacen: \n");
        Almacen.mostrarInventario();

           
        Electrodomestico tele2 = new Television("LG", "32LF592U", 271.92,
                    ClaseEnergetica.C, 32); /*Otro modelo de televisión a añadir al almacén */

		    Electrodomestico frigo1 = new Frigorifico("Bosch", "KGN39VW21", 599.0,
                    ClaseEnergetica.A, new Dimension(60, 65, 201), 83.0, true);/*Modelo de 
          frigorífico para añadir al almacén */
      
        /*Insertamos en el almacén los nuevos modelos de electrodoméstico */
        Almacen.anadirModelo(tele2, 7);
        Almacen.anadirModelo(frigo1, 15);
        System.out.print("Actualizando modelos. Existencias en almacen: \n");
        Almacen.mostrarInventario();

        
        /*Descatalogamos un modelo de televisión*/
        Almacen.descatalogarModelo(tele2);
        System.out.println("Descatalogando el modelo de televisión LG\n");
        
        /*Mostramos el stock de televisiones, comprobando que el modelo de LG se ha
        eliminado del almacén, y el método mostrarInventario pasando el tipo de 
        electrodoméstico como parámetro*/
        System.out.println("Mostrando stock de televisiones\n");
        Almacen.mostrarInventario("television");
	  }
	}