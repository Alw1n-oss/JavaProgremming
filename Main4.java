package ru.ez;

import java.util.Arrays;
import java.util.Random;

public class Main4 {

    public static void main(String[] args) {

        int numRows = 3;
        int numCols = 3;

        int[][] matrix = new int[numRows][numCols];

        Random random = new Random();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < numRows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


        int[] vectorB = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            int minVal = matrix[i][0];

            for (int j = 1; j < numCols; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }

            vectorB[i] = minVal;
        }


        System.out.println("\nVector B (minimum value in each row): " + Arrays.toString(vectorB));
    }
}