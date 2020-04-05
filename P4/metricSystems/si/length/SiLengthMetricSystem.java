package metricSystems.si.length;

// import magnitude.exceptions.QuantityException;
// import units.Quantity;
import magnitude.exceptions.QuantityException;
import units.*;


public class SiLengthMetricSystem implements IPhysicalUnit {

    public static final IPhysicalUnit METER =  new SiLengthMetricSystem(Quantity.LENGTH, "m",1);
    public static final IPhysicalUnit KILOMETER =  new SiLengthMetricSystem(Quantity.LENGTH, "km", 1000);
    public static final IPhysicalUnit MILIMETER =  new SiLengthMetricSystem(Quantity.LENGTH, "mm", 0.001);


    private Quantity quantity;
    private String abbrev;
    private double metros;


    public SiLengthMetricSystem(Quantity quantity, String abbrev, double metros) {
        this.quantity = quantity;
        this.abbrev = abbrev;
        this.metros = metros;
    }

    public Quantity getQuantity() {
        return this.quantity;
    }
    
    public String abbrev() {
        return this.abbrev;
    }

    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getQuantity().equals(Quantity.LENGTH)) {
            return true;
        }
        return false;
    }
    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d / this.metros / ((SiLengthMetricSystem)u).metros;

        }

        else {
            throw new QuantityException();
        }
    }
    
    @Override
    public String toString() {
        return abbrev() + " " + getQuantity();
    }


}