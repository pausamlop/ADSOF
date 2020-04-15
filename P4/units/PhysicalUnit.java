package units;

import magnitude.exceptions.QuantityException;
import metricSystems.IMetricSystem;


/**
 * Esta clase implementa las unidades fisicas 
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class PhysicalUnit implements IPhysicalUnit{

    private Quantity quantity;
    private String abbrev;
    private double equiv;
    private IMetricSystem metric;


    /**
     * Método constructor de la clase PhysicalUnit
	 * 
     * @param value double
     * @param unit IPhysicalUnit	 
     */

    public PhysicalUnit(Quantity quantity, String abbrev, double equiv, IMetricSystem metric) {
        this.quantity = quantity;
        this.abbrev = abbrev;
        this.equiv = equiv;
        this.metric = metric;
    }

    @Override
    public Quantity getQuantity() { return this.quantity; }
    
    @Override
    public String abbrev() { return this.abbrev; }

    @Override
    public IMetricSystem getMetricSystem() { return this.metric; }


	 /**
     * Método que determina si una unidad se puede transformar en otra si pertenecen
     * al mismo sistema metrico
	 * 
     * @param u IPhysicalUnit a la que se quiere realizar el cambio
     * @return true o false si se puede transformar o no
     */
    @Override
    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getMetricSystem().equals(this.metric)) return true;
        return false;
    }
    
    
	 /**
     * Método que transforma la unidad fisica actual a otra. 
	 * 
	 * Si no se puede realizar dicho cambio, el método lanza excepción de tipo QuantityException
	 * 
     * @param u IPhysicalUnit a la que se quiere realizar el cambio
     * @param d valor 
     * @return IMagnitude una vez realizado el cambio
     */
    
    @Override
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if (canTransformTo(u)) {
        	PhysicalUnit p = (PhysicalUnit)u;
        	return d * this.equiv / p.equiv;
        }
        else throw new QuantityException();
        
    }

	 /**
     * Modificación del método toString para adecuarlo a la salida
	 * deseada
	 * 
     * @return String deseado para imprimir por pantalla
     */
    
    @Override
    public String toString() {
        return abbrev() + " " + getQuantity();
    }

}