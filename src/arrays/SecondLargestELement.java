package arrays;

public class SecondLargestELement {
    public static void main(String[] args) {
        int[] arr = {65, 67, 12, 34, 57, 90, 98};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
//            if (arr[i]>mx) mx = arr[i];
            mx = Math.max(mx, arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        //int smx = arr[0];  // if the element of array are same number
        for (int i = 0; i < n; i++) {

            //if (arr[i] > smx && arr[i] != mx) smx = arr[i];
            if (arr[i] != mx) {
                smx = Math.max(smx, arr[i]);

            }


        }
        System.out.println(mx);
        System.out.print(smx);

    }
}

