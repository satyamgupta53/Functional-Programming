package CaseStudy_oops;

import java.util.Iterator;
import java.util.TreeSet;

public class SimpleTreeSet<T> extends SimpleAbstractSet<T> {
    public SimpleTreeSet() {
        super(new TreeSet<>());
    }

    /* These methods are overridden to decorate the following methods */
    @Override
    public Iterator<T> iterator() {
        System.out.println("We called SimpleTreeSet.iterator()");
        return super.iterator();
    }
    
    @Override
    public boolean contains(Object obj) {
        System.out.println("We called SimpleTreeSet.contains()");
        return super.contains(obj);
    }

    @Override
    public boolean add(T obj) {
        System.out.println("We called SimpleTreeSet.add()");
        return super.add(obj);
    }
}