package ads.practica3;

/**
 * Esta clase abstracta modela los electrodomésticos de tipo ElectrodomesticoCocina
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public abstract class ElectrodomesticoCocina extends Electrodomestico{
    private double peso;
    private Dimension dim;

     /**
     * Método constructor de la clase abstracta ElectrodomesticoCocina
	 * 
     * @param marca String de la marca
     * @param modelo String del modelo
     * @param precioBase double del precio base del electrodoméstico
     * @param clase clase energética del electrodoméstico
     * @param dim dimensiones del electrodoméstico
     * @param peso double del peso del producto
     */
    public ElectrodomesticoCocina(String marca, String modelo, double precio, ClaseEnergetica clase, Dimension dim, double peso) {
        super(marca, modelo, precio, clase);
        this.peso = peso;
        this.dim = dim;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimension getDim() {
        return this.dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    

}