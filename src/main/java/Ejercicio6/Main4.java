package Ejercicio6;

import Ejercicio6.adt.Multiset;

public class Main4 {
    public static void main(String[] args) {
        Multiset multiset = new Multiset();

        // Añadir elementos al multiset
        multiset.add(10);
        multiset.add(20);
        multiset.add(10);
        multiset.add(30);
        multiset.add(20);
        multiset.add(10);

        // Mostrar el multiset
        System.out.println("Multiset: " + multiset);

        // Mostrar la cantidad de un elemento específico
        System.out.println("Cantidad de 10: " + multiset.count(10)); // Debería imprimir: 3
        System.out.println("Cantidad de 20: " + multiset.count(20)); // Debería imprimir: 2
        System.out.println("Cantidad de 30: " + multiset.count(30)); // Debería imprimir: 1

        // Eliminar elementos del multiset
        multiset.remove(10);
        multiset.remove(30);

        // Mostrar el multiset después de eliminar
        System.out.println("Multiset después de eliminar: " + multiset);

        // Verificar si un elemento está en el multiset
        System.out.println("Contiene 10: " + multiset.contains(10)); // Debería imprimir: true
        System.out.println("Contiene 30: " + multiset.contains(30)); // Debería imprimir: false
    }
}
