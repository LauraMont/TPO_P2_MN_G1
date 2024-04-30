package Ejercicio1.utils;

import Ejercicio1.datastructures.QueueOfStacks;
import java.util.Stack;

public class MatrixOperations {

    public static int trace(QueueOfStacks q) {
        int trace = 0;
        for (int i = 0; i < q.getSize(); i++) {
            trace += q.getStacks().get(i).get(i);
        }
        return trace;
    }

    public static QueueOfStacks transpose(QueueOfStacks q) {
        QueueOfStacks transposed = new QueueOfStacks(q.getSize());
        for (int i = 0; i < q.getSize(); i++) {
            for (int j = 0; j < q.getSize(); j++) {
                transposed.push(j, q.getStacks().get(i).get(j));
            }
        }
        return transposed;
    }

    public static QueueOfStacks add(QueueOfStacks q1, QueueOfStacks q2) {
        QueueOfStacks sum = new QueueOfStacks(q1.getSize());
        for (int i = 0; i < q1.getSize(); i++) {
            Stack<Integer> stack1 = q1.getStacks().get(i);
            Stack<Integer> stack2 = q2.getStacks().get(i);
            Stack<Integer> resultStack = new Stack<>();
            for (int j = 0; j < q1.getSize(); j++) {
                resultStack.push(stack1.get(j) + stack2.get(j));
            }
            sum.getStacks().set(i, resultStack);
        }
        return sum;
    }
}
