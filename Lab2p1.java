package Lab2;

import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: mulTest();
                    break;
                case 2: 
                    System.out.print("Enter m: ");
                    int m = sc.nextInt();
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.println(m + "/" + n + " = " + divide(m, n));
                    break;
                case 3: 
                    System.out.print("Enter m: ");
                    m = sc.nextInt();
                    System.out.print("Enter n: ");
                    n = sc.nextInt();
                    System.out.println(m + " % " + n + " = " + modulus(m, n));
                    break;
                case 4: 
                    System.out.print("Enter n: ");
                    int num = sc.nextInt();
                    System.out.println("n : " + num + " - count = " + countDigits(num));
                    break;
                case 5: 
                    System.out.print("Enter n: ");
                    num = sc.nextInt();
                    System.out.print("Enter digit: ");
                    int digit = sc.nextInt();
                    System.out.println("position = " + position(num, digit));
                    break;
                case 6: 
                    System.out.print("Enter n: ");
                    long longNum = sc.nextLong();
                    System.out.println("oddDigits = " + extractOddDigits(longNum));
                    break; 
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }

    public static void mulTest() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int correctAnswers = 0;
        
        for (int i = 0; i < 5; i++) {
            int num1 = rand.nextInt(9) + 1;
            int num2 = rand.nextInt(9) + 1;
            System.out.print("How much is " + num1 + " times " + num2 + "? ");
            int answer = sc.nextInt();
            if (answer == num1 * num2) {
                correctAnswers++;
            }
        }
        
        System.out.println(correctAnswers + " answers out of 5 are correct.");
    }

    public static int divide(int m, int n) {
        int quotient = 0;
        while (m >= n) {
            m -= n;
            quotient++;
        }
        return quotient;
    }

    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    public static int countDigits(int n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return 0;
        }
        if (n == 0) return 1;
        return (int) Math.log10(n) + 1;
    }

    public static int position(int n, int digit) {
        int pos = 1;
        while (n > 0) {
            if (n % 10 == digit) return pos;
            n /= 10;
            pos++;
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return -1;
        }
        long result = 0;
        long multiplier = 1;
        boolean hasOddDigit = false;
        
        while (n > 0) {
            long digit = n % 10;
            if (digit % 2 != 0) {
                result += digit * multiplier;
                multiplier *= 10;
                hasOddDigit = true;
            }
            n /= 10;
        }
        
        return hasOddDigit ? result : -1;
    }
}