package ads.practica3;

/**
 * Esta clase modela los electrodomésticos de tipo frigorífico
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Frigorifico extends ElectrodomesticoCocina {
    private boolean noFrost;


    public Frigorifico(String marca, String modelo, double precio, ClaseEnergetica clase, Dimension dim, double peso, boolean noFrost) {
        super(marca, modelo, precio, clase, peso, dim);
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
        long parteEntera;
        double importe=this.getDim().getVolumen() *70;  
        parteEntera = (long)importe;
        return importe - (double)parteEntera;
    }
    
    // @Override
    // public boolean equals(Object obj){
    //     if (this.getMarca().equals(((Electrodomestico)obj).getMarca()) && this.getModelo().equals(((Electrodomestico)obj).getModelo())
    //     && obj instanceof Frigorifico) return true;
        
    //     return false;
    // }

}