import ads.p2.facturacion.*;


/**
 * Esta clase prueba las clases alimento y articulo implementadas.
 *
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Ejemplo1 {

	/**
	 * Metodo main.
	 * @param args argumentos
	 */
  public static void main(String args[]) {
      	Articulo a1 = new Alimento(990034, "Chocolate a la taza", 2.5, true);
	       System.out.println("Precio total: "
		             + a1.precioTotal(7)); // 13.75 = (7 * 2.5 – 2 * 2.5) * 1.10
      	Alimento a2 = new Alimento(990268, "Yogur liquido", 1.25, false);
	      System.out.println("Precio total: "
		             + a2.precioTotal(4)); // 5.5 = (4 * 1.25 – 0.0) * 1.10

  }
}
