package ads.practica3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;



/**
 * Esta clase modela los elementos Electrodoméstico.
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

 public class Almacen {
     private static HashMap<Frigorifico, Integer> frigorificos = new HashMap<Frigorifico, Integer>();
     private static HashMap<Lavadora, Integer> lavadoras = new HashMap<Lavadora, Integer>();
     private static HashMap<Television, Integer> televisiones = new HashMap<Television, Integer>();

    

    public static void anadirModelo(Electrodomestico e, int ex) {
        if(e.getClass().equals(Lavadora.class)) {
            if(lavadoras.containsKey(e)) {
                return;
            }
            else {
                lavadoras.put((Lavadora)e,ex);
                return;
            }
        }else if(e.getClass().equals(Television.class)) {
            if(televisiones.containsKey(e)) {
                return;
            }
            else {
                televisiones.put((Television)e, ex);
            }
        }else if (e.getClass().equals(Frigorifico.class)){
            if(frigorificos.containsKey(e)) {
                return;
            }
            else {
                frigorificos.put((Frigorifico)e, ex);
            }
        }
        
    }

    
    public static void actualizaExistencias(Electrodomestico e, int ex){
        if(e.getClass().equals(Lavadora.class)) {
            if(lavadoras.containsKey(e)) lavadoras.put((Lavadora)e,ex);
        }
        else if(e.getClass().equals(Television.class)){
            if(televisiones.containsKey(e)) televisiones.put((Television)e,ex);
        } 
        else if(e.getClass().equals(Frigorifico.class)) {
            if(frigorificos.containsKey(e)) frigorificos.put((Frigorifico)e,ex);
        }
    }


    public static void descatalogarModelo(Electrodomestico e){
        if(e.getClass().equals(Lavadora.class)) {
            if(lavadoras.containsKey(e)) lavadoras.remove((Lavadora)e);
        }
        if(e.getClass().equals(Frigorifico.class)){
            if(frigorificos.containsKey(e)) frigorificos.remove((Frigorifico)e);
        } 
        if(e.getClass().equals(Television.class)) {
            if (televisiones.containsKey(e)) televisiones.remove((Television)e);
        }
    }
    
    public static void mostrarInventario(){

        frigorificos.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        televisiones.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
    }


    public static void mostrarInventario(String tipo){
        if (tipo.equals("Lavadora") || tipo.equals("lavadora")) {
            lavadoras.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        } else if(tipo.equals("Frigorifico") || tipo.equals("frigorifico")) {
            frigorificos.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        } else if(tipo.equals("Television") || tipo.equals("television")) {
            

            
        }
    }

    public static int numeroExistencias(Electrodomestico e) {
        if(e.getClass().equals(Lavadora.class)) {
            return lavadoras.get(e);
        }
        else if(e.getClass().equals(Frigorifico.class)){
           return frigorificos.get(e);
        } 
        else if(e.getClass().equals(Television.class)) {
            return televisiones.get(e);
        }

        return 0;
    }


    
 }
 