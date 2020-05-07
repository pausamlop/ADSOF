package generics;

import java.util.function.Predicate;
import java.util.Optional;

/**
 * Esta clase modela los ConstrainedGraph
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class ConstrainedGraph<A, B> extends Graph<A,B>{

    private Optional<Node<A>> witness;

    public Optional<Node<A>> getWitness() {
        return witness;
    }
    
    /**
     * Comprueba que el predicado pasado por argumento se cumple para todos los nodos
     * 
     * @param pred predicado a evaluar en los nodos
     */
    public boolean forAll(Predicate<Node<A>> pred){

        for (Node<A> n: this.getNodes()){
            if (!pred.test(n)) return false;
        }
        return true;
    }
     /**
     * Comprueba que el predicado pasado por argumento se cumple al menos para un nodo
     * 
     * @param pred predicado a evaluar en los nodos
     */
    public boolean exists(Predicate<Node<A>> pred){

        for (Node<A> n: this.getNodes()){
            if (pred.test(n)) {
                this.witness = Optional.ofNullable(n);

                return true;
            } 
        }
        this.witness = Optional.ofNullable(null);
        return false;
        
        
    }
     /**
     * Comprueba que el predicado pasado por argumento se cumple para un solo nodo
     * 
     * @param pred predicado a evaluar en los nodos
     */
    public boolean one(Predicate<Node<A>> pred){
    
        int total = 0;
        for (Node<A> n: this.getNodes()){
            if (pred.test(n)) total++;
        }

        if (total == 1) return true;
        return false;
        
    }
    
}