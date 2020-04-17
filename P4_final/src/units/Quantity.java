package src.units;


/**
 * Enumeracion de las distintas cantidades
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public enum Quantity {
        
    LENGTH{

    	/**
         * Modificación del método toString para adecuarlo a la salida
    	 * deseada
    	 * 
         * @return String deseado para imprimir por pantalla
         */
    	
        @Override
        public String toString() {
            return "L";

        }
    },
    
    TIME {
    	
    	/**
         * Modificación del método toString para adecuarlo a la salida
    	 * deseada
    	 * 
         * @return String deseado para imprimir por pantalla
         */
    	
        @Override
        public String toString() {
            return "T";
        }

    },

    COMPOSITE {
       	/**
         * Modificación del método toString para adecuarlo a la salida
    	 * deseada
    	 * 
         * @return String deseado para imprimir por pantalla
         */
    	
        @Override
        public String toString() {
            return "Composite";
        }

    }
    
    ;
}