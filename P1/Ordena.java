import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Esta clase mantiene un conjunto de números enteros
 */
public class Ordena {
    // usamos un conjunto ordenado, que implementa TreeSet
    private SortedSet<Integer> numeros= new TreeSet<>();

    /**
     * Constructor, con el array de cadenas
     * @param cadenas a insertar, tras convertir a números
     */
    public Ordena(String ... cadenas){
        for (String s: cadenas){ //recorremos el array
            int n= Integer.parseInt(s); //convertimos a entero
            numeros.add(n); //añadimos al conjunto
        }
    }
    /**
     *
     * @return numeros
     */
    public SortedSet<Integer> getNumeros(){
        return numeros;
    }

    /**
     *
     * @return Cadena que representa este objeto
     */
    public String toString(){
        return "Hay "+ numeros.size()+ " números"
                + ": " + numeros; //o +numeros.toString()
    }
    /**
     * Punto de entrada a la aplicación.
     *
     * Este método ordena los números de la línea de comando
     * @param args Los argumentos de la línea de comando. Se esperan números enteros, como cadenas
     */
    public static void main(String[] args) {
        if (args.length<2) {
            System.out.println("Se espera al menos dos números como parámetros");
            System.out.println("Devuelve el conjunto ordenado");
        }
        else {
            Ordena c = new Ordena(args);
            System.out.println(c); // Imprimimos una línea con el conjunto ordenado, por salida estándar
            // En java la destrucción de objetos es automática
        }
    }
}

