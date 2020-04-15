package metricSystems;

import java.util.Collection;
import units.IPhysicalUnit;


/**
 * Esta interfaz declara los métodos que modelan el comportamiento de los 
 * objetos MetricSystem
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public interface IMetricSystem {
        IPhysicalUnit base();
        Collection<IPhysicalUnit> units();
        // Added for convertible
        IMetricSystemConverter getConverter();
        }
