package ads.practica3;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 * Esta clase modela la lectura de un fichero que contiene electrodomésticos
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class LecturaElectrodomesticos {
    /**
     * Método que lee los datos de electrodomésticos de un fichero, los extrae y crea
     * dichos electrodomésticos
     * 
     * @param file String de la ruta del fichero
	 * 
	 * @return ArrayList de los electrodomésticos del fichero
     */
    public static ArrayList<Electrodomestico> leer (String file){
        String buf;
        ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();

        try{
            BufferedReader f = new BufferedReader(new FileReader(file));

            while ((buf = f.readLine()) != null) {
                int flag = 1;
                String[] args = buf.split("=");
                Electrodomestico e;

                if (args.length == 5 ) e = Electrodomestico.crearTelevision(args);
                else if (args.length == 9 ) e = Electrodomestico.crearFrigorifico(args);
                else if (args.length == 8 || args.length == 10 )e =  Electrodomestico.crearLavadora(args);
                else {
                    System.err.println("Error en el numero de argumentos de la lectura.");
                    f.close();
                    return null;
                }

                for (Electrodomestico u: lista) if (u.equals(e)) flag = 0;

                if (flag == 1) lista.add(e);
                else {
                    System.out.println("Duplicado no añadido:");
                    System.out.println(e);
                } 
            }
            f.close();

        } catch(Exception e){
            System.err.println("Archivo no encontrado");
        }

        
        return lista;
    }

    

}