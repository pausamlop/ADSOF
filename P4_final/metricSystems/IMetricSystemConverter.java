package metricSystems;
import magnitude.IMagnitude;

import units.IPhysicalUnit;
import magnitude.exceptions.UnknownUnitException;


/**
 * Esta interfaz declara los métodos que modelan el comportamiento de los 
 * objetos MetricSystemConverter
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */

public interface IMetricSystemConverter {
    IMetricSystem sourceSystem();
    IMetricSystem targetSystem();
    IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
    IMetricSystemConverter reverse();
    }