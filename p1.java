package sc2002labwork;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter char");
        char c = sc.next().charAt(0);

        switch(c)
        {
            case 'A','a':
                System.out.print("Action movie fan\n");
                break;
            case 'C','c':
                System.out.print("Comedy movie fan\n");
                break;
            case 'd','D':
                System.out.print("Drama movie fan\n");
                break;
            default:
                System.out.print("Invalid choice\n");
                break;
        }
    }
}