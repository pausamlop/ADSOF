package generics;


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
    
    
    @Override
    public String toString() {
    	return "( " + from.getId() + " --" + data + "--> " + to.getId() + " )";
    }
    
    


}
