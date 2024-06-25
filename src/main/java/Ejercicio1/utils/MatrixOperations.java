package Ejercicio1.utils;

import Ejercicio1.datastructures.QueueOfStacks;
import java.util.Stack;

public class MatrixOperations {

    public static int trace(QueueOfStacks q) {
        int trace = 0;
        for (int i = 0; i < q.getSize(); i++) {
            trace += q.get(i, i);
        }
        return trace;
    }

    public static QueueOfStacks transpose(QueueOfStacks q) {
        QueueOfStacks transposed = new QueueOfStacks(q.getSize());
        for (int i = 0; i < q.getSize(); i++) {
            for (int j = 0; j < q.getSize(); j++) {
                transposed.push(j, q.get(i, j));
            }
        }
        return transposed;
    }

    public static QueueOfStacks add(QueueOfStacks q1, QueueOfStacks q2) {
        if (q1.getSize() != q2.getSize()) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        QueueOfStacks sum = new QueueOfStacks(q1.getSize());
        for (int i = 0; i < q1.getSize(); i++) {
            for (int j = 0; j < q1.getSize(); j++) {
                sum.push(i, q1.get(i, j) + q2.get(i, j));
            }
        }
        return sum;
    }
}
