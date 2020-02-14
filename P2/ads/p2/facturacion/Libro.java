package ads.p2.facturacion;

public class Libro extends Articulo {
	  private String categoria;
	  public Libro(long id, String desc, double precio, String categ) {
		super(id, desc, precio);
		categoria = categ;
	  }
	  public String getCategoria() { return categoria; }
	  public void setCategoria(String categ) { categoria = categ; }
	  public double tipoIVA() { return 0.04; }
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

