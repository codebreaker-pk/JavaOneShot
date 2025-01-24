package Conditionals;

import java.util.Scanner;

public class AbsoluteValue { // Absolute Value which is ...if number are +ve print same number if number are -ve remove -ve symbol and print same number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number : ");
        int a = sc.nextInt();

        if (a < 0) System.out.println(-a);
        else System.out.println(a);
    }
}
