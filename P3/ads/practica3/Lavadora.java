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


    public Lavadora(String marca, String modelo, double precio, ClaseEnergetica clase, Dimension dim, double peso, double cargaMaxima, int revMinuto) {
        super(marca, modelo, precio, clase, peso, dim);
        this.revMinuto = revMinuto;
        this.cargaMaxima = cargaMaxima;
    }

    public Lavadora(String marca, String modelo, double precio, ClaseEnergetica clase, Dimension dim, double peso) { super(marca, modelo, precio, clase, peso, dim);}



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

    public double precioPorte() {
        if(getPeso() <= 50.00) {
            return 35.00;
        }
        else {
            return 35.00 + (getPeso()-50.00)*0.50; //Preguntar esto
        }
    }

}