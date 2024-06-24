package Ejercicio6.adt;

public class DoublyLinkedNode {
    private int value;
    private DoublyLinkedNode next;
    private DoublyLinkedNode prev;

    public DoublyLinkedNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public int getValue() {
        return value;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public DoublyLinkedNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode prev) {
        this.prev = prev;
    }
}
