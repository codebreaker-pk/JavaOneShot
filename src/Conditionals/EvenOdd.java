package Conditionals;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = sc.nextInt();

        if (a % 2 == 0) System.out.println("The nuumber is even ");
            // if (a%2==1) System.out.println("The number is Odd");
            //  if (a%2 != 0) System.out.println("The number is odd");

        else System.out.println("The number is odd ");

    }
}
