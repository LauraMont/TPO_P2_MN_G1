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

    @Override
    public void concatenate(QueueOfQueue... queuesOfQueues) {

        //Calculamos total de colas a concatenar
        int totalQueues = 0;
        for(QueueOfQueue queueOfQueue : queuesOfQueues){
            totalQueues += queueOfQueue.count;
        }

        if(totalQueues > MAX){
            throw new RuntimeException("No puedes concatenar más de " + MAX + " colas.");
        }

        for(QueueOfQueue queueOfQueue : queuesOfQueues){
            while(!queueOfQueue.isEmpty()){
                Queue resultQueue = new Queue();
                Queue queueToConcatenate = queueOfQueue.getFirst();
                queueOfQueue.remove();
                while(!queueToConcatenate.isEmpty()){
                    resultQueue.add(queueToConcatenate.getFirst());
                    queueToConcatenate.remove();
                }
                this.add(resultQueue);
            }
        }

    }

    @Override
    public Queue flat() {

        Queue result = new Queue();

        while(!this.isEmpty()){
            Queue first = this.getFirst();
            this.remove();
            while(!first.isEmpty()){
                result.add(first.getFirst());
                first.remove();
            }
        }

        return result;

    }

    @Override
    public void reverseWithDepth() {

        if(!isEmpty()){
            Queue queue = getFirst();
            remove();
            queue.reverseQueue();
            reverseWithDepth();
            add(queue);
        }

    }

    @Override
    public String toString() {
        return "QueueOfQueue{" + Arrays.toString(array) +'}';
    }
}
