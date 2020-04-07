package magnitude;

import magnitude.exceptions.QuantityException;
import metricSystems.si.length.SiLengthMetricSystem;
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
			(this.unit).canTransformTo(m.getUnit()); 
			value += m.transformTo(this.unit).getValue();
			return this;
		}
		catch(QuantityException ex) {
			throw new QuantityException();
		}
	}


	public IMagnitude subs(IMagnitude m) throws QuantityException {
		try {
			(this.unit).canTransformTo(m.getUnit()); 
			value -= m.transformTo(this.unit).getValue();
			return this;
		}
		catch(QuantityException ex) {
			throw new QuantityException();
		}
	}

	public IMagnitude transformTo(IPhysicalUnit c) throws QuantityException {
		try{
			IMagnitude m  = new Magnitude((this.unit).transformTo(this.value, c), c);
			return m;

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
        String buf = String.format("%.1f", this.value); 		
        return  buf + " " + "[" + this.unit + "]";
	}

}
