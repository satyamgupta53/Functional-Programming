package CaseStudy_oops;

import java.util.HashSet;
import java.util.Iterator;

public class SimpleHashSet<T> extends SimpleAbstractSet<T> {
    public SimpleHashSet() {
        super(new HashSet<>());
    }

    /* These methods are overridden to decorate the following methods */
    @Override
    public Iterator<T> iterator() {
        System.out.println("We called SimpleHashSet.iterator()");
        return super.iterator();
    }

    @Override 
    public boolean contains(Object obj) {
        System.out.println("We called SimpleHashSet.contains()");
        return super.contains(obj);
    }

    @Override
    public boolean add(T obj) {
        System.out.println("We called SimpleHashSet.add()");
        return super.add(obj);
    }
}
