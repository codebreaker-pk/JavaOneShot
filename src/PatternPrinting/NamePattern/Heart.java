package PatternPrinting.NamePattern;

public class Heart {
    public static void main(String[] args) {

        // Iterate through each row
        for (double y = 1.5; y > -1.5; y -= 0.1) {
            // Iterate through each column
            for (double x = -1.5; x < 1.5; x += 0.05) {
                // Heart shape equation
                double a = x * x + y * y - 1;
                double b = x * x + y * y - 1;

                // Heart condition
                if ((x * x + y * y - 1) * (x * x + y * y - 1) * (x * x + y * y - 1) - x * x * y * y * y <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}