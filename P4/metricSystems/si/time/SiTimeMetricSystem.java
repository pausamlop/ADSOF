package metricSystems.si.time;

import magnitude.exceptions.QuantityException;
import metricSystems.MetricSystem;
import units.*;

public class SiTimeMetricSystem extends MetricSystem {
    
    public static final IPhysicalUnit HOUR = new SiTimeMetricSystem(Quantity.TIME, "h", 60);
    public static final IPhysicalUnit SECOND = new SiTimeMetricSystem(Quantity.TIME, "s", 1);
    public static final IPhysicalUnit MILISECOND = new SiTimeMetricSystem(Quantity.TIME, "ms", 0.0001);

    private double segundos;


    public SiTimeMetricSystem(Quantity quantity, String abbrev, double segundos) {
        super(quantity, abbrev);
        this.segundos = segundos;
    }


    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d / this.segundos / ((SiTimeMetricSystem)u).segundos;
        }

        else {
            throw new QuantityException();
        }
    }




    


}
    
