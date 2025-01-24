package Loops;

import java.util.Scanner;

public class SumTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum += ld; // or sum += (n%10) then remove the  above line
            n /= 10;

        }
        System.out.println(sum);

    }
}
