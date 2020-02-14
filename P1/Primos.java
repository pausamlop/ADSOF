/** 
 * Este programa recibe una serie de números. Se determinará si son primos
 * o no, se actualizará una variable con el número máximo comprobado, y se 
 * añadirán a una lista todos los primos hasta ese máximo. Si el número no 
 * es primo, se imprimirán todos sus divisores primos.
 * Al final, se imprimirá una lista con todos los números primos encontrados 
 * hasta el máximo.
 */

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Esta clase mantiene una caché de números primos, para
 * evitar cálculos repetidos, y calcula si un número es primo
 * La cache conserva los primos calculados
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Primos{
    // usamos un conjunto ordenado, que implementa TreeSet
    private SortedSet<Integer> primos= new TreeSet<>();
    private int max=1;

    /**
     *
     * @return cache con los primos calculados
     */
    public SortedSet<Integer> getPrimos(){
        return primos;
    }

    public String toString(){
        return "Primos hasta "+ max+ " = "+primos;
    }


    /**
     *
     * @param n un número entero
     * @return si n es primo
     */
    public boolean esPrimo(int n){
        if (n<2) return false;
        if (n>max) actualizaPrimos(n);
        return primos.contains(n);
    }


    /**
     * Este método llama a compruebaPrimo, y lo añade, si es primo,
     * para todos los números entre max+1 y n. Actualiza max al terminar.
     * @param n
     */
    private void actualizaPrimos(int n){
        for(int i = max + 1; i <= n; i += 1){
            if (compruebaPrimo(i) == true) primos.add(i);
        }
        max = n;
    }


    /**
     * Comprueba si n es primo, asumiendo que el conjunto primos
     * está actualizado con todos los anteriores
     * @param n valor a comprobar
     * @return si n es primo
     */
    private boolean compruebaPrimo(int n){
        boolean primo = true;
        for (int p:primos){
            if(n%p == 0) primo = false;
        }
        return primo;
    }



    /**
     * Devuelve el conjunto de divisores primos de n
     * @param n valor para el que hay que encontrar los divisores
     * @return la lista de divisores primos
     */
    public SortedSet<Integer> divisoresPrimos (int n){
      SortedSet<Integer> d = new TreeSet <>();
      for (int p:primos){
        if (n%p==0) d.add(p);
      }
      return d;
    }


    /*
     *  Método main
     */

    public static void main(String[] args) {

        if (args.length<2) {
            System.out.println("Se espera al menos dos números como parámetros");
            System.out.println("Devuelve el conjunto ordenado");
        }

        else {
            Primos pr = new Primos();

            for (String s: args){
                int k = Integer.parseInt(s);
                if (pr.esPrimo(k) == true){
                  System.out.println("El número " + k + " es primo.");
                } else {
                  System.out.println("El número " + k + " no es primo, y sus divisores primos son: " + pr.divisoresPrimos(k));
                }
            }
            // Imprimimos una línea con el conjunto ordenado, por salida estándar
            System.out.println(pr);

            // En java la destrucción de objetos es automática
        }
    }

}
