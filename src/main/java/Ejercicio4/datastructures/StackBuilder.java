package Ejercicio4.datastructures;

import java.util.Stack;

public class StackBuilder<T> {
    private Stack<T> stack;

    public StackBuilder() {
        stack = new Stack<>();
    }

    public StackBuilder<T> add(T element) {
        stack.push(element);
        return this;
    }

    public Stack<T> build() {
        return stack;
    }
}