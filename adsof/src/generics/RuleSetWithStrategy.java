package generics;

/**
 * Esta clase modela los cojuntos de reglas con estrategia
 * 
 * @author Miguel Escribano miguel.escribanoo@estudiante.uam.es
 * @author Paula Samper paula.samper@estudiante.uam.es
 */
public class RuleSetWithStrategy<T> extends RuleSet<T>{

    private IStrategy<T> strategy;
	/**
	 * Metodo constructor
	 * 
	 * @param strategy IStrategy<T>
	 */
	public RuleSetWithStrategy(IStrategy<T> strategy) {
		this.strategy = strategy;
	}
	
	/**
     * Metodo encargado de ejecutar el conjunto de reglas segun la estrategia
     *
     */
	@Override
	public void process(){
		strategy.behaviour(getRules(), getStr());
    }

    
}