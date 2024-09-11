package sc2002labwork;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting value (S$): ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending value (S$): ");
        int end = scanner.nextInt();
        System.out.print("Enter the increment value (S$): ");
        int increment = scanner.nextInt();

        if (increment <= 0 || (start > end && increment > 0)) {
            System.out.println("Error input!!");
            return;
        }

        double conversionRate = 1.82;

        System.out.println("Table 1 (For Loop):");
        System.out.println("US$  S$");
        System.out.println("------------");
        for (int sgd = start; sgd <= end; sgd += increment) {
            double usd = sgd / conversionRate;
            System.out.printf("%-5d %.2f%n", sgd, usd);
        }

        System.out.println("\nTable 2 (While Loop):");
        System.out.println("US$  S$");
        System.out.println("------------");
        int current = start;
        while (current <= end) {
            double usd = current / conversionRate;
            System.out.printf("%-5d %.2f%n", current, usd);
            current += increment;
        }

        System.out.println("\nTable 3 (Do/While Loop):");
        System.out.println("US$  S$");
        System.out.println("------------");
        current = start;
        do {
            double usd = current / conversionRate;
            System.out.printf("%-5d %.2f%n", current, usd);
            current += increment;
        } while (current <= end);
    }
}