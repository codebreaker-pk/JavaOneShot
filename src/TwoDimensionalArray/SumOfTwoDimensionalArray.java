package TwoDimensionalArray;

public class SumOfTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{12, 25, 56}, {45, 65, 75}, {42, 76, 98}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}
