package test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Producto {
    private double precio;
    private Date caducidad; 
    
    public Producto (double p, Date c) {
        this.precio = p;
        this.caducidad = c;
    }
    public double getPrecio() { return this.precio; }
    public void setPrecio(double p) { this.precio = p; }
    public Date getCaducidad() { return this.caducidad; }
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
    
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }
    @Override public String toString() { return this.precio+", caducidad: "+this.caducidad; }
}
