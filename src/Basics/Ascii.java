package Basics;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);
//      int x = (int)ch; //1st method of type casting
//      System.out.println(x);
        System.out.println((int) ch);  // Another method of type casting


    }
}
