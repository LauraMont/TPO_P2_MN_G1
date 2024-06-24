package Ejercicio2.adt;

import java.util.HashSet;

public class Set<T> {
    private final HashSet<T> set;

    public Set() {
        set = new HashSet<>();
    }

    public void add(T item) {
        set.add(item);
    }

    public void remove(T item) {
        set.remove(item);
    }

    public boolean contains(T item) {
        return set.contains(item);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public Set<T> copySet() {
        Set<T> copiedSet = new Set<>();
        for (T item : this.set) {
            copiedSet.add(item);
        }
        return copiedSet;
    }

    public Iterable<T> getElements() {
        return set;
    }
}
