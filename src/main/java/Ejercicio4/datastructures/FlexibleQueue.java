package Ejercicio4.datastructures;

import java.util.ArrayDeque;
import java.util.Queue;

public class FlexibleQueue<T> {
    private Queue<T> queue;

    @SafeVarargs
    public FlexibleQueue(T... elements) {
        queue = new ArrayDeque<>();
        for (T elem : elements) {
            queue.add(elem);
        }
    }

    public Queue<T> getQueue() {
        return queue;
    }
}
