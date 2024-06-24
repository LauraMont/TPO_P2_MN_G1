package Ejercicio2.adt;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack<T> {
    private final LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static <T> void reverseStack(Stack<T> stack) {
        Stack<T> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
