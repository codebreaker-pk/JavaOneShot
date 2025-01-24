package Loops;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // Gp Series = 2,4,8,16,32,,,
        int a = 2; // first term
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= 2; // because in series... Multiply by 2 in the  GP series

        }

    }
}
