package Ejercicio7;

import Ejercicio7.adt.Graph;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        System.out.println("Componentes fuertemente conexas:");
        g.printSCCs();
    }
}
