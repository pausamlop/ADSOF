package metricSystems.si.length;

import units.*;
import java.util.*;

import metricSystems.MetricSystem;


public class SiLengthMetricSystem extends MetricSystem {

    public static SiLengthMetricSystem SYSTEM = getInstance();
    

    public static final IPhysicalUnit METER =  new PhysicalUnit(Quantity.LENGTH, "m",1, SYSTEM);
    public static final IPhysicalUnit KILOMETER =  new PhysicalUnit(Quantity.LENGTH,"km", 1000, SYSTEM);
    public static final IPhysicalUnit MILIMETER =  new PhysicalUnit(Quantity.LENGTH,"mm", 0.001, SYSTEM);


    public static SiLengthMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new SiLengthMetricSystem();
        }
        return SYSTEM;
    }


    public Collection<IPhysicalUnit> units() {
        Collection<IPhysicalUnit> units = new ArrayList<IPhysicalUnit>();
        units.add(KILOMETER);
        units.add(METER);
        units.add(MILIMETER);
        
        return units;

    }

    public IPhysicalUnit base(){
        return METER;
    }
    
}