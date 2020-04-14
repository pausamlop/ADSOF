package metricSystems.imperial.length.converters;

import metricSystems.imperial.length.ImperialLengthMetricSystem;
import metricSystems.si.length.SiLengthMetricSystem;
import metricSystems.si.length.converters.SiLength2ImperialConverter;
import metricSystems.*;


public class Imperial2SiLengthConverter extends MetricSystemConverter{
	
	
	
    public Imperial2SiLengthConverter() {
        super(ImperialLengthMetricSystem.SYSTEM, SiLengthMetricSystem.SYSTEM, 1/3.280839895);
        
    }  

    public IMetricSystemConverter reverse(){
        return new SiLength2ImperialConverter();
    }
}


