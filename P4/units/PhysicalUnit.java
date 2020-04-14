package units;

import magnitude.exceptions.QuantityException;
import metricSystems.IMetricSystem;

public class PhysicalUnit implements IPhysicalUnit{

    private Quantity quantity;
    private String abbrev;
    private double equiv;
    private IMetricSystem metric;


    public PhysicalUnit(Quantity quantity, String abbrev, double equiv, IMetricSystem metric) {
        this.quantity = quantity;
        this.abbrev = abbrev;
        this.equiv = equiv;
        this.metric = metric;
    }

    public Quantity getQuantity() { return this.quantity; }
    
    public String abbrev() { return this.abbrev; }

    public IMetricSystem getMetricSystem() { return this.metric; }


    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getMetricSystem().equals(this.metric)) return true;
        return false;
    }
    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
        	PhysicalUnit p = (PhysicalUnit)u;
        	return d * this.equiv / p.equiv;
        }
        else throw new QuantityException();
        
    }


    @Override
    public String toString() {
        return abbrev() + " " + getQuantity();
    }

}