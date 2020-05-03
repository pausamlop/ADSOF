package generics;

import java.util.*;


public class Node<A> {
	
	private static int ultimoId = -1;
	private final int id;
	private A data;
	private Graph<A,?> g;

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
	public String toString() {	return id + " [" + data + "]" ;}

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
			
			List<Node<A>> list = neighbours();
			if(list.contains(n)) return true;

		}
		return false;
	} 
	
	public boolean isConnectedTo(A e) {
	
		List<Node<A>> list = neighbours();
		
		for (Node<A> o: list) {
			if (o.getDatos().equals(e)) return true;
		}

		return false;
	} 
	
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<Node<A>> neighbours(){
		ArrayList<Node<A>> output = new ArrayList<Node<A>>();

		for (Object o: g.getEdges()){

			if (((Edge<?>)o).getFrom().equals(this)) {
				
				if (!output.contains(((Edge<?>)o).getTo()))
						output.add((Node<A>) ((Edge<?>)o).getTo());
				
			}
			
			else if (((Edge<?>)o).getTo().equals(this)) {
				
				if (!output.contains(((Edge<?>)o).getFrom()))
						output.add((Node<A>) ((Edge<?>)o).getFrom());
				
			}

		} 
		return output;
		
	}
	
	
	
	public Set<? super Object> getEdgeValues(Node<A> n) {
		
		Set<? super Object> s = new LinkedHashSet<>();
		
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
