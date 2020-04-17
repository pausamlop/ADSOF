package test;

import metricSystems.IMetricSystem;
import metricSystems.imperial.length.ImperialLengthMetricSystem;
import metricSystems.si.length.SiLengthMetricSystem;

/**
 * Tester del Apartado 2
 * 
 * @author Profesores de ADSOF
 */
public class MetricSystemTest {

	public static void main(String[] args) {
		IMetricSystem ms = SiLengthMetricSystem.SYSTEM;
		// new SiLengthMetricSystem();	// dar�a error de compilaci�n
		System.out.println(ms.units());
		System.out.println("Base = "+ms.base());

		System.out.println(SiLengthMetricSystem.METER.canTransformTo(ImperialLengthMetricSystem.FOOT));	// No: different metric systems
	}

}
