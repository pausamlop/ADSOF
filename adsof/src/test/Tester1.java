package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import generics.*;
/**
 * Tester apartado 1
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Tester1 {
	
    public static void main(String[] args) {

        Graph<String, Integer> g = new Graph<String, Integer>(); 

        Node<String> n1 = new Node<String>("s0");
        Node<String> n2 = new Node<String>("s1");

        g.addAll(Arrays.asList(n1, n2, n1));

        g.connect(n1, 0, n1); 
        g.connect(n1, 1, n2); 
        g.connect(n1, 0, n2); 
        g.connect(n2, 0, n1); 
        g.connect(n2, 1, n1);

        System.out.println(g); 
        for (Node<String> n : g)
            System.out.println("Nodo "+n);

        List<Node<String>> nodos = new ArrayList<>(g);
        System.out.println(nodos);

        System.out.println("s0 conectado con ‘s1’: "+ n1.isConnectedTo("s1")); 
        System.out.println("s0 conectado con s1: "+ n1.isConnectedTo(n2)); 
        System.out.println("vecinos de s0: "+n1.neighbours());
        System.out.println("valores de los enlaces desde s0 a s1: "+n1.getEdgeValues(n2));

    }

}


