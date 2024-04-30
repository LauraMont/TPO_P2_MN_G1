package Ejercicio4;

import Ejercicio4.datastructures.FlexibleQueue;
import Ejercicio4.datastructures.SetBuilder;
import Ejercicio4.datastructures.StackBuilder;

import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Uso del SetBuilder
        SetBuilder<Integer> setBuilder = new SetBuilder<>();
        Set<Integer> resultSet = setBuilder.add(1).add(2).add(3).build();
        System.out.println("Set resultante: " + resultSet);

        // Uso del StackBuilder
        StackBuilder<String> stackBuilder = new StackBuilder<>();
        Stack<String> resultStack = stackBuilder.add("Hello").add("World").build();
        System.out.println("Stack resultante: " + resultStack);

        // Uso de FlexibleQueue
        FlexibleQueue<String> queue = new FlexibleQueue<>("Alpha", "Beta", "Gamma");
        System.out.println("Queue resultante: " + queue.getQueue());
    }
}