package Loops;

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for(int i =19; i<=190 ;i++){
//
//            if (i%19==0)System.out.println(i);
//        }
//    }
//}
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
//        for(int i = 1;i<=10 ; i++){
//            System.out.println(n*i);
//        }
        for (int i = n; i <= n * 10; i += n) {    //  for (int i = 19; i<=190 ; i+=19 )
            System.out.println(i);
        }
    }
}




