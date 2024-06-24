package Ejercicio6.adt;


public class Edge {
    private Node from;
    private Node to;
    private double probability;

    public Edge(Node from, Node to, double probability) {
        this.from = from;
        this.to = to;
        this.probability = probability;
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    public double getProbability() {
        return probability;
    }

    @Override
    public String toString() {
        return from + " -> " + to + " [Probabilidad: " + probability + "]";
    }
}
