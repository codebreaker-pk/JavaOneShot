package arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 56, 7, 76, 32, 56, 67, 89, 5, 3};
        int x = arr.length;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
