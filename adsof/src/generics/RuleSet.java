package generics;

import java.util.*;
import java.util.stream.Collectors;

public class RuleSet<T> {

    private Set<Rule<T>> rules = new LinkedHashSet<>();
    private Collection<T> str;
    
    public Set<Rule<T>> getRules() { return rules; }
    
    
    public Collection<T> getStr() { 
    	if (str == null) return null;
    	return str; 
    }
    
    public RuleSet<T>  add(Rule<T> rule){
        rules.add(rule);
        return this;
    }


    public void setExecContext(Collection<T> str){
        this.str = str;
    }

    public void process(){

        for (Rule<T> r: rules) {

        	str.forEach(s -> {
        		if(r.getWhen().test(s))  r.getExec().accept(s);

        	});
        }
    }


    

}