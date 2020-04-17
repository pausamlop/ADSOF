package metricSystems.si.length.converters;

import metricSystems.IMetricSystemConverter;
import metricSystems.MetricSystemConverter;
import metricSystems.imperial.length.ImperialLengthMetricSystem;
import metricSystems.si.length.SiLengthMetricSystem;

/**
 * Esta clase modela el conversor de Imperial a SiLength
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class SiLength2ImperialConverter extends MetricSystemConverter {


    public SiLength2ImperialConverter() {
        super(SiLengthMetricSystem.SYSTEM, ImperialLengthMetricSystem.SYSTEM, 3.280839895);
    }


    
}