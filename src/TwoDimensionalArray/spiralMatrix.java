package TwoDimensionalArray;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};
        int m = arr.length;
        int n = arr[0].length;
        int minInRows = 0, maxInRows = m - 1;
        int minIncol = 0, maxIncol = n - 1;

        while (minInRows <= maxInRows && minIncol <= maxIncol) {
            //left to right --> top side
            for (int j = minIncol; j <= maxIncol; j++) {
                System.out.print(arr[minInRows][j] + " ");
            }
            minInRows++;
            if (minInRows > maxInRows || minIncol > maxIncol) break;
            // Top to down ---> Right side
            for (int i = minInRows; i <= maxInRows; i++) {
                System.out.print(arr[i][maxIncol] + " ");
            }
            maxIncol--;
            if (minInRows > maxInRows || minIncol > maxIncol) break;

            // Right to left  ---> bottom side
            for (int j = maxIncol; j >= minIncol; j--) {
                System.out.print(arr[maxInRows][j] + " ");
            }
            maxInRows--;
            if (minInRows > maxInRows || minIncol > maxIncol) break;

            //Down to top ---> left side
            for (int i = maxInRows; i >= minInRows; i--) {
                System.out.print(arr[i][minIncol] + " ");
            }
            minIncol++;

        }
    }
}
