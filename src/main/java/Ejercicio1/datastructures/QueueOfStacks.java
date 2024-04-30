package Ejercicio1.datastructures;

import java.util.LinkedList;
import java.util.Stack;

public class QueueOfStacks {
    private LinkedList<Stack<Integer>> stacks;
    private int size;

    public QueueOfStacks(int n) {
        stacks = new LinkedList<>();
        size = n;
        for (int i = 0; i < n; i++) {
            stacks.add(new Stack<Integer>());
        }
    }

    public void push(int stackIndex, int value) {
        stacks.get(stackIndex).push(value);
    }

    public int pop(int stackIndex) {
        return stacks.get(stackIndex).pop();
    }

    public int peek(int stackIndex) {
        return stacks.get(stackIndex).peek();
    }

    public int getSize() {
        return size;
    }

    public LinkedList<Stack<Integer>> getStacks() {
        return stacks;
    }
}
