package Ejercicio3;

import java.util.Arrays;

public class Queue implements IQueue{

    private int[] array;

    private int count;

    private final int MAX = 10;

    public Queue(){

        array = new int[MAX];
        count = 0;

    }

    @Override
    public void add(int a) {

        if(count == MAX) {
            throw new RuntimeException("Límite de cola excedido.");
        }

        array[count] = a;
        count++;

    }

    @Override
    public void remove() {

        if(isEmpty()) {
            throw new RuntimeException("La cola no tiene elementos.");
        }
        for(int i = 0; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;

    }

    @Override
    public boolean isEmpty() {

        return count == 0;

    }

    @Override
    public int getFirst() {

        if(isEmpty()) {
            throw new RuntimeException("La cola no tiene elementos.");
        }
        return array[0];

    }

    public void reverseQueue(){
        if(!isEmpty()){
            int num = getFirst();
            remove();
            reverseQueue();
            add(num);
        }
    }

    @Override
    public String toString() {
        return "Queue{" + Arrays.toString(array) + '}';
    }
}
