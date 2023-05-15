package com.codecool.lotto;

import java.util.Scanner;

import static java.lang.System.out;

public class GetUserChoice {
    private static final Scanner scanner = new Scanner(System.in);

    public int getUserChoice(int min, int max) {
        int choice;
        do {
            out.println("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                out.println("Invalid input. Please enter a valid choice.");
                out.println("Enter your choice: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice < min || choice > max) {
                out.println("Choice must be between " + min + " and " + max + ".");
            }
        } while (choice < min || choice > max);
        return choice;
    }
}
