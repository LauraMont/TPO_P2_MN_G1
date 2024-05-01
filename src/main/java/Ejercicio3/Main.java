package Ejercicio3;

import Ejercicio3.QueueOfQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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


        QueueOfQueue qoq3 = new QueueOfQueue();

        qoq3.concatenate(qoq1,qoq2);
        System.out.println(qoq3);
        qoq3.reverseWithDepth();
        System.out.println(qoq3);

        System.out.println(qoq3.flat());

    }
}