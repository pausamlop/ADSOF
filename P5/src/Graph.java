
import java.util.*;

public class Graph<A,B> implements Collection<A>{

    private Set<Node<?>> nodes;
    private List<Edge<?>> edges;


	/* METODOS DE GRAFOS*/
	
	public static void connect(Node<?> from, <?> valor, Node<?> to){

	}

    /* IMPLEMENTA COLLECTION */
	@Override
	public boolean add(Object arg0) {
		return nodes.add((Node<?>)arg0);
	}

	@Override
	public boolean addAll(Collection arg0) {
		return nodes.addAll(arg0);
	}

	@Override
	public void clear() {
        nodes.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		return contains(arg0);
	}

	@Override
	public boolean containsAll(Collection arg0) {
        return nodes.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
        return nodes.isEmpty();
	}

	@Override
	public Iterator iterator() {
		return nodes.iterator();
	}

	@Override
	public boolean remove(Object arg0) {
        return nodes.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection arg0) {
        return nodes.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection arg0) {
        return nodes.retainAll(arg0);
	}

	@Override
	public int size() {
        return nodes.size();
	}

	@Override
	public Object[] toArray() {
		return nodes.toArray();
	}

	@Override
	public Object[] toArray(Object[] arg0) {
        return nodes.toArray(arg0);
    }
    
}
