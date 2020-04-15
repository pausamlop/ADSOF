package metricSystems;



/**
 * Esta clase abstracta, MetricSystem, implementa la interfaz IMetricSystem
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public abstract class MetricSystem implements IMetricSystem {

    private static IMetricSystemConverter converter;

    @Override
    public IMetricSystemConverter getConverter() { return (MetricSystemConverter)converter; }
    

    public static void registerConverter(IMetricSystemConverter to) { converter =  to; }



}