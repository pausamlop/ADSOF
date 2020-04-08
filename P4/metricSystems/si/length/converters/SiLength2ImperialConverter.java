package metricSystems.si.length.converters;

import magnitude.IMagnitude;
import magnitude.exceptions.QuantityException;
import magnitude.exceptions.UnknownUnitException;
import metricSystems.IMetricSystem;
import metricSystems.IMetricSystemConverter;
import metricSystems.MetricSystemConverter;
import metricSystems.imperial.length.ImperialLengthMetricSystem;
import metricSystems.imperial.length.converters.Imperial2SiLengthConverter;
import metricSystems.si.length.SiLengthMetricSystem;
import units.IPhysicalUnit;
import units.Quantity;
import metricSystems.*;

public class SiLength2ImperialConverter extends MetricSystemConverter {


    public SiLength2ImperialConverter() {
        super(SiLengthMetricSystem.SYSTEM, ImperialLengthMetricSystem.SYSTEM, 3.280839895);
    }


    public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException {
        return null;
    }  

    public IMetricSystemConverter reverse(){
        return new Imperial2SiLengthConverter();
    }

    
}