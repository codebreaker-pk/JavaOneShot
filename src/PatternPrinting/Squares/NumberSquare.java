package PatternPrinting.Squares;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:  ");
        int n = sc.nextInt();

//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1 ; j <= n ; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
//        }


        for (int i = 1; i <= 5; i++) {
            // Loop through the columns
            for (int j = 1; j <= n; j++) {
                // Print the number followed by a space
                System.out.print((i + j - 1) + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // output :
        //1 2 3 4 5
        //2 3 4 5 6
        //3 4 5 6 7
        //4 5 6 7 8
        //5 6 7 8 9


    }
}

