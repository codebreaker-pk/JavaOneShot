package arrays;

import java.util.Scanner;

public class rollNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 56, 87, 10, 31, 36, 47, 34};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 35) System.out.print(i + " ");

        }
    }
}
