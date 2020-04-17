package src.metricSystems;

import java.util.*;


/**
 * Esta clase abstracta, MetricSystem, implementa la interfaz IMetricSystem
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public abstract class MetricSystem implements IMetricSystem {
	
	private static List<IMetricSystemConverter> converters = new ArrayList<IMetricSystemConverter>();
    
    
    public static List<IMetricSystemConverter> getConverters (){ return converters; }

    @Override
    public IMetricSystemConverter getConverter(IMetricSystem to) { 
    	for (IMetricSystemConverter m: MetricSystem.getConverters()) {
    		if (m.sourceSystem().equals(this) && m.targetSystem().equals(to))
    			return m;
    		
    	}
    	return null;
    	
    }
    
    /**
     * Registra un conversor
     * @param to IMetrycSystemConverter
     */
    public static void registerConverter(IMetricSystemConverter to) {
    	if (converters.contains(to)) return;
        converters.add(to);
        converters.add(to.reverse());
    }



}