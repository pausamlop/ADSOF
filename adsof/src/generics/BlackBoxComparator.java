package generics;

import java.util.*;
import java.util.function.Predicate;

/**
 * Esta clase modela el comparador BlackBox
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class BlackBoxComparator<A,B> implements Comparator<ConstrainedGraph<A,B>> {


    //GUARDAR LAS PROPIEDADES
    Map<Criteria, ArrayList<Predicate<Node<A>>>> properties  = new LinkedHashMap<Criteria, ArrayList<Predicate<Node<A>>>>();
    
	
	/**
 	* Compara dos grafos pasados como argumento según los distintos criterios
 	* 
 	* @param o1 ConstrainedGraph a comparar
	* @param o2 ConstrainedGraph a comparar
	* @return int con el resultado de la comparacion 
 	*/
	@Override
	public int compare(ConstrainedGraph<A, B> o1, ConstrainedGraph<A, B> o2) {
		int numG1 = 0;
		int numG2 = 0;
		
		
		for (Predicate<Node<A>> pred: properties.get(Criteria.EXISTENTIAL)) {
			
			if (o1.exists(pred)) numG1++;
			if (o2.exists(pred)) numG2++;
			
		}
		
		for (Predicate<Node<A>> pred: properties.get(Criteria.UNITARY)) {
		
			if (o1.one(pred)) numG1++;
			if (o2.one(pred)) numG2++;
			
		}
		
		for (Predicate<Node<A>> pred: properties.get(Criteria.UNIVERSAL)) {
			
			if (o1.forAll(pred)) numG1++;
			if (o2.forAll(pred)) numG2++;
			
		}
		
		if (numG1 == numG2) return 0;
		else if (numG1 > numG2) return 1;
		else return -1;
		

		
    }
    

	
	/**
	 * Añade nuevos criterios al comparador BlackBox
 	 * 
	 * @param c tipo de criterio a añadir
	 * @param lambda predicado que contiene la expresion lambda a añadir
 	*/

        if (!properties.keySet().contains(c)){
        	
            ArrayList<Predicate<Node<A>>> lista = new ArrayList<>();
    
            lista.add(lambda);
            properties.put(c, lista);
            
        } else {
            properties.get(c).add(lambda);
        }

        return this;
    }




}