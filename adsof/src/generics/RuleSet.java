package generics;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Esta clase modela los conjuntos de reglas
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class RuleSet<T> {

    private Set<Rule<T>> rules = new LinkedHashSet<>();
    private Collection<T> str;
    
    public Set<Rule<T>> getRules() { return rules; }
    
    
    public Collection<T> getStr() { 
    	if (str == null) return null;
    	return str; 
    }
    
    /**
     * Añade una regla al conjunto de reglas, que lo devuelve para poder seguir concatenando
     * en el codigo con expresiones lambda
     * 
     * @param rule Rule<T> a añadir al conjunto
     * @return RuleSet<T>
     */
    public RuleSet<T>  add(Rule<T> rule){
        rules.add(rule);
        return this;
    }


    public void setExecContext(Collection<T> str){
        this.str = str;
    }

    /**
     * Metodo encargado de ejecutar el conjunto de reglas
     *
     */
    public void process(){

        for (Rule<T> r: rules) {

        	str.forEach(s -> {
        		if(r.getWhen().test(s))  r.getExec().accept(s);

        	});
        }
    }


    

}