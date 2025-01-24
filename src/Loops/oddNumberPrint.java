package Loops;

public class oddNumberPrint {
    public static void main(String[] args) {
        //100 round
//        for(int i = 1; i<= 100; i++){
//            if (i%2!=0) System.out.print(i+" ");
//        }

        //50 round
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
