package CaseStudy_oops;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("SuspiciousMethodCalls")
public class SimpleConcurrentHashSet<T> extends SimpleAbstractSet<T> {
    public SimpleConcurrentHashSet() {
        super(ConcurrentHashMap.newKeySet());
    }

    /* These methods are overridden to decorate the following methods */
    @Override
    public boolean contains(Object obj) {
        System.out.println("We called SimpleConcurrentHashSet.contains()");
        return super.contains(obj);
    }

    @Override
    public boolean add(T obj) {
        System.out.println("We called SimpleConcurrentHashSet.add()");
        return super.add(obj);
    }

    @Override
    public Iterator<T> iterator() {
        System.out.println("We called SimpleConcurrentHashSet.iterator()");
        return super.iterator();
    }
}
