package Ejercicio3;

public interface IQueueOfQueue{

    void add(Queue queue);

    void remove();

    boolean isEmpty();

    Queue getFirst();

    void concatenate(QueueOfQueue... queuesOfQueues);

    Queue flat();

    void reverseWithDepth();

}
