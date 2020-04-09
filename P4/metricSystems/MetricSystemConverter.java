package metricSystems;

import magnitude.IMagnitude;
import magnitude.Magnitude;
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

        try {
            if (to.getMetricSystem().getClass().equals(this.targetSystem.getClass())){

                // transformar unidades de from a unidad base
                double value = ((MetricSystem)(from.getUnit().getMetricSystem())).transformTo(from.getValue(), from.getUnit().getMetricSystem().base());

                IMagnitude m1  = new Magnitude(value, from.getUnit().getMetricSystem().base());

                // transformar base a base de to
                IMagnitude m2 = new Magnitude(value*this.change, targetSystem.base());

                // transformar de base de to a to

                return new Magnitude( ((MetricSystem)(m2.getUnit().getMetricSystem())).transformTo(m2.getValue(), to), to);
                
            }else if (to.getMetricSystem().getClass().equals(this.sourceSystem.getClass())){
                	IMetricSystemConverter n = this.reverse();
                	return ((MetricSystemConverter)n).transformTo(from, to);
                	
                }
            else {
                throw new UnknownUnitException();
            }
            }
        catch(QuantityException ex){
            System.out.println("Cannor convert");
            return null;
        }
        
    } 
    
    public abstract IMetricSystemConverter reverse();

}