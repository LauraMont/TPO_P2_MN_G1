package Ejercicio6.adt;

import java.util.HashMap;
import java.util.Map;

public class Node {

    private int value;
    private Node next;
    private Map<Node, Double> edges;  // Mapa de aristas con probabilidades

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
        this.edges = new HashMap<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Map<Node, Double> getEdges() {
        return edges;
    }

    public void addEdge(Node node, double probability) {
        edges.put(node, probability);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
