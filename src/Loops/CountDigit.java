package Loops;

public class CountDigit {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number :");
//        int n = sc.nextInt();
//        int count = 0;
//        while (n!=0) {
//            n/=10;
//            count++;
//        }
//        System.out.println(count);


        int n = 10; // Number of Fibonacci numbers to generate
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }


    }
}
