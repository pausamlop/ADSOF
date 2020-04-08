package metricSystems;

import magnitude.exceptions.QuantityException;
import magnitude.exceptions.UnknownUnitException;
import units.IPhysicalUnit;


public abstract class MetricSystemConverter implements IMetricSystemConverter{
    
    private IMetricSystem sourceSystem;
    private IMetricSystem targetSystem;

    private double change;


    public MetricSystemConverter(IMetricSystem sourceSystem, IMetricSystem targetSystem, double change) {
        this.sourceSystem = sourceSystem;
        this.targetSystem = targetSystem;
        this.change = change;
    }


    public IMetricSystem sourceSystem() {
        return this.sourceSystem;
    }

   
    public IMetricSystem targetSystem() {
        return this.targetSystem;
    }

    
    //public abstract IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException; 
    
    public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException{
        if (to != null){
            IMagnitude output = from.transformTo(to);

        } else {
            throw new UnknownUnitException();
        }
        
    } 
    
    public abstract IMetricSystemConverter reverse();

}