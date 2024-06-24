package Ejercicio6;


import Ejercicio6.adt.Graph;

public class Main5 {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Añadir nodos al grafo
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);

        // Añadir aristas con probabilidades
        graph.addEdge(1, 2, 0.5);
        graph.addEdge(1, 3, 0.2);
        graph.addEdge(2, 3, 0.8);
        graph.addEdge(3, 4, 0.4);
        graph.addEdge(4, 1, 0.9);

        // Mostrar el grafo
        System.out.println("Grafo aleatorio con probabilidades:");
        System.out.println(graph);
    }
}

