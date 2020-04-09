package metricSystems;

import java.util.Collection;
import units.IPhysicalUnit;

public interface IMetricSystem {
        IPhysicalUnit base();
        Collection<IPhysicalUnit> units();
        // Added for convertible
        IMetricSystemConverter getConverter();
        }
