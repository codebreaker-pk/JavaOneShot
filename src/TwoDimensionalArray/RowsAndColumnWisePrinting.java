package TwoDimensionalArray;

public class RowsAndColumnWisePrinting {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int m = arr.length;
        int n = arr[0].length;

//        // ROWS WISE PRINTING
//        for (int i = 0; i < m; i++) { // rows
//            for (int j = 0; j < n; j++) { // colm
//                System.out.print(arr[i][j] +" ");
//            }
////            System.out.println();
//        }


//       // COLUMN WISE PRINTING
//
//        for (int j = 0; j < n; j++) { // col
//            for (int i = 0; i < m; i++) { // rows
//                System.out.print(arr[i][j] +" ");
//            }
//            System.out.println();
//        }

        // storing In new Matrix
        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
