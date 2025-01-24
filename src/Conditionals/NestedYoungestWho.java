package Conditionals;

import java.util.Scanner;

public class NestedYoungestWho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter The Age Of Ram : ");
        int ramAge = sc.nextInt();
        System.out.print(" Enter The Age Of Shyam : ");
        int shyamAge = sc.nextInt();
        System.out.print(" Enter The Age Of Ajay : ");
        int ajayAge = sc.nextInt();

        if (ramAge < shyamAge) {
            if (ramAge < ajayAge) System.out.println("ram is youngest");
            else //ajayAge<ramAge<shyamAge
                System.out.println("Ajay is Youngest");
        } else // shyamAge<ramAge
        {
            if (shyamAge < ajayAge) System.out.println("Shyam is youngest");
            else // ajayAge<shyamAge <ramAge
                System.out.println("Ajay is youngest");
        }


    }
}
