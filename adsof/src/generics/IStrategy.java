package generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface IStrategy<T>{
    void behaviour(Set<Rule<T>> set, Collection<T> collection);

}
