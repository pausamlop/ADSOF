package ads.practica3;
import java.util.HashMap;

/**
 * Esta clase modela los elementos Electrodoméstico.
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

 public class Almacen {
     private HashMap<Frigorifico, Integer> frigorificos = new HashMap<Frigorifico, Integer>();
     private HashMap<Lavadora, Integer> lavadoras = new HashMap<Lavadora, Integer>();
     private HashMap<Television, Integer> televisiones = new HashMap<Television, Integer>();

    public Almacen(HashMap<Frigorifico,Integer> frigorificos, HashMap<Lavadora, Integer> lavadoras, HashMap<Television, Integer> televisiones) {
        this.frigorificos = frigorificos;
        this.lavadoras = lavadoras;
        this.televisiones = televisiones;
    }

    public void anadirModelo(Electrodomestico e, int ex) {
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

    
    public void actualizaExistencias(Electrodomestico e, int ex){
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


    public void descatalogarModelo(Electrodomestico e){
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
    
    public void mostrarInventario(){
        lavadoras.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        frigorificos.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        televisiones.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
    }


    public void mostrarInventario(String tipo){
        if (tipo.equals("Lavadora") || tipo.equals("lavadora")) {
            lavadoras.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        } else if(tipo.equals("Frigorifico") || tipo.equals("frigorifico")) {
            frigorificos.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        } else if(tipo.equals("Television") || tipo.equals("television")) {
            televisiones.forEach((k,v) -> System.out.println(k + "Existencias: " + v));
        }
    }
    
 }
 