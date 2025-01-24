package TwoDimensionalArray;

import java.util.Scanner;

public class OutputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int m = arr.length; // no of row
        int n = arr[0].length; // how much length/line are in ) indeces which is basically no of column
        //arr[0][0] = 9;

        //input
        for (int i = 0; i < m; i++) { //  rows
            for (int j = 0; j < n; j++) { //  colm
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < m; i++) { // rows
            for (int j = 0; j < n; j++) { // colm
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
