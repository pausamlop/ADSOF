package src.metricSystems;

import src.magnitude.IMagnitude;
import src.magnitude.Magnitude;
import src.magnitude.exceptions.QuantityException;
import src.magnitude.exceptions.UnknownUnitException;
import src.units.IPhysicalUnit;

/**
 * Esta clase abstracta, MetricSystemConverter, implementa la interfaz IMetricSystemConverter
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class MetricSystemConverter implements IMetricSystemConverter{
	
    
    private IMetricSystem sourceSystem;
    private IMetricSystem targetSystem;

    private double change;


     /**
     * Método constructor de la clase MetricSystemConverter
	 * 
     * @param sourceSystem IMetricSystem origen
     * @param targetSystem IMetricSystem destino
     * @param change double que representa el cambio por el que hay que operar para pasar 
     * entre los sistemas métricos
     */

    public MetricSystemConverter(IMetricSystem sourceSystem, IMetricSystem targetSystem, double change) {
        this.sourceSystem = sourceSystem;
        this.targetSystem = targetSystem;
        this.change = change;
    }

    
    @Override
    public IMetricSystem sourceSystem() { return this.sourceSystem; }

    @Override
    public IMetricSystem targetSystem() { return this.targetSystem; }



    /**
     * Método que transforma la magnitud actual a otra unidad. 
	 * 
	 * Si no se puede realizar dicho cambio, el método lanza excepción de tipo QuantityException
	 * 
     * @param from IMagnitude que se quiere convertir
     * @param to IPhysicalUnit a la que se quiere convertir
     * 
     * @return IMagnitude una vez realizado el cambio
     */

    @Override
    public IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException{

        try {
            if (to.getMetricSystem().getClass().equals(this.targetSystem.getClass())){

                // transformar unidades de from a unidad base

                double value = from.getUnit().transformTo(from.getValue(), from.getUnit().getMetricSystem().base());

                // transformar base a base de to
                IMagnitude m2 = new Magnitude(value*this.change, targetSystem.base());

                // transformar de base de to a to

                return new Magnitude( m2.getUnit().transformTo(m2.getValue(), to), to);
                
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
    
    
    /**
     * Método que devuelve el conversor inverso al actual
	 * 	 
     *
     * @return IMetricSystemConverter requerido
     */
    
    @Override
    public IMetricSystemConverter reverse() { 
    	for (IMetricSystemConverter m: MetricSystem.getConverters()) {
    		if (m.targetSystem().equals(this.sourceSystem()) && m.sourceSystem().equals(this.targetSystem()))
    			return m;
    		
    	}
		return new MetricSystemConverter(targetSystem(), sourceSystem(), 1/change);
    	
    }
    

}