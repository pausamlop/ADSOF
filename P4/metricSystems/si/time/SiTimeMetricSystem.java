package metricSystems.si.time;

import java.util.*;

import magnitude.exceptions.QuantityException;
import metricSystems.MetricSystem;
import units.*;

public class SiTimeMetricSystem extends MetricSystem {
    
    public static final IPhysicalUnit HOUR = new SiTimeMetricSystem(Quantity.TIME, "h", 60);
    public static final IPhysicalUnit SECOND = new SiTimeMetricSystem(Quantity.TIME, "s", 1);
    public static final IPhysicalUnit MILISECOND = new SiTimeMetricSystem(Quantity.TIME, "ms", 0.0001);

    private double segundos;
    private static SiTimeMetricSystem SYSTEM  = getInstance();


    private SiTimeMetricSystem(Quantity quantity, String abbrev, double segundos) {
        super(quantity, abbrev);
        this.segundos = segundos;
    }

    private SiTimeMetricSystem(Quantity quantity) {
        super(quantity);
    }
    
    public static SiTimeMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new SiTimeMetricSystem(Quantity.TIME);
        }
        return SYSTEM;
    }

    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d / this.segundos / ((SiTimeMetricSystem)u).segundos;
        }

        else {
            throw new QuantityException();
        }
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
    
