package transpose;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matris 1:");
        printMatrix(matris1);
        int[][] transpoze1 = transpose(matris1);
        System.out.println("Transpoze 1:");
        printMatrix(transpoze1);

        System.out.println("\nMatris 2:");
        printMatrix(matris2);
        int[][] transpoze2 = transpose(matris2);
        System.out.println("Transpoze 2:");
        printMatrix(transpoze2);
    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
