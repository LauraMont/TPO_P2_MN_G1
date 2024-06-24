package Ejercicio7.adt;

import java.util.*;

public class Graph {
    private int vertices; // Número de vértices
    private LinkedList<Integer> adj[]; // Lista de adyacencias

    // Constructor
    public Graph(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // Método para agregar una arista al grafo
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Método recursivo para realizar DFS
    private void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        int n;

        // Recurre para todos los vértices adyacentes a este vértice
        Iterator<Integer> i = adj[v].iterator();
        while (i.hasNext()) {
            n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // Función que devuelve el grafo transpuesto
    private Graph getTranspose() {
        Graph g = new Graph(vertices);
        for (int v = 0; v < vertices; v++) {
            // Recurre a todos los vértices adyacentes a este vértice
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext())
                g.adj[i.next()].add(v);
        }
        return g;
    }

    private void fillOrder(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;

        Iterator<Integer> i = adj[v].iterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                fillOrder(n, visited, stack);
        }

        stack.push(v);
    }

    public void printSCCs() {
        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[vertices];
        for (int i = 0; i < vertices; i++)
            visited[i] = false;

        for (int i = 0; i < vertices; i++)
            if (!visited[i])
                fillOrder(i, visited, stack);

        Graph gr = getTranspose();

        for (int i = 0; i < vertices; i++)
            visited[i] = false;

        while (!stack.empty()) {
            int v = stack.pop();

            if (!visited[v]) {
                gr.DFSUtil(v, visited);
                System.out.println();
            }
        }
    }
}
