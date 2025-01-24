package arrays;

import java.util.ArrayList;

public class arrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(15);
        System.out.println(list + " " + list.size());
        list.add(19);
        System.out.println(list + " " + list.size());
        list.add(35);
        System.out.println(list + " " + list.size());
        list.add(37);
        System.out.println(list + " " + list.size());
        list.remove(1);
        System.out.println(list + " " + list.size());

    }
}
