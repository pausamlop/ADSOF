package metricSystems;

import magnitude.exceptions.QuantityException;
import units.*;


public abstract class MetricSystem implements IPhysicalUnit {

    private Quantity quantity;
    private String abbrev;


    public MetricSystem(Quantity quantity, String abbrev) {
        this.quantity = quantity;
        this.abbrev = abbrev;
    }

    public Quantity getQuantity() {
        return this.quantity;
    }
    
    public String abbrev() {
        return this.abbrev;
    }

    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getQuantity().equals(this.quantity)) {
            return true;
        }
        return false;
    }
    
    public abstract double transformTo(double d, IPhysicalUnit u) throws QuantityException ;


    @Override
    public String toString() {
        return abbrev() + " " + getQuantity();
    }


}