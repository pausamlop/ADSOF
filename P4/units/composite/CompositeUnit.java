package units.composite;

import magnitude.exceptions.QuantityException;
import metricSystems.IMetricSystem;
import units.IPhysicalUnit;
import units.Quantity;


/**
 * Esta clase implementa las unidades compuestas 
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class CompositeUnit implements ICompositeUnit{
	
	public IPhysicalUnit left;
	public IPhysicalUnit right;
	public Operator op;
	public IMetricSystem metric;
	
	public CompositeUnit(IPhysicalUnit left, Operator op, IPhysicalUnit right) {
		this.left = left;
		this.right = right;
		this.op = op;
	}

	
	@Override
	public IPhysicalUnit getLeftUnit() { return left; }

	@Override
	public IPhysicalUnit getRightUnit() { return right; }
	
	@Override
	public Quantity getQuantity() { return Quantity.COMPOSITE; }

	@Override
	public String abbrev() { return left.abbrev() + "/" + right.abbrev(); }

	@Override
	public IMetricSystem getMetricSystem() { return metric; }

	@Override
	public Operator getOperator() { return op; }
	
	
	
	 /**
     * Método que determina si una unidad se puede transformar a otra
	 * 
     * @param u IPhysicalUnit a la que se quiere realizar el cambio
     * @return true o false si se puede transformar o no
     */
	
	@Override
	public boolean canTransformTo(IPhysicalUnit u) {
		
		 if (!this.getQuantity().equals(u.getQuantity())) {
	            return false;
	        }
		 
		 CompositeUnit comp = (CompositeUnit) u;
	     return this.left.canTransformTo(comp.getLeftUnit()) && this.right.canTransformTo(comp.getRightUnit());

	}

	/**
     * Método que transforma la unidad compuesta actual a otra. 
	 * 
	 * Si no se puede realizar dicho cambio, el método lanza excepción de tipo QuantityException
	 * 
     * @param u IPhysicalUnit a la que se quiere realizar el cambio
     * @param d valor 
     * @return double con el cambio
     */
	@Override
	public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
		if(!canTransformTo(u)) throw new QuantityException();
		
		ICompositeUnit comp = (ICompositeUnit) u;
        if (op.equals(Operator.MULT))
            return left.transformTo(d, comp.getLeftUnit()) * right.transformTo(1.0, comp.getRightUnit());
        else 
            return left.transformTo(d, comp.getLeftUnit()) / right.transformTo(1.0, comp.getRightUnit());
        
	}
	
    @Override
    public String toString() {
        return this.abbrev();
    }


}
