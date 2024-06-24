package Ejercicio6.adt;


import java.util.Random;

public class StaticSet implements Set {

    private static final int MAX = 10000;

    protected int[] array;
    protected int count;

    public StaticSet() {
        this.array = new int[MAX];
        this.count = 0;
    }

    @Override
    public void add(int a) {
        if (count == MAX) {
            throw new RuntimeException("Limite de elementos alcanzado");
        }
        for (int i = 0; i < count; i++) {
            if (this.array[i] == a) {
                return;
            }
        }
        this.array[count] = a;
        this.count++;
    }

    @Override
    public void remove(int a) {
        for (int i = 0; i < count; i++) {
            if (this.array[i] == a) {
                this.array[i] = this.array[count - 1];
                count--;
                return;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int choose() {
        if (this.count == 0) {
            throw new RuntimeException("No se puede elegir un valor de un conjunto vacio");
        }
        return this.array[new Random().nextInt(this.count)];
    }

    // Métodos auxiliares para obtener el array y el count
    public int[] getArray() {
        return this.array;
    }

    public int getCount() {
        return this.count;
    }

    // Método auxiliar para verificar si el conjunto contiene un elemento
    public boolean contains(int value) {
        for (int i = 0; i < this.count; i++) {
            if (this.array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
