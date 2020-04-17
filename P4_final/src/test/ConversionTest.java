package src.test;

import src.magnitude.IMagnitude;
import src.magnitude.Magnitude;
import src.magnitude.exceptions.QuantityException;
import src.metricSystems.imperial.length.ImperialLengthMetricSystem;
import src.metricSystems.si.length.SiLengthMetricSystem;
import src.metricSystems.si.length.converters.SiLength2ImperialConverter;

/**
 * Tester del Apartado 4
 * 
 * @author Profesores de ADSOF
 */

public class ConversionTest {

	public static void main(String[] args) throws QuantityException {
		Magnitude m  = new Magnitude(10, SiLengthMetricSystem.KILOMETER);
								
		IMagnitude enMillas = null;
		
		try {
			enMillas = m.transformTo(ImperialLengthMetricSystem.MILE);
		} catch (QuantityException e) {
			System.out.println(e);
		}
		SiLengthMetricSystem.registerConverter(new SiLength2ImperialConverter());	// This register the converter and the reverse

		enMillas = m.transformTo(ImperialLengthMetricSystem.MILE);
		
		System.out.println("En millas = "+enMillas);
		System.out.println("En m = "+ enMillas.transformTo(SiLengthMetricSystem.METER)); 			
	}

}

