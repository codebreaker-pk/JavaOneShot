package arrays;

//public class MaxInArray {
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.print("Enter Array Size: ");
//        int n = sc.nextInt();
//        int [] arr = new int [n];
//        System.out.print("Enter Array Elements: ");
//
//        for(int i = 0; i < n; i++){
//            arr[i]= sc.nextInt();
//        }
//
//        int mx = arr[0];
//        for (int i = 1; i < n ; i++) {
//            if (arr[i]> mx) mx = arr[i];
//        }
//
//        System.out.print(mx);
//    }
//}


public class MaxInArray {
    public static void main(String[] args) {

        int[] arr = {23, 45, 67, 89, 98, 97, 5, 6, 7, 89, 988, 33, 12};
        int x = arr.length;
        //  int mx = arr[0];
        int mx = Integer.MIN_VALUE;
//        System.out.println(mx);
        for (int i = 0; i < x; i++) {
//            if (arr[i]>mx) mx= arr[i];
            //or
            mx = Math.max(mx, arr[i]);
        }
        System.out.print(mx);

    }
}