package generics;

/**
 * Esta clase modela las aristas de los grafos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Edge<B> {
    
    private B data;
    private Node<?> from;
    private Node<?> to;


    public Edge(B data, Node<?> from, Node<?> to) {
        this.data = data;
        this.from = from;
        this.to = to;
    }


    public B getData() {
        return this.data;
    }

    public void setData(B data) {
        this.data = data;
    }

    public Node<?> getFrom() {
        return this.from;
    }

    public void setFrom(Node<?> from) {
        this.from = from;
    }

    public Node<?> getTo() {
        return this.to;
    }

    public void setTo(Node<?> to) {
        this.to = to;
    }
    
    /**
	 * Imprime los datos de una arista
	 */
    @Override
    public String toString() {
    	return "( " + from.getId() + " --" + data + "--> " + to.getId() + " )";
    }
    
    


}
