package arrays;

public class ArrayReverseUsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = {34, 54, 65, 23, 45, 78, 12};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        int i = 0, j = n - 1;
        //  int i = 1 , j = 4; // part of array reverse
        while (i <= j) {

            swap(arr, i, j);
//            int temp = arr[i];
//            arr[i]= arr[j];
//            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
