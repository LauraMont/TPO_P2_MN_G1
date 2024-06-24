package Ejercicio6.adt;

import java.util.HashMap;
import java.util.Map;

public class Multiset {
    private Map<Integer, ElementCount> elements;

    public Multiset() {
        this.elements = new HashMap<>();
    }

    public void add(int value) {
        ElementCount elementCount = elements.get(value);
        if (elementCount == null) {
            elements.put(value, new ElementCount(value, 1));
        } else {
            elementCount.setCount(elementCount.getCount() + 1);
        }
    }

    public void remove(int value) {
        ElementCount elementCount = elements.get(value);
        if (elementCount == null) {
            throw new RuntimeException("El elemento no está en el conjunto");
        } else if (elementCount.getCount() == 1) {
            elements.remove(value);
        } else {
            elementCount.setCount(elementCount.getCount() + 1);
        }
    }

    public boolean contains(int value) {
        return elements.containsKey(value);
    }

    public int count(int value) {
        ElementCount elementCount = elements.get(value);
        return elementCount == null ? 0 : elementCount.getCount();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (ElementCount elementCount : elements.values()) {
            sb.append(elementCount.toString()).append(" ");
        }
        sb.append("}");
        return sb.toString();
    }
}
