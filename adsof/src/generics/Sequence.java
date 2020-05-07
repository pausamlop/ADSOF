package generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Esta clase modela la secuencia
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Sequence<T> implements IStrategy<T> {

	/**
     * Establece el comportamiento 
	 * @param set, conjunto de reglas
	 * @param collection coleccion 
     *
     */
	@Override
	public void behaviour(Set<Rule<T>> set, Collection<T> collection) {
		 for (Rule<T> r: set) {

	        	collection.forEach(s -> {
	        		if(r.getWhen().test(s))  r.getExec().accept(s);

	        	});
	        }
		
	}


	
	
}


	