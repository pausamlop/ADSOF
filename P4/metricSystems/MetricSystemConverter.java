package metricSystems;

import magnitude.exceptions.QuantityException;
import magnitude.exceptions.UnknownUnitException;


public abstract class MetricSystemConverter implements IMetricSystemConverter, IPhysicalUnit {
    
    private IMetricSystem sourceSystem;
    private IMetricSystem targetSystem;

    public IMetricSystem sourceSystem() {
        return this.sourceSystem;
    }

   
    public IMetricSystem targetSystem() {
        return targetSystem;
    }

    
    public abstract IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;  

    
    public IMetricSystemConverter reverse() {
        // TODO Auto-generated method stub
        return null;
    }

}