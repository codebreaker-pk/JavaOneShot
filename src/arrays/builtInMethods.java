package arrays;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {
        int[] arr = {40, 10, 5, 78, 45};
        //for loop
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+ " ");
//        }
        // for each loop
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        Arrays.sort(arr);
        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
