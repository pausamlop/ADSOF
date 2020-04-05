package metricSystems.si.length;

import magnitude.exceptions.QuantityException;
import units.*;

import metricSystems.MetricSystem;


public class SiLengthMetricSystem extends MetricSystem {

    public static final IPhysicalUnit METER =  new SiLengthMetricSystem(Quantity.LENGTH, "m",1);
    public static final IPhysicalUnit KILOMETER =  new SiLengthMetricSystem(Quantity.LENGTH, "km", 1000);
    public static final IPhysicalUnit MILIMETER =  new SiLengthMetricSystem(Quantity.LENGTH, "mm", 0.001);

    private double metros;


    public SiLengthMetricSystem(Quantity quantity, String abbrev, double metros) {
        super(quantity, abbrev);
        this.metros = metros;
    }

    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d / this.metros / ((SiLengthMetricSystem)u).metros;

        }

        else {
            throw new QuantityException();
        }
    }
    



}