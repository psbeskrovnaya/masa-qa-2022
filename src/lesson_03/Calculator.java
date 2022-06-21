package src.lesson_03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double result;

        System.out.println("Type first number");
        x = scanner.nextDouble();
        System.out.println("Type second number");
        y = scanner.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
