package generics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Rule<T> {

    private String name;
    private String description;

    private Predicate<T> when;
    private Consumer<T> exec;



    public Predicate<T> getWhen() {
        return this.when;
    }

    public Consumer<T> getExec() {
        return this.exec;
    }



    public Rule(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public Rule<T> when(Predicate<T> lambda){
        this.when = lambda;
		return this;

    }

    public Rule<T> exec(Consumer<T> lambda){ 
        this.exec = lambda;
		return this;
        
    }

	public static <T> Rule<T> rule(String string, String string2) {
		
		return new Rule<T>(string, string2);
	}
    
}