package arrays;

public class arrayInitialise {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 55, 6, 7, 24, 678, 3, 6};
        int x = arr.length;
        System.out.println(x);
        // System.out.println(arr.length);
        for (int i = 0; i < x; i++) {  // or for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
