package Ejercicio6;

import Ejercicio6.adt.DynamicStack;

public class Main1 {
    public static void main(String[] args) {

        /* PUNTO 1*/
        System.out.println("Punto 1:");

        // Crear una pila con capacidad de 5 elementos
        DynamicStack stack = new DynamicStack(5);

        // Añadir elementos a la pila
        try {
            stack.add(10);
            stack.add(20);
            stack.add(30);
            stack.add(40);
            stack.add(50);
            System.out.println("Elementos añadidos correctamente.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Intentar añadir un elemento más para ver el manejo de la capacidad máxima
        try {
            stack.add(60);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Debería imprimir: "La pila ha alcanzado su capacidad máxima"
        }

        // Obtener y eliminar elementos de la pila
        while (!stack.isEmpty()) {
            System.out.println("Cima de la pila: " + stack.getTop()); // Imprimir el elemento en la cima
            stack.remove(); // Eliminar el elemento en la cima
        }

        // Intentar eliminar un elemento de una pila vacía para ver el manejo de la excepción
        try {
            stack.remove();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Debería imprimir: "No se puede desapilar una pila vacía"
        }

    }
    }
