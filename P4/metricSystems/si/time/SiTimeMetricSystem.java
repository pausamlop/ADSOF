package metricSystems.si.time;

import java.util.*;

import metricSystems.MetricSystem;
import units.*;

public class SiTimeMetricSystem extends MetricSystem {
    

    private static SiTimeMetricSystem SYSTEM  = getInstance();
    
    public static final IPhysicalUnit HOUR = new PhysicalUnit(Quantity.TIME ,"h", 60,SYSTEM);
    public static final IPhysicalUnit SECOND = new PhysicalUnit(Quantity.TIME,"s", 1, SYSTEM);
    public static final IPhysicalUnit MILISECOND = new PhysicalUnit(Quantity.TIME,"ms", 0.0001,SYSTEM);

    
    public static SiTimeMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new SiTimeMetricSystem();
        }
        return SYSTEM;
    }


    public Collection<IPhysicalUnit> units() {
        Collection<IPhysicalUnit> units = new ArrayList<IPhysicalUnit>();
        units.add(HOUR);
        units.add(SECOND);
        units.add(MILISECOND);
        
        return units;

    }

    public IPhysicalUnit base(){
        return SECOND;
    }
 

}
    
