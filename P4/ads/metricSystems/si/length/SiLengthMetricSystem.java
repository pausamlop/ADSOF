package ads.metricSystems.si.length;
import ads.units.IPhysicalUnit;
import ads.metricSystems.*; //Esto no se si sobra

public class SiLengthMetricSystem implements IPhysicalUnit {

    public Quantity quantity = Quantity.LENGTH;

    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getQuantity().equals(quantity)) {
            return true;
        }
        return false;
    }
    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException;
    
    public Quantity getQuantity() {
        return quantity;
    }
    
    public String abbrev() {
        
    }


}