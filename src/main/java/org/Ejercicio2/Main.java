package org.Ejercicio2;

import org.Ejercicio2.adt.Queue;
import org.Ejercicio2.adt.Set;
import org.Ejercicio2.adt.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        // Crear una nueva instancia de Stack para copiar los elementos
        Stack<Integer> copiedStack = new Stack<>();
        Stack.copyStack(stack, copiedStack);

        // Invertir los elementos en la copia del Stack
        Stack.reverseStack(copiedStack);

// Crear una nueva instancia de Stack para almacenar la pila invertida
        Stack<Integer> reversedStack = new Stack<>();

// Imprimir la pila invertida
        System.out.println("Stack invertido:");
        while (!copiedStack.isEmpty()) {
            int item = copiedStack.pop();
            reversedStack.push(item);
            System.out.println(item);
        }

// Restaurar copiedStack para otros usos (si es necesario)
        Stack.copyStack(reversedStack, copiedStack);

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
        Set<String> copiedSet = originalSet.copySet(originalSet);

        // Imprimir el Set original
        System.out.println("\nSet original:");
        for (String item : originalSet.set) {
            System.out.println(item);
        }

        // Imprimir el Set copiado
        System.out.println("\nSet copiado:");
        for (String item : copiedSet.set) {
            System.out.println(item);
        }
    }
}
