package Conditionals;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the Rectangle : ");
        int b = sc.nextInt();

        int area = l * b;
        int peri = 2 * (l + b);

        if (area > peri) System.out.println("greater");
        if (area < peri) System.out.println("not grater");
        if (area == peri) System.out.println("equal");
    }
}
