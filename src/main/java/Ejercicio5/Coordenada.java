package Ejercicio5;

public class Coordenada {
    private double x;
    private double y;

    // Constructor
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Método para representar la coordenada como una cadena
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Método para verificar si dos coordenadas son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Coordenada that = (Coordenada) obj;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0;
    }
}
