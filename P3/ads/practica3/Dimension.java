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

    public double getVolumen() {
        return 0.01*x
    }


}