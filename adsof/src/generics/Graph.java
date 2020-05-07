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
	
	/**
     * Conecta dos nodos pasados como argumento 
	 * @param from, Node origen de la conexion
	 * @param to, Node destino de la conexion
     *
     */
	public void connect(Node<A> from, B valor, Node<A> to){
		/* ver que estan en el mismo grafo*/

		if (from.getGraph() == null) from.setGraph(this);
		if (to.getGraph() == null)to.setGraph(this);
		
		
		if(from.getGraph().equals(to.getGraph()) == false) return ;
		
		Edge<B> e = new Edge<B>(valor, from, to);
		edges.add(e);
		
	}
	
	
	
	
	/* Implementacion interfaz coleccion */

	/**
	 * Devuelve el tamaño del grafo
	 * @return int con el tamaño
 	 * 
	 */
	@Override
	public int size() {
        return nodes.size();
	}


	/**
	 * Comprueba si el grafo esta vacio
	 * @return true si esta vacio, false en caso contrario
 	 * 
	 */
	@Override
	public boolean isEmpty() {
        return nodes.isEmpty();
	}

	/**
	 * Comprueba si el grafo contiene un objeto pasado como argumento
	 * @param o objeto a comprobar
	 * @return true si se cuenta con dicho objeto, false en caso contrario
 	 * 
	 */
	@Override
	public boolean contains(Object o) {
		return nodes.contains(o);
	}

	/**
	 * Devuelve un iterador
	 * @return iterator para recorrer los nodos del grafo
 	 * 
	 */
	@Override
	public Iterator<Node<A>> iterator() {
		return (Iterator<Node<A>>) nodes.iterator();
	}

	/**
	 * Devuelve un array con los nodos del grafo
	 * @return array con los nodos del grafo
 	 * 
	 */
	@Override
	public Object[] toArray() {
		return nodes.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
        return nodes.toArray(a);
	}

	/**
	 * Añade un nodo al grafo
	 * @return boolean con el resultado
 	 * 
	 */
	@Override
	public boolean add(Node<A> e) {
		return nodes.add(e);
	}

	/**
	 * Elimina un objeto del grafo
	 * @return boolean con el resultado
 	 * 
	 */
	@Override
	public boolean remove(Object o) {
        return nodes.remove(o);
	}

	/**
	 * Comprueba si los elementos de una coleccion estan contenidos en el grafo
	 * @return true en caso afirmartivo, false en caso negativo
 	 * 
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
        return nodes.containsAll(c);
	}

	/**
	 * Añade los elementos de una coleccion a un grafo
	 *@return boolean con el resultado de la operacion
 	 * 
	 */
	@Override
	public boolean addAll(Collection<? extends Node<A>> c) {
		return nodes.addAll(c);
	}

	/**
	 * Elimina del grafo los elementos de una coleccion
	 * @return boolean con el resultado de la operacion
 	 * 
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
        return nodes.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
        return nodes.retainAll(c);
	}

	/**
	 * Vacia la lista de nodos del grafo
	 * @return int con el tamaño
 	 * 
	 */
	@Override
	public void clear() {
        nodes.clear();
	}
	
	/**
	 * Modificacion del metodo toString para adaparlo a la salida requerida
 	 * 
	 */
	@Override
	public String toString() {
		String buf = "Nodes:\n";
		
		for (Node<A> n: nodes) buf += (n + "\n");
		buf += "Edges:\n";
		for (Edge<B> e: edges) buf += (e + "\n");
		return buf;
		
	}


    
}
