package arrays;

import java.util.Arrays;

public class copyOfArrays {
    public static void main(String[] args) {
        int[] arr = {23, 43, 12, 54, 26, 98, 56};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // SHALLOW COPY
        int[] nums = arr; // shallow copy
//        for(int ele : nums){
//            System.out.print(ele +" ");
//        }
        nums[0] = 12;
        System.out.println(arr[0]);

        // Deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 45;
        System.out.println(arr[0]);


        // deep copy second method:
        int[] crr = new int[arr.length];
        System.arraycopy(arr, 0, crr, 0, arr.length);
        crr[0] = 16;
        for (int ele : crr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println(arr[0]);


    }

}
