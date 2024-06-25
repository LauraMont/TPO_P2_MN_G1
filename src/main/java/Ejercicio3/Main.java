package Ejercicio3;

import Ejercicio3.QueueOfQueue;

public class Main {
//    1. concatenate: Recibe n instancias de QueueOfQueue y genera una nueva instancia de QueueOfQueue
//    con todos los elementos de las instancias anteriores manteniendo el orden en que se leyeron los valores de estas instancias.
//    2. flat: Crear una instancia de Queue a partir de la instancia de QueueOfQueue con los mismos elementos.
//    3. reverseWithDepth: Invierte la instancia de QueueOfQueue pero también cada Queue dentro de esta
    public static void main(String[] args) {

        QueueOfQueue qoq1 = new QueueOfQueue();
        QueueOfQueue qoq2 = new QueueOfQueue();

        Queue q1 = new Queue();
        Queue q2 = new Queue();
        Queue q3 = new Queue();
        Queue q4 = new Queue();
        Queue q5 = new Queue();
        Queue q6 = new Queue();

        q1.add(1);
        q1.add(2);
        q2.add(3);
        q2.add(4);
        q3.add(5);
        q3.add(6);
        q4.add(7);
        q4.add(8);
        q5.add(9);
        q5.add(10);
        q6.add(11);
        q6.add(12);

        qoq1.add(q1);
        qoq1.add(q2);
        qoq1.add(q3);
        qoq2.add(q4);
        qoq2.add(q5);

        System.out.println("QueueOfQueues1: ");
        qoq1.printQueues();
        System.out.println("QueueOfQueues2: ");
        qoq2.printQueues();
        QueueOfQueue qoq3 = new QueueOfQueue();

        qoq3.concatenate(qoq1,qoq2);
        System.out.println("\nQueues concatenadas:");
        qoq3.printQueues();
        qoq3.reverseWithDepth();
        System.out.println("\nQueues revertidas:");
        qoq3.printQueues();
        System.out.println("\nQueue plana con elementos de Queue of queues:");
        System.out.println(qoq3.flat());
    }
}