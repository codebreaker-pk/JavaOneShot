package PatternPrinting.Squares;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and Columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) { // rows --> no of lines
            for (int j = 1; j <= m; j++) { // columns --> How much in each line
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
