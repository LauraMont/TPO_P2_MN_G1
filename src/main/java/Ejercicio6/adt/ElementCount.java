package Ejercicio6.adt;

public class ElementCount {
    private int value;
    private int count;

    public ElementCount(int value, int count) {
        this.value = value;
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "(" + value + ", " + count + ")";
    }
}
