package TwoDimensionalArray;

public class forEach {
    public static void main(String[] args) {
        int[] a = {4, 3, 6, 9, 3};
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();


        int[][] b = {{1234, 56, 456}, {4456, 23, 544}, {3456, 12, 556}};
        int m = b.length;
        int n = b[0].length;

        // normal loop method output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        // for each method output
//        for(int [] ele : b){
//            for(int x : ele){
//                System.out.print(x +" ");
//            }
//            System.out.println();
//        }
    }
}
