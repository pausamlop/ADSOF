package metricSystems.imperial.length;

import java.util.*;


import units.*;
import metricSystems.MetricSystem;



public class ImperialLengthMetricSystem extends MetricSystem{

    public static ImperialLengthMetricSystem SYSTEM = getInstance();
    
    public static final IPhysicalUnit YARD =  new PhysicalUnit(Quantity.LENGTH,"yd",3, SYSTEM);
    public static final IPhysicalUnit MILE =  new PhysicalUnit(Quantity.LENGTH,"ml", 5280, SYSTEM);
    public static final IPhysicalUnit FOOT =  new PhysicalUnit(Quantity.LENGTH,"ft", 1, SYSTEM);


    public static ImperialLengthMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new ImperialLengthMetricSystem();
        }
        return SYSTEM;
    }


    public Collection<IPhysicalUnit> units() {
        Collection<IPhysicalUnit> units = new ArrayList<IPhysicalUnit>();
        units.add(YARD);
        units.add(MILE);
        units.add(FOOT);
        
        return units;
    }

    public IPhysicalUnit base(){
        return FOOT;
    }
   
    

}