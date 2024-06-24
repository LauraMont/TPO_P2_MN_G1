package Ejercicio2.adt;

import java.util.PriorityQueue;

public class QueueWithPriority<T> {
    private PriorityQueue<T> queue;

    public QueueWithPriority() {
        queue = new PriorityQueue<>();
    }

    public void add(T item) {
        queue.offer(item);
    }

    public T remove() {
        return queue.poll();
    }

    public T peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
