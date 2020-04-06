package metricSystems.imperial.length;

import java.util.*;

import magnitude.exceptions.QuantityException;
import units.*;
import metricSystems.MetricSystem;



public class ImperialLengthMetricSystem extends MetricSystem{
    public static final IPhysicalUnit YARD =  new ImperialLengthMetricSystem(Quantity.LENGTH, "yd",3);
    public static final IPhysicalUnit MILE =  new ImperialLengthMetricSystem(Quantity.LENGTH, "mi", 5280);
    public static final IPhysicalUnit FOOT =  new ImperialLengthMetricSystem(Quantity.LENGTH, "ft", 1);

    private double feet;
    public static ImperialLengthMetricSystem SYSTEM = getInstance();


    private ImperialLengthMetricSystem(Quantity quantity, String abbrev, double feet) {
        super(quantity, abbrev);
        this.feet = feet;
    }

    private ImperialLengthMetricSystem(Quantity quantity) {
        super(quantity);
    }


    public static ImperialLengthMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new ImperialLengthMetricSystem(Quantity.LENGTH);
        }
        return SYSTEM;
    }

    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d / this.feet / ((ImperialLengthMetricSystem)u).feet;

        }

        else {
            throw new QuantityException();
        }
    }

    public Collection<IPhysicalUnit> units() {
        Collection<IPhysicalUnit> units = new ArrayList<IPhysicalUnit>();
        units.add(YARD);
        units.add(MILE);
        units.add(FOOT);
        
        return units;

    }

    public IPhysicalUnit base(){
        return FOOT;
    }
    

}