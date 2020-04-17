package src.metricSystems.si.length.converters;

import src.metricSystems.MetricSystemConverter;
import src.metricSystems.imperial.length.ImperialLengthMetricSystem;
import src.metricSystems.si.length.SiLengthMetricSystem;

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