package metricSystems;

import java.util.Collection;

import units.*;


public abstract class MetricSystem implements IMetricSystem {

    private static IMetricSystemConverter converter;

    public IMetricSystemConverter getConverter() { return (MetricSystemConverter)converter; }
    public static void registerConverter(IMetricSystemConverter to) { converter =  to; }

    public abstract IPhysicalUnit base();
    public abstract Collection<IPhysicalUnit> units();


}