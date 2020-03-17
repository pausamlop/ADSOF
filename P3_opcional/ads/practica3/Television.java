package ads.practica3;


/**
 * Esta clase modela los electrodomésticos de tipo televisión
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public class Television extends Electrodomestico {
    private int tamanoPantalla;
    /**
     * Método constructor de la clase Television
	 * 
     * @param marca String de la marca
     * @param modelo String del modelo
     * @param precioBase double del precio base del electrodoméstico
     * @param clase clase energética del electrodoméstico
     * @param tamanoPantalla entero con las pulgadas de la pantalla
     */
    public Television(String marca, String modelo, double precio, ClaseEnergetica clase, int tamanoPantalla) { 
        super(marca, modelo, precio, clase);
        this.tamanoPantalla = tamanoPantalla; }

    public int getTamanoPantalla() { return this.tamanoPantalla; }

    public void setTamanoPantalla(int tamanoPantalla) { this.tamanoPantalla = tamanoPantalla; }


    /**
     * Método que calcula el precio del porte de una televisión en una venta a domicilio
     * según su tamaño de pantalla
	 * 
	 * @return el precio del porte
     */
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

 
}