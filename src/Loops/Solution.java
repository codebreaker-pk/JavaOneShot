package Loops;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a + b;
            System.out.print(sum + " ");
            for (int j = 1; j < c; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();


        }

        sc.close();
    }
}