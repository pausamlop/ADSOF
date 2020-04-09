package metricSystems.imperial.length;

import java.util.*;

import magnitude.exceptions.QuantityException;
import units.*;
import metricSystems.MetricSystem;



public class ImperialLengthMetricSystem extends MetricSystem{
    public static final IPhysicalUnit YARD =  new ImperialLengthMetricSystem("yd",3);
    public static final IPhysicalUnit MILE =  new ImperialLengthMetricSystem("ml", 5280);
    public static final IPhysicalUnit FOOT =  new ImperialLengthMetricSystem("ft", 1);

    public static ImperialLengthMetricSystem SYSTEM = getInstance();


    private ImperialLengthMetricSystem(String abbrev, double equiv) {
        super(Quantity.LENGTH, abbrev, equiv);
    }

    private ImperialLengthMetricSystem() {
        super(Quantity.LENGTH);
    }


    public static ImperialLengthMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new ImperialLengthMetricSystem();
        }
        return SYSTEM;
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