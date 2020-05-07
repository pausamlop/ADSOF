package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import generics.*;
/**
 * Tester apartado 3
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class Tester3 {
	
	

    public static void main(String...args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        RuleSet<Producto> rs = new RuleSet<Producto>(); 

        rs.add(
            Rule.<Producto>rule("r1", "Rebaja un 10% los productos con fecha de caducidad cercana o pasada").
                when(pro -> Producto.getDateDiff(Calendar.getInstance().getTime(), pro.getCaducidad(), TimeUnit.DAYS) < 2 ).
                exec(pro -> pro.setPrecio(pro.getPrecio()-pro.getPrecio()*0.1)) 
            ).add(
            Rule.<Producto>rule("r2", "Rebaja un 5% los productos que valen más de 10 euros"). 
                when(pro -> pro.getPrecio() > 10).
                exec(pro -> pro.setPrecio(pro.getPrecio()-pro.getPrecio()*0.05))
        );

        List<Producto> str = Arrays.asList( new Producto(10, sdf.parse("15/04/2020")), 
                                            new Producto(20, sdf.parse("20/03/2021"))); 

        rs.setExecContext(str); 
        rs.process(); 
        System.out.println(str);
    }
    
}