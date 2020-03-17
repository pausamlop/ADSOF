package ads.practica3;

/**
 * Esta clase modela los electrodomésticos de tipo frigorífico
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Frigorifico extends ElectrodomesticoCocina {
    private boolean noFrost;

    /**
     * Método constructor de la clase Frigorifico
	 * 
     * @param marca String de la marca
     * @param modelo String del modelo
     * @param precioBase double del precio base del electrodoméstico
     * @param clase clase energética del electrodoméstico
     * @param dim dimensiones del electrodoméstico
     * @param peso double del peso del producto
     * @param noFrost booleano que indica si el frigorífico cuenta con noFrost
     */
    public Frigorifico(String marca, String modelo, double precio, ClaseEnergetica clase, Dimension dim, double peso, boolean noFrost) {
        super(marca, modelo, precio, clase, dim, peso);
        this.noFrost = noFrost;
    }


    public boolean getNoFrost() {
        return this.noFrost;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }
    /**
     * Método redefinido que calcula el precio del porte de un frigorífico en una venta a domicilio
     * según sus dimensiones
	 * 
	 * @return el precio del porte
     */
    public double precioPorte() {
        long parteEntera;
        double importe=this.getDim().getVolumen() *70;  
        parteEntera = (long)importe;
        return importe - (double)parteEntera;
    }

}