package Ejercicio2;

import Ejercicio2.adt.Queue;
import Ejercicio2.adt.Set;
import Ejercicio2.adt.Stack;

public class Main {
    public static void main(String[] args) {
        // Prueba de Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack original:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Agregar elementos nuevamente al stack para probar las funciones
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Invertir los elementos en el Stack
        Stack.reverseStack(stack);
        System.out.println("Stack invertido:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Prueba de Queue
        Queue<String> queue = new Queue<>();
        queue.enqueue("Hola");
        queue.enqueue("Mundo");
        System.out.println("\nQueue original:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        // Crear una instancia de Set
        Set<String> originalSet = new Set<>();
        originalSet.add("a");
        originalSet.add("b");
        originalSet.add("c");

        // Llamar al método copySet en la instancia creada
        Set<String> copiedSet = originalSet.copySet();

        // Imprimir el Set original
        System.out.println("\nSet original:");
        for (String item : originalSet.getElements()) {
            System.out.println(item);
        }

        // Imprimir el Set copiado
        System.out.println("\nSet copiado:");
        for (String item : copiedSet.getElements()) {
            System.out.println(item);
        }
    }
}
