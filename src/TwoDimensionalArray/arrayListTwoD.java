package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class arrayListTwoD {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);
        b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        d.add(70);
        d.add(80);
        d.add(90);


        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);

//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//        }

        System.out.println(l.get(0)); // print whole row
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        System.out.println(l.get(0).get(0));  //output 10
        System.out.println(l.get(0).get(1));  //output 20
        System.out.println(l.get(0).get(2));  //output 30


        for (int i = 0; i < l.size(); i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();

        }
    }
}
