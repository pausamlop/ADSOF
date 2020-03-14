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

    /**
     * Método constructor de la clase abstracta Electrodomestico
	 * 
     * @param marca String de la marca
     * @param modelo String del modelo
     * @param precioBase double del precio base del electrodoméstico
     * @param clase clase energética del electrodoméstico
     */
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
    /**
     * Método que calcula el precio del porte de un electrodoméstico en una venta a domicilio
	 * 
	 * @return el precio del porte
     */
    public abstract double precioPorte();


    /**
     * Modificación del método toString para imprimir un electrodoméstico de la forma deseada
	 * 
	 * @return String del toString modificado
     */
    @Override
    public String toString(){
        String pBase = String.format("%.2f", precioBase);
        return marca + " " + modelo + ", " + pBase + " Euros";
      }

    /**
     * Modificación del método equals para comparar si dos electrodomésticos son iguales, 
     * atendiendo a las condiciones requeridas
	 * 
     * @param obj objeto a comparar
	 * @return boolean: true si son iguales, false en caso contario
     */
    @Override
    public boolean equals(Object obj){
       if (this.getMarca().equals(((Electrodomestico)obj).getMarca()) && this.getModelo().equals(((Electrodomestico)obj).getModelo())
        && this.getClass() == obj.getClass()) return true;
        return false;
    }
}