package generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Sequence<T> implements IStrategy<T> {


	@Override
	public void behaviour(Set<Rule<T>> set, Collection<T> collection) {
		 for (Rule<T> r: set) {

	        	collection.forEach(s -> {
	        		if(r.getWhen().test(s))  r.getExec().accept(s);

	        	});
	        }
		
	}


	
	
}


	