package metricSystems.imperial.length;

import java.util.*;


import units.*;
import metricSystems.MetricSystem;


/**
 * Esta clase implementa el sistema metrico imperial
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class ImperialLengthMetricSystem extends MetricSystem{

    public static ImperialLengthMetricSystem SYSTEM = getInstance();
    
    public static final IPhysicalUnit YARD =  new PhysicalUnit(Quantity.LENGTH,"yd",3, SYSTEM);
    public static final IPhysicalUnit MILE =  new PhysicalUnit(Quantity.LENGTH,"ml", 5280, SYSTEM);
    public static final IPhysicalUnit FOOT =  new PhysicalUnit(Quantity.LENGTH,"ft", 1, SYSTEM);

    
    /**
     * Getter para implementar una clase singleton
     * 
     * @return objecto unico de la clase
     */
    
    public static ImperialLengthMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new ImperialLengthMetricSystem();
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
        units.add(YARD);
        units.add(MILE);
        units.add(FOOT);
        
        return units;
    }
    
    
    
    /**
     * Devuelve la unidad base del sistema metrico
     * 
     * @return unidad base
     */
    
    @Override
    public IPhysicalUnit base(){ return FOOT; }
   
    

}