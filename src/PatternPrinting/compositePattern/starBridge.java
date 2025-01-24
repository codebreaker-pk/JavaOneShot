package PatternPrinting.compositePattern;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*" + " "); // first line
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {  // print *
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*" + " ");

            }
            for (int j = 1; j <= nsp; j++) { // or j<= 2*i-1
                System.out.print(" " + " ");  // spaces

            }
            nsp += 2;
            for (int j = 1; j <= n + 1 - i; j++) { // number
                System.out.print("*" + " ");

            }
            System.out.println();

        }
    }
}
