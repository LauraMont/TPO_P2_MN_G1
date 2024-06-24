package Ejercicio6;

import Ejercicio6.adt.DynamicCircularDeque;

public class Main3 {
    public static void main(String[] args) {
        DynamicCircularDeque deque = new DynamicCircularDeque();

        // Agregar elementos a la cola
        deque.add(10);
        deque.add(20);
        deque.add(30);

        // Obtener y mostrar el primer y el último elemento
        System.out.println("Primer elemento: " + deque.getFirst()); // Debería imprimir: 10
        System.out.println("Último elemento: " + deque.getLast());  // Debería imprimir: 30

        // Eliminar el primer elemento
        deque.remove();

        // Obtener y mostrar el primer y el último elemento nuevamente
        System.out.println("Primer elemento: " + deque.getFirst()); // Debería imprimir: 20
        System.out.println("Último elemento: " + deque.getLast());  // Debería imprimir: 30

        // Agregar más elementos
        deque.add(40);
        deque.add(50);

        // Mostrar todos los elementos de la cola
        System.out.print("Elementos en la cola: ");
        for (int i = 0; i < deque.getSize(); i++) {
            System.out.print(deque.getFirst() + " ");
            deque.remove();
        }
    }
}
