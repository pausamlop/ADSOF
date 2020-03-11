package ads.practica3;

/**
 * Esta clase modela los electrodomésticos de tipo frigorífico
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Frigorifico extends ElectrodomesticoCocina {
    private boolean noFrost;



    public Frigorifico(boolean noFrost) {
        this.noFrost = noFrost;
    }


    public Frigorifico(boolean noFrost) {
        this.noFrost = noFrost;
    }

    public boolean isNoFrost() {
        return this.noFrost;
    }

    public boolean getNoFrost() {
        return this.noFrost;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }

    public double precioPorte() {
        double volumen = 0.01 *getDim()
    }
    

}