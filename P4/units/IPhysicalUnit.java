package units;

import magnitude.exceptions.*;

public interface IPhysicalUnit {
    boolean canTransformTo(IPhysicalUnit u);
    double transformTo(double d, IPhysicalUnit u) throws QuantityException;
    Quantity getQuantity();
    String abbrev();
    // IMetricSystem getMetricSystem(); // No implementar de momento en este apartado
    }