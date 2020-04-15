package metricSystems.imperial.length.converters;

import metricSystems.imperial.length.ImperialLengthMetricSystem;
import metricSystems.si.length.SiLengthMetricSystem;
import metricSystems.si.length.converters.SiLength2ImperialConverter;
import metricSystems.*;


/**
 * Esta clase modela el conversor de Imperial a SiLength
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Imperial2SiLengthConverter extends MetricSystemConverter{
	
	
    public Imperial2SiLengthConverter() {
        super(ImperialLengthMetricSystem.SYSTEM, SiLengthMetricSystem.SYSTEM, 1/3.280839895);
        
    }  
    
    
    /**
     * Método que devuelve el conversor inverso al actual
	 * 	 
     *
     * @return IMetricSystemConverter requerido
     */
    
    @Override
    public IMetricSystemConverter reverse() { return new SiLength2ImperialConverter(); }
    
}


