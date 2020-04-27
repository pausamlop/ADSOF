package units.composite;


/**
 * Enumeracion de los distintos operadores
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public enum Operator {
    MULT, DIV;

    @Override
    public String toString() {
        if (this == MULT) return "*";
        else return "/";
        
    }

}