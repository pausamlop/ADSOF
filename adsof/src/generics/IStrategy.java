package generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;

	/**
	 * Interfaz IStrategy
	 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
     * @author Paula Samper paula.samper@estudiante.uam.es
 	 * 
	 */
public interface IStrategy<T>{
    void behaviour(Set<Rule<T>> set, Collection<T> collection);

}
