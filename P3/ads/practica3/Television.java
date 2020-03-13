package ads.practica3;


/**
 * Esta clase modela los electrodomésticos de tipo televisión
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public class Television extends Electrodomestico {
    private int tamanoPantalla;

    public Television(String marca, String modelo, double precio, ClaseEnergetica clase, int tamanoPantalla) { 
        super(marca, modelo, precio, clase);
        this.tamanoPantalla = tamanoPantalla; }

    public int getTamanoPantalla() { return this.tamanoPantalla; }

    public void setTamanoPantalla(int tamanoPantalla) { this.tamanoPantalla = tamanoPantalla; }

    public double precioPorte() {
        if (tamanoPantalla <= 40){
            if(getPrecioBase() > 500.00) {
                return 0.00;
            }else {
                return 35.00;
            }
        }
        else {
            return 35.00 + ((double)tamanoPantalla-40.00);
        }
    }

    // @Override
    // public boolean equals(Object obj){
    //     if (this.getMarca().equals(((Electrodomestico)obj).getMarca()) && this.getModelo().equals(((Electrodomestico)obj).getModelo())
    //     && obj instanceof Television) return true;
        
    //     return false;
    // }

}