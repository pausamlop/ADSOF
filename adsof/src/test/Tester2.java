package test;

import java.util.*;

import generics.*;

public class Tester2 {
	
    public static void main(String[] args) {
    	
    	
    	
    	/* APARTADO A*/
    	
    	
	    ConstrainedGraph<Integer, Integer> g = new ConstrainedGraph<Integer, Integer>(); 
	
	    Node<Integer> n1 = new Node<Integer>(1);
	    Node<Integer> n2 = new Node<Integer>(2);
	    Node<Integer> n3 = new Node<Integer>(3);
	    
	    g.addAll(Arrays.asList(n1,n2,n3));
	    
	
	

	    g.connect(n1, 1, n2);
	    g.connect(n1, 7, n3);
	    g.connect(n2, 1, n3);
	
	
	    System.out.println("Todos nodos de g conectados con n3? "+g.forAll(n -> n.equals(n3) || n.isConnectedTo(n3))); 
	    System.out.println("Existe exactamente un nodo conectado con n2? "+g.one( n -> n.isConnectedTo(n2))); 
	    System.out.println("Existe al menos un nodo conectado con n2? "+g.exists( n -> n.isConnectedTo(n2)));
	    
	   
	    g.exists( n -> n.getValue().equals(89)); 
	    g.getWitness().ifPresent( w -> System.out.println("Witness 1 = "+g.getWitness().get())); 
	    g.exists( n -> n.isConnectedTo(n2));
	    g.getWitness().ifPresent( w -> System.out.println("Witness 2 = "+g.getWitness().get()));

	    
	    
	    /* APARTADO B*/
	    
	    
	    ConstrainedGraph<Integer, Integer> g1 = new ConstrainedGraph<Integer, Integer>(); 
        g1.addAll(Arrays.asList(new Node<Integer>(4)));

        BlackBoxComparator<Integer, Integer> bbc = new BlackBoxComparator<Integer, Integer>();

        bbc.addCriteria( Criteria.EXISTENTIAL, n -> n.isConnectedTo(1))
            .addCriteria( Criteria.UNITARY, n -> n.neighbours().isEmpty())
            .addCriteria( Criteria.UNIVERSAL, n -> n.getValue().equals(4));

        List<ConstrainedGraph<Integer, Integer>> cgs = Arrays.asList(g, g1);
        System.out.println(cgs);
        Collections.sort(cgs, bbc);
        
    }
    
}