package metricSystems;
import magnitude.IMagnitude;

import units.IPhysicalUnit;
import magnitude.exceptions.UnknownUnitException;

public interface IMetricSystemConverter {
    IMetricSystem sourceSystem();
    IMetricSystem targetSystem();
    //IMagnitude transformTo(IMagnitude from, IPhysicalUnit to) throws UnknownUnitException;
    IMetricSystemConverter reverse();
    }