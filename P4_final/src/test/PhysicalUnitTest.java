package src.test;

import src.units.*;

import src.magnitude.exceptions.QuantityException;
import src.metricSystems.si.length.SiLengthMetricSystem;
import src.metricSystems.si.time.SiTimeMetricSystem;

/**
 * Tester del Apartado 1
 * 
 * @author Profesores de ADSOF
 */

public class PhysicalUnitTest {
	public static void main(String[] args) throws QuantityException {
		IPhysicalUnit meter = SiLengthMetricSystem.METER;
		System.out.println(meter);   				// This is how a meter is printed (abbrev + Quantity)
		System.out.println(meter.canTransformTo(SiLengthMetricSystem.KILOMETER));   // Yes, we can
		System.out.println(meter.canTransformTo(SiTimeMetricSystem.SECOND));  		// No, we don't
		System.out.println("1000 m en km: "+meter.transformTo(1000, SiLengthMetricSystem.KILOMETER));
		try {
			System.out.println("1000 m en s: "+meter.transformTo(1000, SiTimeMetricSystem.SECOND)); // Exception!
		} catch (QuantityException e) {
			System.out.println(e);
		}
	}
}
