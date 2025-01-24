package PatternPrinting.compositePattern;

import java.util.Scanner;

public class starPyramidNstNsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n: ");
        int n = sc.nextInt();
        int nsp = n - 1; // no of space
        int nst = 1; //no of star
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }

    }
}
