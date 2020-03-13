package ads.practica3;

/**
 * Esta clase modela los elementos Electrodoméstico.
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public abstract class Electrodomestico {
    private String marca;
    private String modelo;
    private double precioBase;
    private ClaseEnergetica clase;


    public Electrodomestico(String marca, String modelo, double precioBase, ClaseEnergetica clase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.clase = clase;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public ClaseEnergetica getClase() {
        return this.clase;
    }

    public void setClase(ClaseEnergetica clase) {
        this.clase = clase;
    }

    public abstract double precioPorte();

    @Override
    public String toString(){
        String pBase = String.format("%.2f", precioBase);
        return marca + " " + modelo + ", " + pBase + " Euros";
      }

    
    @Override
    public boolean equals(Object obj){
       if (this.getMarca().equals(((Electrodomestico)obj).getMarca()) && this.getModelo().equals(((Electrodomestico)obj).getModelo())
        && this.getClass() == obj.getClass()) return true;
        return false;
    }
}