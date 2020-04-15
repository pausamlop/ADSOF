package magnitude;

import magnitude.exceptions.QuantityException;
import magnitude.exceptions.UnknownUnitException;
import metricSystems.MetricSystemConverter;
import units.IPhysicalUnit;

/**
 * Esta clase modela los objetos de tipo Magnitude, implementa la interfaz IMagnitude
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public class Magnitude implements IMagnitude {

	double value;
	IPhysicalUnit unit;

  /**
     * Método constructor de la clase Magnitude
	 * 
     * @param value double
     * @param unit IPhysicalUnit	 
     */

	public Magnitude(double value, IPhysicalUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	@Override
	public double getValue() { return this.value; }
	
	@Override
	public IPhysicalUnit getUnit() { return this.unit; }

	
  /**
     * Método que realiza la suma de dos magnitudes, modificando la magnitud actual.
	 * El método lanza QuantityException si no se puede realizar tal operación
	 * 
     * @param m IMagnitude que queremos sumar
     * @return IMagnitude actual, realizada la suma
     */
	
	@Override
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
	

 /**
     * Método que realiza la resta de dos magnitudes, modificando la magnitud actual.
	 * El método lanza QuantityException si no se puede realizar tal operación
	 * 
     * @param m IMagnitude que queremos restar
     * @return IMagnitude actual, realizada la resta
     */
	
	@Override
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

	
	 /**
     * Método que transforma la magnitud actual a otra unidad. Se sigue un camino según la
	 * unidad de destino sea del mismo sistema métrico o no, exista un conversor para que 
	 * permita realizar la operación entre distintos sistemas métricos, etc.
	 * 
	 * Si no se puede realizar dicho cambio, el método lanza excepción de tipo QuantityException
	 * 
     * @param c IPhysicalUnit a la que se quiere realizar el cambio
     * @return IMagnitude una vez realizado el cambio
     */

	@Override
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

	 /**
     * Modificación del método toString para adecuarlo a la salida
	 * deseada
	 * 
     * @return String deseado para imprimir por pantalla
     */
	
	@Override
	public String toString() {	
        return  this.value + " " + "[" + this.unit + "]";
	}



}
