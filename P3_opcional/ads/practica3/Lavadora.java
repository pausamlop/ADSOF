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

  /**
     * Método constructor de la clase Lavadora con la información adicional
	 * 
     * @param marca String de la marca
     * @param modelo String del modelo
     * @param precioBase double del precio base del electrodoméstico
     * @param clase clase energética del electrodoméstico
     * @param dim dimensiones del electrodoméstico
     * @param peso double del peso del producto
     * @param cargaMaxima double que indica la carga máxima de la lavadora
     * @param revMinuto entero que indica las revoluciones por minuto de la lavadora
     */
    public Lavadora(String marca, String modelo, double precio, ClaseEnergetica clase, Dimension dim, double peso, double cargaMaxima, int revMinuto) {
        super(marca, modelo, precio, clase, dim, peso);
        this.revMinuto = revMinuto;
        this.cargaMaxima = cargaMaxima;
    }
  /**
     * Método constructor de la clase Lavadora sin la información adicional
	 * 
     * @param marca String de la marca
     * @param modelo String del modelo
     * @param precioBase double del precio base del electrodoméstico
     * @param clase clase energética del electrodoméstico
     * @param dim dimensiones del electrodoméstico
     * @param peso double del peso del producto
     */
    public Lavadora(String marca, String modelo, double precio, ClaseEnergetica clase, Dimension dim, double peso) { 
        super(marca, modelo, precio, clase, dim, peso);
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

    /**
     * Método que calcula el precio del porte de una lavadora en una venta a domicilio
     * según su peso
	 * 
	 * @return el precio del porte
     */
    public double precioPorte() {
        if(getPeso() <= 50.00) {
            return 35.00;
        }
        else {
            return 35.00 + (getPeso()-50.00)*0.50; //Preguntar esto
        }
    }


}

