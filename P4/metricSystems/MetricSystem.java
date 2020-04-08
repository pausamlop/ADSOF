package metricSystems;

import magnitude.exceptions.QuantityException;
import units.*;


public abstract class MetricSystem implements IPhysicalUnit, IMetricSystem {

    private Quantity quantity;
    private String abbrev;


    public MetricSystem(Quantity quantity, String abbrev) {
        this.quantity = quantity;
        this.abbrev = abbrev;
    }

    public MetricSystem(Quantity quantity) {
        this.quantity = quantity;
    }

    public Quantity getQuantity() {
        return this.quantity;
    }
    
    public String abbrev() {
        return this.abbrev;
    }

    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getClass().equals(this.getClass())) {
            return true;
        }
        return false;
    }
    
    public abstract double transformTo(double d, IPhysicalUnit u) throws QuantityException ;

    public IMetricSystemConverter getConverter(IMetricSystem to) {
        //return;
    }

    @Override
    public String toString() {
        return abbrev() + " " + getQuantity();
    }


}