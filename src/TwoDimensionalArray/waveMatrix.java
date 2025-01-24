package TwoDimensionalArray;

public class waveMatrix {
    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length, n = arr[0].length;
        print(arr);

//        //wave matric -->  rows wise ...>>> 1 2 3 6 5 4 7 8 9
//        for (int i = 0; i < m; i++) {
//            if(i%2==0){
//                for (int j = 0; j < n; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }
//            else {
//                for (int j = n - 1; j >= 0; j--) {
//                    System.out.print(arr[i][j] + " ");
//
//                }
//                System.out.println();
//
//            }
//        }


//        //wave matric -->  row wise ...>>> 3 2 1 4 5 6 9 8 7
//        for (int i = 0; i < m; i++) {
//            if(i%2!=0){
//                for (int j = 0; j < n; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }
//            else {
//                for (int j = n - 1; j >= 0; j--) {
//                    System.out.print(arr[i][j] + " ");
//
//                }
//                System.out.println();
//
//            }
//        }


        //wave matric -->  column wise ...>>> 1 4 7 8 5 2 3 6 9
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();

            }
        }


        System.out.println();
    }
}

