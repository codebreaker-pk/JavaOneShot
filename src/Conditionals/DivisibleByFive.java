package Conditionals;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if (a % 5 == 0) System.out.println("Number Is divisibel by five");
        else System.out.println("Number is not divisible by five");
    }
}
