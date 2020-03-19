package ads.practica3;
import java.util.HashMap;
import java.util.ArrayList;



/**
 * Esta clase modela los elementos Electrodoméstico.
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

 public class Almacen {
    private static HashMap<Frigorifico, Integer> frigorificos = new HashMap<Frigorifico, Integer>();
    private static  HashMap<Lavadora, Integer> lavadoras = new HashMap<Lavadora, Integer>();
    private static HashMap<Television, Integer> televisiones = new HashMap<Television, Integer>();


    /**
     * Añade un modelo al almacen
     * 
     * @param e el electrodomestico
	 * @param ex numero de existencias
     */
    public static void anadirModelo(Electrodomestico e, int ex) {
        if(e.getClass().equals(Lavadora.class)) {
            if(lavadoras.containsKey(e)) return;
            else lavadoras.put((Lavadora)e,ex);

        }else if(e.getClass().equals(Television.class)) {
            if(televisiones.containsKey(e)) return;
            else televisiones.put((Television)e, ex);
            
        }else if (e.getClass().equals(Frigorifico.class)){
            if(frigorificos.containsKey(e)) return;
            else frigorificos.put((Frigorifico)e, ex);
        }
        
    }

    /**
     * Actualiza el numero de existencias de un
     * electrodomestico
     * 
     * @param e el electrodomestico
	 * @param ex numero de existencias
     */
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


    /**
     * Descatalogar un modelo
     * 
     * @param e el electrodomestico
     */
    public static void descatalogarModelo(Electrodomestico e){
        if(e.getClass().equals(Lavadora.class)) {
            if(lavadoras.containsKey(e)) lavadoras.remove((Lavadora)e);
        }
        else if(e.getClass().equals(Frigorifico.class)){
            if(frigorificos.containsKey(e)) frigorificos.remove((Frigorifico)e);
        } 
        else if(e.getClass().equals(Television.class)) {
            if (televisiones.containsKey(e)) televisiones.remove((Television)e);
        }
    }
    
   
    /**
     * Muestra el inventario del almacen
     */
    public static void mostrarInventario(){
        
        Television[] tel = televisiones.keySet().toArray(new Television[0]);
        Lavadora[] lav = lavadoras.keySet().toArray(new Lavadora[0]);
        Frigorifico[] frig = frigorificos.keySet().toArray(new Frigorifico[0]);

        for(Television tele : tel) {
            System.out.println(tele + ", Existencias " + televisiones.get(tele));
        }
        for(Lavadora lava  : lav) {
            System.out.println(lava + ", Existencias " + lavadoras.get(lava));
        }
        for(Frigorifico frigo : frig) {
            System.out.println(frigo + ", Existencias " + frigorificos.get(frigo));
        }
        
    }
    

    /**
     * Muestra el inventario de un tipo de 
     * electrodomestico del almacen
     * 
     * @param tipo tipo de electrodomestico
     */
    public static void mostrarInventario(String tipo){
        if (tipo.equals("Lavadora") || tipo.equals("lavadora")) {
            Lavadora[] lav = lavadoras.keySet().toArray(new Lavadora[0]);
            for(Lavadora lava  : lav) {
                System.out.println(lava + ", Existencias " + lavadoras.get(lava));
            }
        } else if(tipo.equals("Frigorifico") || tipo.equals("frigorifico")) {
            Frigorifico[] frig = frigorificos.keySet().toArray(new Frigorifico[0]);
            for(Frigorifico frigo : frig) {
                System.out.println(frigo + ", Existencias " + frigorificos.get(frigo));
            }

        } else if (tipo.equals("Television") || tipo.equals("television")) {
            Television[] tel = televisiones.keySet().toArray(new Television[0]);
            for(Television tele : tel) {
                System.out.println(tele + ", Existencias " + televisiones.get(tele));
            }
 
        }
    }


    /**
     * Muestra el numero de existencias 
     * de un modelo de electrodomestico.
     * 
     * @param e electrodomesticoç
     * @return entero con el numero de existencias del electrodoméstico
     */
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
 