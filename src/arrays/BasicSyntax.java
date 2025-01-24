package arrays;

public class BasicSyntax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // initializing individual element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //output of array elements
        System.out.println(arr[4] + " ");
        //update
        arr[4] = 35;
        arr[4] += 10;
        System.out.println(arr[4]);


    }

}
