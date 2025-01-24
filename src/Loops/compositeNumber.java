package Loops;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int a = 1; // it means prime
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // i is a factor of n
                System.out.println("Composite");
                a = 0;
                break;

            }
        }
        if (n == 1) System.out.println("Neither prime nor Composite");
        else if (a == 1) System.out.println("Prime");
    }
}
