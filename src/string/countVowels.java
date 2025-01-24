package string;

import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isVowels(ch)) count++;
        }
        System.out.print(count);

    }

    public static boolean isVowels(char ch) {

        if (ch == 'a' | ch == 'A') return true;
        if (ch == 'e' | ch == 'E') return true;
        if (ch == 'i' | ch == 'I') return true;
        if (ch == 'o' | ch == 'O') return true;
        return ch == 'u' | ch == 'U';
    }
}
