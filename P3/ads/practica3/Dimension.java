package ads.practica3;


/**
 * Esta clase modela las dimensiones de los electrodomésticos de tipo ElectrodomesticoCocina
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public class Dimension {
    private double x;
    private double y;
    private double z;

    /**
     * Método constructor de la clase Dimension
	 * 
     * @param x medida eje x en centímetros
     * @param y medida eje y en centímetros	 
     * @param z medida eje z en centímetros
     */
    public Dimension(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Método que devuelve el volumen asociado a la clase Dimension, en metros cúbicos
	 * 
	 * @return el volumen en metros cúbicos
     */
    public double getVolumen() {
        return 0.01*x*0.01*y*0.01*z;
    }


}