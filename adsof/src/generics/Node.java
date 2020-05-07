package generics;

import java.util.*;


public class Node<A> {
	
	private static int ultimoId = -1;
	private final int id;
	private A value;
	private Graph<A,?> g;

	/**
	 * Contructor del nodo
	 * @param id1 Identificador del nodo
	 * @param datos Datos que contendra el nodo
	 */
	public Node(A data){
		this.id = ultimoId+1;
		this.value = data;
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
	public A getValue() { return value; }
	
	/**
	 * Cambia los datos del nodo.
	 * @param Datos defoodo
	 */
	public void setValue(A value) {this.value = value; }
	
	
	/**
	 * Devuelve el grafo.
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
	public String toString() {	return id + " [" + value + "]" ;}

	/**
	 * Override del metodo equals
	 */
	@Override
	public boolean equals(Object obj) {
	/**
	 * Determina si un nodo esta conectado a otro
	 * 
	 * @param n Nodo con el cual queremos comprobar la conexion
	 * 
	 * @return true si esta conectado, false si no es asi
	 */		if (this.id == ((Node<?>) obj).getId()) 
			return true;
		return false;
	} 



	public boolean isConnectedTo(Node<A> n) {
		
		if (g == null) return false;
		
		if (g.contains(n)){
			
			for (Object o: g.getEdges()) {
				
				if (((Edge<?>)o).getFrom().equals(this) && ((Edge<?>)o).getTo().equals(n)) {
					return true;

				}
	
	/**
	 * Determina si un nodo esta conectado a otro
	 * 
	 * @param e value del nodo a comprobar
	 * 
	 * @return true si esta conectado, false si no es asi
	 */			
			}

		}
		return false;
	} 
	
	public boolean isConnectedTo(A e) {
	
		if (g == null) return false;
		
		for (Object o: g.getEdges()) {
			
			if (((Edge<?>)o).getFrom().equals(this) && ((Edge<?>)o).getTo().getValue().equals(e)) {
				return true;

			}
	/**
	 * Devuelve una lista con los nodos "vecinos" con los que esta conectado
	 * 
	 * @return ArrayList de Node<A>
	 */	}

		return false;
	} 
	
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<Node<A>> neighbours(){
		
		ArrayList<Node<A>> output = new ArrayList<Node<A>>();
		
		if (g == null) return output;
		
		for (Object o: g.getEdges()){

			
			if (((Edge<?>)o).getTo().equals(this)) {
				
				if (!output.contains(((Edge<?>)o).getFrom()))
						output.add((Node<A>) ((Edge<?>)o).getFrom());
				
			}

		} 
		return output;
		
	}
	
	
	
	public List<? super Object> getEdgeValues(Node<A> n) {
		
		if (g == null) return null;
		
		List<? super Object> s = new LinkedList<>();
		
		if(isConnectedTo(n)) {
			
			for(Object o: g.getEdges()) {
				if(((Edge<?>)o).getFrom().equals(this) && ((Edge<?>)o).getTo().equals(n)) {
					s.add( ((Edge<?>)o).getData() );
				}
			}
		}
		
       return s;
	
	}



}
