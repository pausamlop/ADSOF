package ads.practica3;

/**
 * Esta clase modela los electrodomésticos de tipo ElectrodomesticoCocina
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public abstract class ElectrodomesticoCocina extends Electrodomestico{
    private double peso;
    private Dimension dim;


    public ElectrodomesticoCocina(double peso, Dimension dim) {
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