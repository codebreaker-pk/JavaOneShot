package arrays;

public class passingArraysToMethods {
    public static void main(String[] args) {
        int[] arr = {12, 25, 46, 75};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] y) {
        y[0] = 10;
    }

}
