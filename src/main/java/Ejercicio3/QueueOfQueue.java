package Ejercicio3;

import java.util.Arrays;

public class QueueOfQueue implements IQueueOfQueue{
    private Queue[] array;
    private int count;
    private final int MAX = 5;

    public QueueOfQueue(){
        array = new Queue[MAX];
        count = 0;
    }
    @Override
    public void add(Queue queue) {
        if(count == MAX){
            throw new RuntimeException("Límite de cola de colas excedido.");
        }
        array[count] = queue;
        count++;
    }
    @Override
    public void remove() {
        if(isEmpty()) {
            throw new RuntimeException("La cola de colas no tiene elementos.");
        }
        for(int i = 0; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }
    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    @Override
    public Queue getFirst() {
        if(isEmpty()) {
            throw new RuntimeException("La cola no tiene elementos.");
        }
        return array[0];
    }
//  Recibe n instancias de QueueOfQueue y genera una nueva instancia de QueueOfQueue con todos los elementos
//  de las instancias anteriores manteniendo el orden en que se leyeron los valores de estas instancias.
    @Override
    public void concatenate(QueueOfQueue... queuesOfQueues) {
        //recorro el array queuesOfQueues
        for (QueueOfQueue queueOfQueue : queuesOfQueues) {
            //recorro cada queueOfQueue
            while (!queueOfQueue.isEmpty()) {
                //agrego al actual cada queue
                Queue queueToAdd = queueOfQueue.getFirst();
                queueOfQueue.remove();
                this.add(queueToAdd);
            }
        }
    }

    @Override
//  flat: Crear una instancia de Queue a partir de la instancia de QueueOfQueue con los mismos elementos.
    public Queue flat() {
        Queue result = new Queue();
        //recorro todas las queues
        for (int i = 0; i < count; i++) {
            Queue currentQueue = array[i];
            while (!currentQueue.isEmpty()) {
                //agrego los valores de cada queue en la nueva queue
                result.add(currentQueue.getFirst());
                currentQueue.remove();
            }
        }
        return result;
    }
//  reverseWithDepth: Invierte la instancia de QueueOfQueue pero también cada Queue dentro de esta
    @Override
    public void reverseWithDepth() {
        for (int i = 0; i < count; i++) {
            //revierto los valores de cada queue
            array[i].reverseQueue();
        }
        //revierto el orden de las queue en el array de queues
        reverseArray(array, count);
    }
    private void reverseArray(Queue[] array, int count) {
        //recorro la mitad del array, ya que asigno el último con el primero sucesivamente
        for (int i = 0; i < count / 2; i++) {
            Queue temp = array[i];
            array[i] = array[count - i - 1];
            array[count - i - 1] = temp;
        }
    }
    // Método para imprimir todas las colas
    public void printQueues() {
        for (int i = 0; i < count; i++) {
            System.out.println("Queue " + (i + 1) + ": " + array[i].toString());
        }
    }
    @Override
    public String toString() {
        return "QueueOfQueue{" + Arrays.toString(array) +'}';
    }
}
