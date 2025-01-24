package arrays;

public class sortZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int n = arr.length;
//        int noOfZeroes = 0;
//        // Two Pass method
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==0) noOfZeroes++;
//        }
//
//


////        for(int i = 0; i< noOfZeroes; i++){
////            arr[i]=0;
////        }
////        for (int i = noOfZeroes; i < n ; i++) {
////            arr[i] =1;
////        }


//
//        for (int i = 0; i < n ; i++) {
//            if (i<noOfZeroes) arr[i] =0;
//            else arr[i] =1;
//
//        }
//        for (int i = 0; i < n ; i++) {
//            System.out.print(arr[i] +" ");
//
//        }

        //one pass method
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            // if (i>j) break;  if cmts line remove then remove the first condition of (if) which is down
            if ((i < j) && arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
//                i++;    // no need
//                j++;    // no need
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
