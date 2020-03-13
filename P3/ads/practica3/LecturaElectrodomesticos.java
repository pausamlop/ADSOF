package ads.practica3;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;



/**
 * Esta clase modela los electrodomésticos de tipo televisión
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */


public class LecturaElectrodomesticos {

    public static ArrayList<Electrodomestico> leer (String file){
        String buf;
        ArrayList<Electrodomestico> lista = null;
        try{
            BufferedReader f = new BufferedReader(new FileReader(file));


            while ((buf = f.readLine()) != null) {
                System.out.println(buf);

            }

            f.close();
        } catch(Exception e){
            System.err.println("Archivo no encontrado");
        }

        

        return lista;
    }

}