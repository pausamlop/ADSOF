package ads.p2.facturacion;


/**
 * Esta clase modela el tabaco como otra forma de articulo.
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public class Tabaco extends Articulo {
	  public Tabaco(long id, String desc, double precio) {
		super(id, desc, precio);
	  }

	  public double descuento(double unidades) { return 0.0;}
}
