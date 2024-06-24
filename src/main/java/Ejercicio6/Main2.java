package Ejercicio6;

import Ejercicio6.adt.StaticSet;
import Ejercicio6.adt.UniversalSet;

public class Main2 {
    public static void main(String[] args) {
    /* PUNTO 2*/
        System.out.println("Punto 2:");

    UniversalSet superSet = new UniversalSet();
        superSet.add(1);
        superSet.add(2);
        superSet.add(3);
        superSet.add(4);
        superSet.add(5);

    StaticSet subset = new StaticSet();
        subset.add(1);
        subset.add(2);
        subset.add(3);

    // Verificar si subset es un subconjunto del superSet
        if (superSet.isSubset(subset)) {
        System.out.println("El conjunto es un subconjunto.");
    } else {
        System.out.println("El conjunto no es un subconjunto.");
    }

    // Calcular el complemento del subset respecto al superSet
        try {
        StaticSet complementSet = superSet.complement(subset);
        System.out.print("El complemento del subconjunto es: ");
        for (int i = 0; i < complementSet.getCount(); i++) {
            System.out.print(complementSet.getArray()[i] + " ");
        }
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
}
