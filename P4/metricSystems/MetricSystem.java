package metricSystems;

import magnitude.exceptions.QuantityException;
import metricSystems.imperial.length.ImperialLengthMetricSystem;
import units.*;


public abstract class MetricSystem implements IPhysicalUnit, IMetricSystem {

    private Quantity quantity;
    private String abbrev;
    private double equiv;

    private MetricSystemConverter converter;


    public MetricSystem(Quantity quantity, String abbrev, double equiv) {
        this.quantity = quantity;
        this.abbrev = abbrev;
        this.equiv = equiv;
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
    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d * this.equiv / ((MetricSystem)u).equiv;

        }

        else {
            throw new QuantityException();
        }
    }

    public IMetricSystemConverter getConverter(IMetricSystem to) {
        return converter;
    }

    public void registerConverter(IMetricSystem to) {
        this.converter = (MetricSystemConverter) to;
    }

    @Override
    public String toString() {
        return abbrev() + " " + getQuantity();
    }


}