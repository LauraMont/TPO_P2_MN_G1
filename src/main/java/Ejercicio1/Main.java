package Ejercicio1;

import Ejercicio1.datastructures.QueueOfStacks;
import Ejercicio1.utils.MatrixOperations;

public class Main {
    public static void main(String[] args) {
        // Creación de una matriz 3x3
        QueueOfStacks matrix = new QueueOfStacks(3);
        matrix.push(0, 1); matrix.push(0, 2); matrix.push(0, 3);
        matrix.push(1, 4); matrix.push(1, 5); matrix.push(1, 6);
        matrix.push(2, 7); matrix.push(2, 8); matrix.push(2, 9);

        // Calculando la traza de la matriz
        int trace = MatrixOperations.trace(matrix);
        System.out.println("Traza de la matriz: " + trace);

        // Obteniendo la traspuesta de la matriz
        QueueOfStacks transposed = MatrixOperations.transpose(matrix);
        System.out.println("Matriz Traspuesta:");
        printMatrix(transposed);


        // Sumando dos matrices
        QueueOfStacks matrix2 = new QueueOfStacks(3);
        matrix2.push(0, 9); matrix2.push(0, 8); matrix2.push(0, 7);
        matrix2.push(1, 6); matrix2.push(1, 5); matrix2.push(1, 4);
        matrix2.push(2, 3); matrix2.push(2, 2); matrix2.push(2, 1);

        QueueOfStacks sumMatrix = MatrixOperations.add(matrix, matrix2);
        System.out.println("Suma de Matrices:");
        printMatrix(sumMatrix);

    }

    private static void printMatrix(QueueOfStacks matrix) {
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                System.out.print(matrix.get(i, j) + " ");
            }
            System.out.println();
        }
    }
}
