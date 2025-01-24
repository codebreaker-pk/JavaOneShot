package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int i = 0; i < n / 2; i++) {
            // int j = n-1-i; { here i+j= n-1 means  i at first index[0] and j at last index[6] where n = 7}
            int temp = arr[i];
            arr[i] = arr[n - 1 - i]; //j
            arr[n - 1 - i] = temp; //j
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}


//public class reverseArray {
//    public static void main(String[] args) {
//        // Initialize the array and the rotation amount
//        int[] nums = {10, 20, 30, 40, 50, 60, 70};
//        int k = 3;
//
//        // Call the rotate method to perform the rotation
//        rotate(nums, k);
//
//        // Print the rotated array
//        for (int ele : nums) {
//            System.out.print(ele + " ");
//        }
//    }
//
//    // Method to swap elements at two indices in the array
//    public static void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//
//    // Method to reverse a portion of the array from index i to j
//    public static void reverse(int[] nums, int i, int j) {
//        while (i <= j) {
//            swap(nums, i, j);
//            i++;
//            j--;
//        }
//    }
//
//    // Method to rotate the array by k positions to the right
//    public static void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k = k % n; // Ensure k is within bounds
//
//        // Reverse the first n - k elements
//        reverse(nums, 0, n - k - 1);
//
//        // Reverse the last k elements
//        reverse(nums, n - k, n - 1);
//
//        // Reverse the entire array
//        reverse(nums, 0, n - 1);
//    }
//}
