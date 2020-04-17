package src.metricSystems.si.time;

import java.util.*;

import src.metricSystems.MetricSystem;
import src.units.*;


/**
* Esta clase implementa el sistema metrico si de tiempo
* 
* @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
* @author Paula Samper paula.samper@estudiante.uam.es
*/

public class SiTimeMetricSystem extends MetricSystem {
    

    public static SiTimeMetricSystem SYSTEM  = getInstance();
    
    public static final IPhysicalUnit HOUR = new PhysicalUnit(Quantity.TIME ,"h", 60,SYSTEM);
    public static final IPhysicalUnit SECOND = new PhysicalUnit(Quantity.TIME,"s", 1, SYSTEM);
    public static final IPhysicalUnit MILISECOND = new PhysicalUnit(Quantity.TIME,"ms", 0.0001,SYSTEM);

    
    /**
     * Getter para implementar una clase singleton
     * 
     * @return objecto unico de la clase
     */
    
    public static SiTimeMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new SiTimeMetricSystem();
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
        units.add(HOUR);
        units.add(SECOND);
        units.add(MILISECOND);
        
        return units;

    }
    
    /**
     * Devuelve la unidad base del sistema metrico
     * 
     * @return unidad base
     */
    
    @Override
    public IPhysicalUnit base(){ return SECOND; }
 

}
    
