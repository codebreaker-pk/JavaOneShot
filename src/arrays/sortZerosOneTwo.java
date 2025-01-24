package arrays;

public class sortZerosOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2, 0};
        int n = arr.length;
//        int noOfZeros = 0;
//        int noOfOnes = 0;
//
//        for (int i= 0; i< n; i++){
//            if(arr[i]==0) noOfZeros++;
//            if(arr[i]==1) noOfOnes ++;
//
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (i<noOfZeros) arr[i] =0;
//            else if (i < noOfZeros + noOfOnes) arr[i]= 1;
//            else arr[i] =2;
//
//        }

        //method 2 ---> Dutch Flag Algorithms
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) mid++;
            else { // arr[mid]==2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }
        for (int ele : arr) {
            System.out.print(ele + " ");

        }

    }
}
