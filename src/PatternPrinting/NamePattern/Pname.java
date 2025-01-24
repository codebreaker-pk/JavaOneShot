package PatternPrinting.NamePattern;

public class Pname {
    public static void main(String[] args) {

        // Define the size of the grid for the letter "P"
        final int GRID_SIZE = 5;

        // Iterate through each row of the grid
        for (int i = 0; i < GRID_SIZE; i++) {
            // Iterate through each column of the grid
            for (int j = 0; j < GRID_SIZE; j++) {
                // Conditions to print '*' or ' '
                // 1. Top row (i == 0)
                // 2. Middle row (i == 2)
                // 3. First column (j == 0) from row 1 onwards
                // 4. Last column (j == 4) from row 1 to row 2
                if ((i == 0) ||
                        (i == 2) ||
                        (j == 0 && i > 0) ||
                        (j == 4 && i > 0 && i < 3)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

    }
}