package generics;

public class Node<A> {
	
	private static int ultimoId;
	private int id;
	
	public Node() {
		this.id = ultimoId+1;
		ultimoId+=1;
	}
	
}
