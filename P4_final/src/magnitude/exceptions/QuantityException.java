package src.magnitude.exceptions;

/**
 * Esta clase modela las excepciones de tipo QuantityException
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class QuantityException extends Exception {


    private static final long serialVersionUID = 1L;
    

     /**
     * Modificación del método toString de Magnitude para adecuarlo a la salida
	 * deseada
	 * 
     * @return String deseado para imprimir por pantalla
     */
    @Override
    public String toString() {
        return "Quantities t and L are not compatible";
    }
}