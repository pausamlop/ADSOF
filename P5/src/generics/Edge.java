package generics;


public class Edge<B> {
    
    private B value;
    private Node<?> from;
    private Node<?> to;


    public Edge(B value, Node<?> from, Node<?> to) {
        this.value = value;
        this.from = from;
        this.to = to;
    }

}
