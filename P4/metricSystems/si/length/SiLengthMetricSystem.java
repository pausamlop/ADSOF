package metricSystems.si.length;

import magnitude.exceptions.QuantityException;
import units.*;
import java.util.*;

import metricSystems.IMetricSystem;
import metricSystems.MetricSystem;


public class SiLengthMetricSystem extends MetricSystem {

    public static final IPhysicalUnit METER =  new SiLengthMetricSystem( "m",1);
    public static final IPhysicalUnit KILOMETER =  new SiLengthMetricSystem("km", 1000);
    public static final IPhysicalUnit MILIMETER =  new SiLengthMetricSystem("mm", 0.001);


    public static SiLengthMetricSystem SYSTEM = getInstance();


    private SiLengthMetricSystem(String abbrev, double equiv) {
        super(Quantity.LENGTH, abbrev, equiv);
    }

    private SiLengthMetricSystem() {
        super(Quantity.LENGTH);
    }


    public static SiLengthMetricSystem getInstance(){
        if (SYSTEM == null){
            SYSTEM = new SiLengthMetricSystem();
        }
        return SYSTEM;
    }


    public Collection<IPhysicalUnit> units() {
        Collection<IPhysicalUnit> units = new ArrayList<IPhysicalUnit>();
        units.add(KILOMETER);
        units.add(METER);
        units.add(MILIMETER);
        
        return units;

    }

    public IPhysicalUnit base(){
        return METER;
    }
    



}