package ads.practica3;

public class TelevisionCurva extends Television {
    Dimension dim;
    double peso;
    /**
     * Método constructor de la clase TelevisionCurva
	 * 
     * @param marca String de la marca
     * @param modelo String del modelo
     * @param precioBase double del precio base del electrodoméstico
     * @param clase clase energética del electrodoméstico
     * @param tamanoPantalla entero con las pulgadas de la pantalla
     * @param dim dimensiones del electrodoméstico
     * @param peso double del peso del producto
     */
    public TelevisionCurva(String marca, String modelo, double precio, ClaseEnergetica clase, int tamanoPantalla, Dimension dim, double peso) {
        super(marca,modelo,precio,clase,tamanoPantalla);
        this.dim = dim;
        this.peso = peso;

        //No se si aqui habria que hacer algo de herencia de Frigodora
    }
    /**
     * Método que calcula el precio del porte de una televisión en una venta a domicilio
     * según su tamaño de pantalla y dimensiones
	 * 
	 * @return el precio del porte
     */
    @Override 
    public double precioPorte() {
        return super.precioPorte() + dim.getVolumen()*25.00;
    }
}