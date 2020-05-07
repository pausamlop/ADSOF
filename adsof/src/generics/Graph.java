package generics;
import java.util.*;


/**
 * Esta clase modela los grafos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Graph<A,B> implements Collection<Node<A>>{

    private Set<Node<A>> nodes = new LinkedHashSet<Node<A>> ();
    private List<Edge<B>> edges = new ArrayList<Edge<B>>();



	public Set<Node<A>> getNodes() {
		return this.nodes;
	}

	public void setNodes(Set<Node<A>> nodes) {
		this.nodes = nodes;
	}

	public List<Edge<B>> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Edge<B>> edges) {
		this.edges = edges;
	}

	public Graph<A,B> nodes(Set<Node<A>> nodes) {
		this.nodes = nodes;
		return this;
	}

	public Graph<A,B> edges(List<Edge<B>> edges) {
		this.edges = edges;
		return this;
	}

	/* METODOS DE GRAFOS*/
	
	public void connect(Node<A> from, B valor, Node<A> to){
		/* ver que estan en el mismo grafo*/

		if (from.getGraph() == null) from.setGraph(this);
		if (to.getGraph() == null)to.setGraph(this);
		
		
		if(from.getGraph().equals(to.getGraph()) == false) return ;
		
		Edge<B> e = new Edge<B>(valor, from, to);
		edges.add(e);
		
	}
	
	
	
	
	/* Implementar interfaz coleccion */

	/**
 	* Esta clase modela los ConstrainedGraph
 	* 
	 */
	@Override
	public int size() {
        return nodes.size();
	}

	@Override
	public boolean isEmpty() {
        return nodes.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return nodes.contains(o);
	}

	@Override
	public Iterator<Node<A>> iterator() {
		return (Iterator<Node<A>>) nodes.iterator();
	}

	@Override
	public Object[] toArray() {
		return nodes.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
        return nodes.toArray(a);
	}

	@Override
	public boolean add(Node<A> e) {
		return nodes.add(e);
	}

	@Override
	public boolean remove(Object o) {
        return nodes.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
        return nodes.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Node<A>> c) {
		return nodes.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
        return nodes.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
        return nodes.retainAll(c);
	}

	@Override
	public void clear() {
        nodes.clear();
	}
	
	
	@Override
	public String toString() {
		String buf = "Nodes:\n";
		
		for (Node<A> n: nodes) buf += (n + "\n");
		buf += "Edges:\n";
		for (Edge<B> e: edges) buf += (e + "\n");
		return buf;
		
	}


    
}
