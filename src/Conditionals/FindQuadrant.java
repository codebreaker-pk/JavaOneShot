package Conditionals;

import java.util.Scanner;

public class FindQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x  co-ordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y co-ordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) System.out.println("At the origin");
        else if (x == 0 && y != 0) System.out.println("On the y -Axis");
        else if (x != 0 && y == 0) System.out.println("On the x -Axis");
        else if (x > 0 && y > 0) System.out.println("In the 1st quadrant");
        else if (x < 0 && y > 0) System.out.println("In the 2nd Quadrant");
        else if (x < 0 && y < 0) System.out.println("In the 3rd Quadrant");
        else System.out.println("In the 4th Quadrant");

    }
}
