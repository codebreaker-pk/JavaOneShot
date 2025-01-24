package arrays;

import java.util.ArrayList;

public class basicOfArrayList {
    public static void main(String[] args) {
//        int [] arr = { 23,54,12,16,34};
//        double[] brr = {23.4,56.5,7.5,67.9,76.2};
//        char[] crr = {'a','d','f','s','e','r'};

        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);

        System.out.println(arr.size());

//        for(int i = 0; i < arr.size(); i++){
//            System.out.print(arr.get(i) + " ");
//        }

        // or

        System.out.println(arr);
        arr.set(0, 100); // update r modify the index value of 0
        System.out.println(arr);
        arr.add(70); // push element in the end of the arraylist
        System.out.println(arr.size());
        System.out.println(arr);

    }
}
