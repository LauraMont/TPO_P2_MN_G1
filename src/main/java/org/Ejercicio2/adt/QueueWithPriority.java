package org.Ejercicio2.adt;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithPriority<T> {
    private Queue<T> queue;

    public QueueWithPriority() {
        // Inicializa una cola con prioridad vacía
        queue = new PriorityQueue<>();
    }

    public void add(T item) {
        // Agrega un elemento a la cola con prioridad
        queue.offer(item);
    }

    public T remove() {
        // Remueve y devuelve el elemento con mayor prioridad de la cola
        return queue.poll();
    }

    public T peek() {
        // Devuelve el elemento con mayor prioridad sin removerlo de la cola
        return queue.peek();
    }

    public boolean isEmpty() {
        // Verifica si la cola con prioridad está vacía
        return queue.isEmpty();
    }

    public int size() {
        // Devuelve el tamaño de la cola con prioridad
        return queue.size();
    }
}

