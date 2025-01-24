package arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target Element: ");
        int x = sc.nextInt();
        System.out.print("Enter ArraySize: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Solution: --->
        boolean flag = false; // means element not found
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }

        }

        if (flag) System.out.print("Element found");
        else System.out.print("Elements not found ");

    }
}
