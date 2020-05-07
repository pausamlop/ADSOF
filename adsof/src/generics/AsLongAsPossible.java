package generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Esta clase modela la estrategia AsLongAsPosible
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class AsLongAsPossible<T> implements IStrategy<T>{

	@Override
	public void behaviour(Set<Rule<T>> set, Collection<T> collection) {
		for (Rule<T> r: set) {

			collection.forEach(s -> {
				while(r.getWhen().test(s))  r.getExec().accept(s);

			});
		}
		
	}

    
}