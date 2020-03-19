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




    /**
     * Método auxiliar para el métido leer que crea una televisión con los datos leídos 
	 * 
	 * @return la televisión requerida
     */
    public static Electrodomestico crearTelevision(String[] args){
        Electrodomestico e = new Television(args[0], args[1], Double.parseDouble(args[2]), ClaseEnergetica.valueOf(args[3]), Integer.parseInt(args[4]));
        return e;
    }
    /**
     * Método auxiliar para el métido leer que crea una lavadora con los datos leídos 
	 * 
	 * @return la lavadora requerida
     */
    public static Electrodomestico crearLavadora(String[] args) {
        if (args.length == 8){
            Electrodomestico e = new Lavadora(args[0], args[1], Double.parseDouble(args[2]), ClaseEnergetica.valueOf(args[3]), 
            new Dimension(Double.parseDouble(args[4]), Double.parseDouble(args[5]),Double.parseDouble(args[6])), Double.parseDouble(args[7]));
            
            return e;
        }
 
        Electrodomestico e = new Lavadora(args[0], args[1], Double.parseDouble(args[2]), ClaseEnergetica.valueOf(args[3]), 
        new Dimension(Double.parseDouble(args[4]), Double.parseDouble(args[5]),Double.parseDouble(args[6])), Double.parseDouble(args[7]), 
        Double.parseDouble(args[8]),Integer.parseInt(args[9]));
        
        return e;
    }
       /**
     * Método auxiliar para el métido leer que crea un frigorífico con los datos leídos 
	 * 
	 * @return el frigorífico requerido
     */
    public static Electrodomestico crearFrigorifico(String[] args){
        Electrodomestico e = new Frigorifico(args[0], args[1], Double.parseDouble(args[2]), 
        ClaseEnergetica.valueOf(args[3]), new Dimension(Double.parseDouble(args[4]),Double.parseDouble(args[5]),Double.parseDouble(args[6])),
        Double.parseDouble(args[7]), Boolean.parseBoolean(args[8]));
        return e;
    }
}