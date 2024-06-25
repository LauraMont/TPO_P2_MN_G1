package Ejercicio4.datastructures;

import java.util.HashSet;
import java.util.Set;

public class SetBuilder<T> {
    private Set<T> set;

    public SetBuilder() {
        set = new HashSet<>();
    }

    public SetBuilder<T> add(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        set.add(element);
        return this;
    }

    public SetBuilder<T> addAll(Set<T> other) {
        set.addAll(new HashSet<>(other)); // Crea una copia para evitar modificar el original
        return this;
    }

    public Set<T> build() {
        return set;
    }
}
