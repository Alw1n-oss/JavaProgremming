package ru.ez;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {

        int arraySize = 20;
        int[] mainArray = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            mainArray[i] = random.nextInt(100);
        }

        System.out.println("Main Array: " + Arrays.toString(mainArray));


        final int THRESHOLD = 30;

        int countLessThanThreshold = 0;
        for (int value : mainArray) {
            if (value < THRESHOLD) {
                countLessThanThreshold++;
            }
        }

        int[] valuesLessThan = new int[countLessThanThreshold];
        int[] indicesLessThan = new int[countLessThanThreshold];


        int currentIndex = 0;

        for (int i = 0; i < arraySize; i++) {
            if (mainArray[i] < THRESHOLD) {
                valuesLessThan[currentIndex] = mainArray[i];
                indicesLessThan[currentIndex] = i;
                currentIndex++;
            }
        }


        System.out.println("Values less than " + THRESHOLD + ": " + Arrays.toString(valuesLessThan));
        System.out.println("Indices of values less than " + THRESHOLD + ": " + Arrays.toString(indicesLessThan));
    }
}
