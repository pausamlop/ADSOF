package generics;

import java.util.*;

import generics.Graph;

public class Node<A> {
	
	private static int ultimoId = 0;
	private final int id;
	private A data;
	private Graph g;

	/**
	 * Contructor del nodo
	 * @param id1 Identificador del nodo
	 * @param datos Datos que contendra el nodo
	 */
	public Node(A data){
		this.id = ultimoId+1;
		this.data = data;
		ultimoId+=1;
	}

	/**
	 * Devuelve el Id del nodo.
	 * @return Id del vertice
	 */
	public Integer getId() { return id; }
	
	/**
	 * Devuelve los datos del nodo.
	 * @return Datos del nodo
	 */
	public A getDatos() { return data; }
	
	
	/**
	 * Devuelve el grapho.
	 * @return grafo
	 */
	public Graph<A,?> getGraph() { return g; }
	
	/**
	 * Devuelve el grapho.
	 * @return grafo
	 */
	public void setGraph(Graph<A, ?> graph) { this.g = graph; }
	
	
	
	/**
	 * Imprime los datos de un nodo.
	 */
	@Override
	public String toString() {	return data.toString(); }

	/**
	 * Override del metodo equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this.id == ((Node<?>) obj).getId()) 
			return true;
		return false;
	} 



	public boolean isConnectedTo(Node<A> n) {
		if (g.contains(n)){

			for (Edge<this.getEdgeValues(n).getClass()> e: g.getEdges()){
				if ((e.getFrom().equals(this) && e.getTo().equals(n)) || (e.getFrom().equals(n) && e.getTo().equals(this)))
					return true;
			} 
		}
		return false;
	} 
	
	public ArrayList<Node<A>> neighbours(){
		List<Node<?>> output = new ArrayList<Node<?>>();

		for (Edge<?> e: g.getEdges()){

			if (e.getFrom().equals(this)) output.add(e.getTo());
			else if (e.getTo().equals(this)) output.add(e.getFrom());
		} 
		return output;
		
	}
	public ? getEdgeValues(Node<A> n) {
		if(isConnectedTo(n)) {
			for(Edge<?> e : g.getEdges()) {
				if(e.getFrom().equals(this) && e.getTo().equals(n)) {
					return e.getData();
				// } else if(e.getFrom().equals(n) && e.getTo().equals(this)) {
				// 	return e.getData();
				// }
			}
		}
	}
	
}
}
