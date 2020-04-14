package units;

import magnitude.exceptions.QuantityException;
import metricSystems.IMetricSystem;

public class CompositeUnit implements ICompositeUnit{
	
	public IPhysicalUnit left;
	public IPhysicalUnit right;

	
	@Override
	public IPhysicalUnit getLeftUnit() { return left; }

	@Override
	public IPhysicalUnit getRightUnit() { return right; }
	
	@Override
	public Quantity getQuantity() { return Quantity.COMPOSITE; }

	@Override
	public String abbrev() { return left.abbrev() + "/" + right.abbrev(); }
	
	
	
	
	
	@Override
	public boolean canTransformTo(IPhysicalUnit u) {
		if ()
		if (left.canTransformTo(u) && right.canTransformTo(u)) return 
		return false;
	}

	@Override
	public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public IMetricSystem getMetricSystem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operator getOperator() {
		// TODO Auto-generated method stub
		return null;
	}



}
