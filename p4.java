package sc2002labwork;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height: ");
        int height = scanner.nextInt();

        if (height <= 0) {
            System.out.println("Error input!!");
            return;
        }


        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("BB");
                } else {
                    System.out.print("AA");
                }
            }
            System.out.println(); 
        }
    }
}