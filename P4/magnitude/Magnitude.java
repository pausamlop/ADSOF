package magnitude;

import magnitude.exceptions.QuantityException;
import units.IPhysicalUnit;

public class Magnitude implements IMagnitude {

	double value;
	IPhysicalUnit unit;



	public Magnitude(double value, IPhysicalUnit unit) {
		this.value = value;
		this.unit = unit;
	}


	public IMagnitude add(IMagnitude m) throws QuantityException {
		try {
			getUnit().canTransformTo(m.getUnit()); 
			value += m.transformTo(this.unit).getValue();
			return this;
		}
		catch(QuantityException ex) {
			throw new QuantityException();
		}
	}


	public IMagnitude subs(IMagnitude m) throws QuantityException {
		try {
			getUnit().canTransformTo(m.getUnit()); 
			value -= m.transformTo(this.unit).getValue();
			return this;
		}
		catch(QuantityException ex) {
			throw new QuantityException();
		}
	}

	public IMagnitude transformTo(IPhysicalUnit c) throws QuantityException {
		try{
			this.value = c.transformTo(this.getValue(), this.getUnit());

			return this;
		}
		catch(QuantityException ex){
			throw new QuantityException();
		}
	}


	public IPhysicalUnit getUnit() {
		return this.unit;
	}

	
	public double getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
        String buf = String.format("%.1f", getValue()); 		
        return   buf + " " +getUnit().toString();
	}

}
