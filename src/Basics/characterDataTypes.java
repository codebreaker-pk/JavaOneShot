package Basics;

public class characterDataTypes {
    public static void main(String[] args) {

        // We can intialize and declare character datatypes by using several methods

        //1. Direct Using the character literals enclosed within single quotes ''.

        char ch = 'A';
        System.out.println(ch);

        //2. using integer value

        char ch1 = 65; //ASCII decimal
        System.out.println(ch1);

        char ch2 = 0101; // Octal
        System.out.println(ch2);

        char ch3 = 0x41; // hexadecimal
        System.out.println(ch3);

        char ch4 = 0b1000001; // Binary
        System.out.println(ch4);

        //3. Using the Unicode Representation

        char ch5 = '\u0041';
        System.out.println(ch5);


    }
}


