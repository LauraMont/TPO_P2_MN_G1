package Ejercicio5;
public class KeyNode {

    private int key;
    private KeyNode next;
    private Coordenada values;

    public KeyNode(int key, KeyNode next, Coordenada values) {
        this.key = key;
        this.next = next;
        this.values = values;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public KeyNode getNext() {
        return next;
    }

    public void setNext(KeyNode next) {
        this.next = next;
    }

    public Coordenada getValues() {
        return values;
    }

    public void setValues(Coordenada values) {
        this.values = values;
    }
}
