package generics;


public class RuleSetWithStrategy<T> extends RuleSet<T>{

    private IStrategy<T> strategy;

	public RuleSetWithStrategy(IStrategy<T> strategy) {
		this.strategy = strategy;
	}

	@Override
	public void process(){
		strategy.behaviour(getRules(), getStr());
    }

    
}