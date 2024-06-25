package Ejercicio5;

public class SetMontecarlo {
    private KeyNode first;
    private int count;
    private double xMin, xMax, yMin, yMax;

    public SetMontecarlo(double xMin, double xMax, double yMin, double yMax) {
        this.first=null;
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
    }
    public boolean add(Coordenada coord) {
        KeyNode current = this.first;
        if (coord.getX() >= xMin && coord.getX() <= xMax && coord.getY() >= yMin && coord.getY() <= yMax) {
            //conjunto vacio
            if(current == null) {
                this.first = new KeyNode(count++, null,coord);
                return true;
            }
            //hay al menos un elemento
            KeyNode aux = current.getNext();
            while(aux != null) {
                current = current.getNext();
                aux = aux.getNext();
            }
            current.setNext(new KeyNode(count++,null,coord));
            return true;
        }
        return false;
    }

    public Coordenada getCoordenadas(int key) {
        KeyNode current = this.first;
        while(current != null) {
            if(current.getKey() == key) {
                return current.getValues();
            }
            current = current.getNext();
        }
        throw new RuntimeException("No se encontro la clave");
    }
    public int size() {
        return count;
    }
}