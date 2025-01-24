package Loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Method 1st
        //Ap series = 1,3,5,7,9....
//        for (int i = 1;i<=2*n-1;i+=2){
//            System.out.println(i);
//        }
        // Ap series = 3,6,9,12,15....
        int a = 3, d = 3;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a += d; // if d not declare then we can write a += 3;
        }

    }
}
