package units;

import magnitude.exceptions.*;
import metricSystems.IMetricSystem;



/**
 * Esta interfaz declara los métodos que modelan el comportamiento de los 
 * objetos PhysicalUnit
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public interface IPhysicalUnit {
    boolean canTransformTo(IPhysicalUnit u);
    double transformTo(double d, IPhysicalUnit u) throws QuantityException;
    Quantity getQuantity();
    String abbrev();
    IMetricSystem getMetricSystem();
    }