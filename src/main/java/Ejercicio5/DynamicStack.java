package Ejercicio5;
import java.util.Objects;

public class DynamicStack {

    private Node first;

    public void add(int a) {
        this.first = new Node(a, this.first);
    }

    public void remove() {
        if(this.isEmpty()) {
            throw new RuntimeException("No se puede desapilar una pila vacia");
        }
        this.first = this.first.getNext();
    }

    public int getTop() {
        if(this.isEmpty()) {
            throw new RuntimeException("No se puede desapilar una pila vacia");
        }
        return this.first.getValue();
    }

    public boolean isEmpty() {
        return Objects.isNull(this.first);
    }
}

