package arrays;

public class mergeArrayOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71, 76, 78, 98, 100};
        int[] b = {36, 54, 69, 81};
        int[] c = new int[a.length + b.length];
        int i = a.length - 1, j = b.length - 1, k = a.length + b.length - 1;

        //method 2 --> merging
        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                c[k] = a[i];
                i--;
            } else { // (arr[i]<=b[j])
                c[k] = b[j];
                j--;
            }
            k--;

        }
        if (i == -1) {  // or if(i<0)

            while (j >= 0) {
                c[k] = b[j];
                j--;
                k--;
            }
        }
        if (j == -1) { // or if (j<0)
            while (i >= 0) {
                c[k] = a[i];
                i--;
                k--;
            }
        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }


    }
}
