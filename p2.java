package sc2002labwork;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your salary and merit points");

        while (sc.hasNext()) {
            int salary = sc.nextInt();
            int merit = sc.nextInt();

            if (salary >= 500 && salary < 600)
                System.out.print("Grade C\n");
            else if (salary >= 600 && salary <= 649) {
                if (merit < 10)
                    System.out.print("Grade C\n");
                else
                    System.out.print("Grade B\n");
            } else if (salary > 649 && salary < 700)
                System.out.print("Grade B\n");
            else if (salary >= 700 && salary <= 799) {
                if (merit < 20)
                    System.out.print("Grade B\n");
                else
                    System.out.print("Grade A\n");
            } else
                System.out.print("Grade A\n");
        }
    }
}