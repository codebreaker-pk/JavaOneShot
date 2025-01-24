package arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71, 76, 78, 81, 98, 100};
        int[] b = {36, 54, 69, 81};
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;


// merging method 1
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else { // arr[i]>=brr[j]
                c[k] = b[j];
                j++;
            }
            k++;

        }
        if (i == a.length) {// take element from  b only
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        if (j == b.length) { //now take elements only from a
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }

    }
}
