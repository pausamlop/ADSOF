package magnitude;

import magnitude.exceptions.QuantityException;
import magnitude.exceptions.UnknownUnitException;
import metricSystems.MetricSystemConverter;
import units.IPhysicalUnit;

public class Magnitude implements IMagnitude {

	double value;
	IPhysicalUnit unit;



	public Magnitude(double value, IPhysicalUnit unit) {
		this.value = value;
		this.unit = unit;
	}
	
	public IPhysicalUnit getUnit() { return this.unit; }
	
	public double getValue() { return this.value; }


	
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
		try {

			// Caso1: mismo sistema metrico
			if((this.unit).canTransformTo(c)){	
				IMagnitude m  = new Magnitude((this.unit).transformTo(this.value, c), c);
				return m;
			}
			
			// Caso2: distintas quantities
			else if (!unit.getQuantity().equals(c.getQuantity())){
				throw new QuantityException();
			}

			// Caso3: misma quantity, pero distinto si, con converter
			else if ((c.getMetricSystem().getConverter()) != null){

				MetricSystemConverter metric = (MetricSystemConverter) c.getMetricSystem().getConverter();
				return ((MetricSystemConverter) metric).transformTo((IMagnitude)this,c);

			// Caso4: misma quantity, pero distinto si, con converter
			} else {
				System.out.println("Cannot transform " + this.getUnit() + " to " + c);
				return null;
			}


		}
		catch (QuantityException | UnknownUnitException ex){
			throw new QuantityException();
		}

	}

	
	@Override
	public String toString() {
        String buf = String.format("%.1f", this.value); 		
        return  buf + " " + "[" + this.unit + "]";
	}

}
