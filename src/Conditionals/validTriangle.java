package Conditionals;

import java.util.Scanner;

public class validTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first side : ");
        int a = sc.nextInt();
        System.out.print("Enter a second side : ");
        int b = sc.nextInt();
        System.out.print("Enter a third side : ");
        int c = sc.nextInt();

        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("Valid Triangle");
        } else System.out.println("Invalid Triangle");

    }
}
