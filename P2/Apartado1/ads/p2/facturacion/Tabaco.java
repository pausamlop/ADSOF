package ads.p2.facturacion;


/**
 * Esta clase modela el tabaco como otra forma de articulo.
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Tabaco extends Articulo {


	/**
     * Constructor de un objeto de la clase tabaco
	 * 
     * @param id id del objeto
	 * @param desc descuento del objeto
	 * @param precio precio del objeto
     */
	  public Tabaco(long id, String desc, double precio) {
		super(id, desc, precio);
	  }


	/**
     * Método que devuelve el descuento de un objeto de la 
	 * clase tabaco.
	 * 
     * @param unidades las unidades del objeto
	 * @return el descuento del objeto
     */
	  public double descuento(double unidades) { return 0.0;}

}
