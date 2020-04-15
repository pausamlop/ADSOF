package magnitude;

import magnitude.exceptions.QuantityException;
import units.IPhysicalUnit;


/**
 * Esta interfaz declara los métodos que modelan el comportamiento de los 
 * objetos Magnitude
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public interface IMagnitude {
    IMagnitude add (IMagnitude m) throws QuantityException;
    IMagnitude subs(IMagnitude m) throws QuantityException;
    IMagnitude transformTo(IPhysicalUnit c) throws QuantityException;
    IPhysicalUnit getUnit();
    double getValue();
    }