package generics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Esta clase modela las reglas
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Rule<T> {

    private String name;
    private String description;

    private Predicate<T> when;
    private Consumer<T> exec;



    public Predicate<T> getWhen() {
        return this.when;
    }

    public Consumer<T> getExec() {
        return this.exec;
    }

    /**
    * Metodo constructor de rule
    * 
    * @param name String
    * @param description String
    */

    public Rule(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
    * Metodo setter del predicado when en la regla, que la devuelve para poder seguir
    * concatenando en las expresiones lambda
    * 
    * @param lambda predicado 
    * @return Rule<T>
    */
    public Rule<T> when(Predicate<T> lambda){
        this.when = lambda;
		return this;

    }

    /**
    * Metodo setter del predicado exec en la regla, que la devuelve para poder seguir
    * concatenando en las expresiones lambda
    * 
    * @param lambda predicado 
    * @return Rule<T>
    */
    public Rule<T> exec(Consumer<T> lambda){ 
        this.exec = lambda;
		return this;
        
    }

    /**
    * Metodo estatico de Rule
    * 
    * @param string String del nombre
    * @param string2 String de la descripcion
    * @return Rule<T>
    */
	public static <T> Rule<T> rule(String string, String string2) {
		
		return new Rule<T>(string, string2);
	}
    
}