package org.Ejercicio2.adt;
import java.util.*;

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
        Stack<T> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            T element = stack.pop();
            reversedStack.push(element);
        }
    }


    private static <T> void insertAtBottom(Stack<T> stack, T element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        T temp = stack.pop();
        insertAtBottom(stack, element);
        stack.push(temp);
    }

    public static <T> void copyStack(Stack<T> originalStack, Stack<T> copiedStack) {
        Stack<T> tempStack = new Stack<>();
        while (!originalStack.isEmpty()) {
            T item = originalStack.pop();
            copiedStack.push(item);
            tempStack.push(item);
        }
        while (!tempStack.isEmpty()) {
            originalStack.push(tempStack.pop());
        }
        reverseStack(copiedStack);
    }
}

