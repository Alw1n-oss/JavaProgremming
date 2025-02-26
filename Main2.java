package ru.ez;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter two numbers (a and b), separated by a space:");

        double a = read.nextDouble();
        double b = read.nextDouble();

        double minimum = Math.min(a, b);
        double d = Math.pow(minimum, 8);

        System.out.println("The result (d) is: " + d);
    }
}
