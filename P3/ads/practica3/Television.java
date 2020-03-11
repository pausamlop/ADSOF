package ads.practica3;


/**
 * Esta clase modela los electrodomésticos de tipo televisión
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public class Television extends Electrodomestico {
    private int tamanoPantalla;

    public Television(int tamanoPantalla) { this.tamanoPantalla = tamanoPantalla; }

    public int getTamanoPantalla() { return this.tamanoPantalla; }

    public void setTamanoPantalla(int tamanoPantalla) { this.tamanoPantalla = tamanoPantalla; }

    public double precioPorte() {
        if (tamanoPantalla <= 40){
            if(getPrecioBase() > 500) {
                return 0.0;
            }else {
                return 35.0;
            }
        }
        else {
            return 35.0 + ((double)tamanoPantalla-40)
        }
    }

}