package Conditionals;

import java.util.Scanner;

public class NestedGreatestThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) System.out.println(a + " is greatest");
            else  // c>a>b
                System.out.println(c + "is greatest");
        } else { //b >a
            if (b > c) System.out.println(b + "is greatest");
            else //c>b>a
                System.out.println(c + "is greatest");
        }
    }
}
