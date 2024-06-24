package Ejercicio6.adt;

import java.util.Objects;

public class DynamicCircularDeque implements Queue {

    private DoublyLinkedNode first;
    private DoublyLinkedNode last;
    private int size;

    public DynamicCircularDeque() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public void add(int a) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(a);
        if (isEmpty()) {
            this.first = newNode;
            this.last = newNode;
            this.first.setNext(this.last);
            this.first.setPrev(this.last);
            this.last.setNext(this.first);
            this.last.setPrev(this.first);
        } else {
            newNode.setPrev(this.last);
            newNode.setNext(this.first);
            this.last.setNext(newNode);
            this.first.setPrev(newNode);
            this.last = newNode;
        }
        size++;
    }

    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede eliminar de una cola vacía");
        }

        if (this.size == 1) {
            this.first = null;
            this.last = null;
        } else {
            DoublyLinkedNode newFirst = this.first.getNext();
            this.last.setNext(newFirst);
            newFirst.setPrev(this.last);
            this.first = newFirst;
        }
        size--;
    }

    @Override
    public int getFirst() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede obtener el primer elemento de una cola vacía");
        }
        return this.first.getValue();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public int getLast() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede obtener el último elemento de una cola vacía");
        }
        return this.last.getValue();
    }

    public int getSize() {
        return this.size;
    }
}
