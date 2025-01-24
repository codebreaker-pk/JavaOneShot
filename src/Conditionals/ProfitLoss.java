package Conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling price : ");
        int sp = sc.nextInt();

        if (cp < sp) {
//            System.out.print("Profit is ");
//            System.out.println(sp-cp);
// you can also write in one line also
            System.out.print("Profit is " + (sp - cp));

        } else if (cp == sp) {
            System.out.println("No profit no gain");
        } else {
//            System.out.print("Loss is ");
//            System.out.println(cp-sp);
            System.out.print("loss is " + (cp - sp));
        }

    }
}
