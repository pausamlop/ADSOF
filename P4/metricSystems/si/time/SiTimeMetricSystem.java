package metricSystems.si.time;

import java.util.*;

import magnitude.exceptions.QuantityException;
import metricSystems.MetricSystem;
import units.*;

public class SiTimeMetricSystem extends MetricSystem {
    
    public static final IPhysicalUnit HOUR = new SiTimeMetricSystem( "h", 60);
    public static final IPhysicalUnit SECOND = new SiTimeMetricSystem("s", 1);
    public static final IPhysicalUnit MILISECOND = new SiTimeMetricSystem("ms", 0.0001);

    private static SiTimeMetricSystem SYSTEM  = getInstance();


    private SiTimeMetricSystem(String abbrev, double equiv) {
        super(Quantity.TIME, abbrev, equiv);
    }

    private SiTimeMetricSystem() {
        super(Quantity.TIME);
    }
    
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
    
