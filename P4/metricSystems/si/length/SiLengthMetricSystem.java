package metricSystems.si.length;

import magnitude.exceptions.QuantityException;
import units.*;
import java.util.*;

import metricSystems.MetricSystem;


public class SiLengthMetricSystem extends MetricSystem {

    public static final IPhysicalUnit METER =  new SiLengthMetricSystem(Quantity.LENGTH, "m",1);
    public static final IPhysicalUnit KILOMETER =  new SiLengthMetricSystem(Quantity.LENGTH, "km", 1000);
    public static final IPhysicalUnit MILIMETER =  new SiLengthMetricSystem(Quantity.LENGTH, "mm", 0.001);

    private double metros;
    private static SiLengthMetricSystem SYSTEM;


    private SiLengthMetricSystem(Quantity quantity, String abbrev, double metros) {
        super(quantity, abbrev);
        this.metros = metros;
    }

    private SiLengthMetricSystem(Quantity quantity) {
        super(quantity);
    }


    public static SiLengthMetricSystem getInstance(){
        if (getSYSTEM() == null){
            setSYSTEM(new SiLengthMetricSystem(Quantity.LENGTH));
        }
        return getSYSTEM();
    }

    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
            return d / this.metros / ((SiLengthMetricSystem)u).metros;

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

	public static SiLengthMetricSystem getSYSTEM() {
		return SYSTEM;
	}

	public static void setSYSTEM(SiLengthMetricSystem sYSTEM) {
		SYSTEM = sYSTEM;
	}
    



}