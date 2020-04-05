package magnitude.exceptions;


public class QuantityException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Override
    public String toString() {
        return "Quantities t and L are not compatible";
    }
}