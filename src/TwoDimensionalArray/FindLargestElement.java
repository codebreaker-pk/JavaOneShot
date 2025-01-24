package TwoDimensionalArray;

public class FindLargestElement {
    public static void main(String[] args) {
        int[][] arr = {{12, 25, 56}, {45, 65, 75}, {42, 76, 98}};
        int m = arr.length;
        int n = arr[0].length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // if(arr[i][j]>mx) mx=arr[i][j];
                //or
                mx = Math.max(mx, arr[i][j]);
            }
        }
        System.out.print(mx);
    }
}
