package arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 3};
        int x = 9;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
//                    System.out.println(i+" "+ j); // for indeces
                }

            }

        }
    }
}
