package arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;

        // Method 1---> Brute force

        for (int i = 0; i < n - 1; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                mx = Math.max(mx, arr[j]);
            }
            res[i] = mx;
        }

        // Method 2 --> Optimised

//        int cmax =arr[n-1]; // current max
//        for (int i = n-2; i >=0 ; i--) {
//            res[i] = cmax;
//            cmax = Math.max(cmax,arr[i]);
//
//        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : res) {
            System.out.print(ele + " ");
        }


    }
}
