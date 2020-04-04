package ads.metricSystems.si.length;
import ads.units.*;
import ads.magnitude.exceptions.QuantityException;
import ads.metricSystems.*; //Esto no se si sobra

public class SiLengthMetricSystem implements IPhysicalUnit {

    public static final IPhysicalUnit METER;
    public static final IPhysicalUnit KILOMETER;
    public static final IPhysicalUnit MILIMETER;


    public Quantity quantity;
    public String abbrev;

    SiLengthMetricSystem(){
        quantity = Quantity.LENGTH;
        abbrev = 
    }

    public boolean canTransformTo(IPhysicalUnit u) {
        if(u.getQuantity().equals(quantity)) {
            return true;
        }
        return false;
    }
    
    public double transformTo(double d, IPhysicalUnit u) throws QuantityException {
        if(canTransformTo(u)) {
            //CODIGO
        }

        else {
            throw new QuantityException();
            return;
        }
    }
    
    public Quantity getQuantity() {
        return quantity;
    }
    
    public String abbrev() {

        
    }


}