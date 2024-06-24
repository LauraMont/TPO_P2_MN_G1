package Ejercicio6.adt;

public class UniversalSet extends StaticSet {

    @Override
    public void add(int a) {
        super.add(a);
    }

    @Override
    public void remove(int a) {
        super.remove(a);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int choose() {
        return super.choose();
    }

    // Método para verificar si un conjunto es subconjunto
    public boolean isSubset(StaticSet subset) {
        for (int i = 0; i < subset.getCount(); i++) {
            if (!this.contains(subset.getArray()[i])) {
                return false;
            }
        }
        return true;
    }

    // Método para calcular el complemento de un conjunto
    public StaticSet complement(StaticSet subset) {
        if (!isSubset(subset)) {
            throw new IllegalArgumentException("El conjunto dado no es un subconjunto del superconjunto");
        }

        StaticSet complementSet = new StaticSet();
        for (int i = 0; i < this.getCount(); i++) {
            if (!subset.contains(this.getArray()[i])) {
                complementSet.add(this.getArray()[i]);
            }
        }
        return complementSet;
    }
}
