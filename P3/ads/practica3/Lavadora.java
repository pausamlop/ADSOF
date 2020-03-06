package ads.practica3;


/**
 * Esta clase modela los electrodomésticos de tipo lavadora
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */



public class Lavadora extends ElectrodomesticoCocina {
    private int revMinuto;
    private double cargaMaxima;


    public Lavadora(int revMinuto, double cargaMaxima) {
        this.revMinuto = revMinuto;
        this.cargaMaxima = cargaMaxima;
    }


    public int getRevMinuto() {
        return this.revMinuto;
    }

    public void setRevMinuto(int revMinuto) {
        this.revMinuto = revMinuto;
    }

    public double getCargaMaxima() {
        return this.cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

}