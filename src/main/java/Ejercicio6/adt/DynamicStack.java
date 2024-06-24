package Ejercicio6.adt;

public class DynamicStack implements Stack {

    private Node first;
    private int size;
    private final int capacity;

    public DynamicStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero");
        }
        this.capacity = capacity;
        this.size = 0;
    }

    @Override
    public void add(int a) {
        if (size >= capacity) {
            throw new RuntimeException("La pila ha alcanzado su capacidad máxima");
        }
        this.first = new Node(a, this.first);
        size++;
    }

    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede desapilar una pila vacía");
        }
        this.first = this.first.getNext();
        size--;
    }

    @Override
    public int getTop() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede desapilar una pila vacía");
        }
        return this.first.getValue();
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
