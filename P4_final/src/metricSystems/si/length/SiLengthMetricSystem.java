package src.metricSystems.si.length;

import src.units.*;
import src.metricSystems.MetricSystem;

import java.util.*;


/**
* Esta clase implementa el sistema metrico si de longitud
* 
* @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
* @author Paula Samper paula.samper@estudiante.uam.es
*/

public class SiLengthMetricSystem extends MetricSystem {

    public static SiLengthMetricSystem SYSTEM = getInstance();
    

    public static final IPhysicalUnit METER =  new PhysicalUnit(Quantity.LENGTH, "m",1, SYSTEM);
    public static final IPhysicalUnit KILOMETER =  new PhysicalUnit(Quantity.LENGTH,"km", 1000, SYSTEM);
    public static final IPhysicalUnit MILIMETER =  new PhysicalUnit(Quantity.LENGTH,"mm", 0.001, SYSTEM);


    /**
     * Getter para implementar una clase singleton
     * 
     * @return objecto unico de la clase
     */
    
    public static SiLengthMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new SiLengthMetricSystem();
        }
        return SYSTEM;
    }

    
    /**
     * Devuelve una coleccion con las unidades del sistema metrico
     * 
     * @return coleccion de unidades
     */
    
    @Override
    public Collection<IPhysicalUnit> units() {
        Collection<IPhysicalUnit> units = new ArrayList<IPhysicalUnit>();
        units.add(KILOMETER);
        units.add(METER);
        units.add(MILIMETER);
        
        return units;

    }
    
    
    /**
     * Devuelve la unidad base del sistema metrico
     * 
     * @return unidad base
     */
    
    @Override
    public IPhysicalUnit base(){ return METER; }
    
    
    
    
    
    
}