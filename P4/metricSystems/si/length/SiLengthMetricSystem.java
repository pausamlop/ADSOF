package metricSystems.si.length;

import magnitude.exceptions.QuantityException;
import units.*;
import java.util.*;

import metricSystems.MetricSystem;


public class SiLengthMetricSystem extends MetricSystem {

    public static final IPhysicalUnit METER =  new SiLengthMetricSystem( "m",1);
    public static final IPhysicalUnit KILOMETER =  new SiLengthMetricSystem("km", 1000);
    public static final IPhysicalUnit MILIMETER =  new SiLengthMetricSystem("mm", 0.001);

    private double metros;
    public static SiLengthMetricSystem SYSTEM = getInstance();


    private SiLengthMetricSystem(String abbrev, double metros) {
        super(Quantity.LENGTH, abbrev);
        this.metros = metros;
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


    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d * this.metros / ((SiLengthMetricSystem)u).metros;
            

        }

        else {
            throw new QuantityException();
        }
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