package CaseStudy_oops;

import java.util.Iterator;
import java.util.Set;

public abstract class SimpleAbstractSet<T> implements Iterable<T> {
    /* stores information about concreate sub class */
    protected final Set<T> mSet;

    SimpleAbstractSet(Set<T> set) {
        this.mSet = set;
    }

    /* define iterator method */
    @Override
    public Iterator<T> iterator() {
        return mSet.iterator();
    }   

    public boolean contains(Object obj) {
        return mSet.contains(obj);
    }

    /* if set changed, returns true */
    public boolean add(T obj) {
        return mSet.add(obj);
    }
}
