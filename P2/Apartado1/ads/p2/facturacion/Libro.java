package ads.p2.facturacion;


/**
 * Esta clase modela los libros como otra forma de articulo.
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Libro extends Articulo {


	/* Atributos */
	  private String categoria;


	/**
     * Constructor de un objeto de la clase libro
	 * 
     * @param id id del objeto
	 * @param desc descuento del objeto
	 * @param precio precio del objeto
	 * @param categoria categoria del objeto
     */
	  public Libro(long id, String desc, double precio, String categ) {
		super(id, desc, precio);
		categoria = categ;
	  }


	/**
     * Getter de categoria
	 * 
	 * @return categoria del objeto
     */
	  public String getCategoria() { return categoria; }


	/**
     * Setter de categoria
	 * 
	 * @param categ categoria del objeto
     */ 
	  public void setCategoria(String categ) { categoria = categ; }


	/**
     * Metodo que devuelve el tipo de IVA del objeto
	 * 
	 * @return IVA del objeto
     */ 
	  public double tipoIVA() { return 0.04; }


	/**
     * Metodo que calcula el descuento de un objeto
	 * 
	 * @param unidades numero de objetos
	 * @return descuento del objeto
     */  
	  public double descuento(double unidades) {
	        if (categoria.equals("LibroDeTexto")){
                return (double)(unidades * 0.15 * getPrecioUnitario());
            } 
	        else if (categoria.equals("Coleccion") && unidades >= 3){
                return (double) (getPrecioUnitario()* (unidades-2) * 0.50 );
            }
            else return 0.0;
        }		
}

