package metricSystems.si.time;

import magnitude.exceptions.QuantityException;
import units.*;

public class SiTimeMetricSystem implements IPhysicalUnit {
    
    public static final IPhysicalUnit HOUR = new SiTimeMetricSystem(Quantity.TIME, "h", 60);
    public static final IPhysicalUnit SECOND = new SiTimeMetricSystem(Quantity.TIME, "s", 1);
    public static final IPhysicalUnit MILISECOND = new SiTimeMetricSystem(Quantity.TIME, "ms", 0.0001);


    private Quantity quantity;
    private String abbrev;
    private double segundos;


    public SiTimeMetricSystem(Quantity quantity, String abbrev, double segundos) {
        this.quantity = quantity;
        this.abbrev = abbrev;
        this.segundos = segundos;
    }

    public Quantity getQuantity() {
        return this.quantity;
    }
    
    public String abbrev() {
        return this.abbrev;
    }

    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getQuantity().equals(Quantity.TIME)) {
            return true;
        }
        return false;
    }
    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d / this.segundos / ((SiTimeMetricSystem)u).segundos;

        }

        else {
            throw new QuantityException();
        }
    }
    

    @Override
    public String toString() {
        return abbrev() +  " " + getQuantity();
    }



    


}
    
