package Ejercicio6.adt;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<Integer, Node> nodes;  // Mapa de nodos con su valor como clave

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public void addNode(int value) {
        nodes.put(value, new Node(value, null));
    }

    public void addEdge(int from, int to, double probability) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode == null || toNode == null) {
            throw new IllegalArgumentException("Nodo no encontrado");
        }
        fromNode.addEdge(toNode, probability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node node : nodes.values()) {
            sb.append("Nodo ").append(node.getValue()).append(":\n");
            for (Map.Entry<Node, Double> entry : node.getEdges().entrySet()) {
                sb.append("  -> ").append(entry.getKey().getValue())
                        .append(" (Probabilidad: ").append(entry.getValue()).append(")\n");
            }
        }
        return sb.toString();
    }
}
