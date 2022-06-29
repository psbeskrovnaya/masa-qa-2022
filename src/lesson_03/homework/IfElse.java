package src.lesson_03.homework;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner tarakan = new Scanner(System.in);

        String login = "Roman";
        String password = "PuPoChEk";

        System.out.println("Enter login:");
        String input = tarakan.nextLine();

        if (input.equals(login)) {
            System.out.println("Enter password:");
            String pass = tarakan.nextLine();

            if (pass.equals(password)) {
                System.out.println("Hello, " + login + " You are logged in.");
            } else {
                System.out.println("Incorrect password");
            }

        } else {
            System.out.println("Only Roman exists");
        }

        tarakan.close();

    }
}
