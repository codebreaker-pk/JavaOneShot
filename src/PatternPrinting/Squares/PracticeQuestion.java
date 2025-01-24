package PatternPrinting.Squares;


import java.util.Scanner;

//1 2 3 4 5 6 7
//2 3 4 5 6 7 1
//3 4 5 6 7 1 2
//4 5 6 7 1 2 3
//5 6 7 1 2 3 4
//6 7 1 2 3 4 5
//7 1 2 3 4 5 6
public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i+ " ");
//        }
        //  System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((i + j - 1) + " ");
            }
//
            for (int j = 1; j < i; j++) {
                System.out.print((j) + " ");

            }
            System.out.println();

        }
    }


}
