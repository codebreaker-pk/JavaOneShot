package arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {34, 54, 31, 76, 89, 65, 90};
        int k = 2;
        int n = arr.length;
        k = k % n;
        int[] nums = new int[n];

        System.arraycopy(arr, n - k, nums, 0, k);
        System.arraycopy(arr, 0, nums, k, n - k);
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}
