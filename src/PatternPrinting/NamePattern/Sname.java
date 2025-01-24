package PatternPrinting.NamePattern;

public class Sname {
    public static void main(String[] args) {

        // Define the size of the grid for the letter "S"
        final int GRID_SIZE = 5;

        // Iterate through each row of the grid
        for (int i = 0; i < GRID_SIZE; i++) {
            // Iterate through each column of the grid
            for (int j = 0; j < GRID_SIZE; j++) {
                // Conditions to print '*' or ' '
                // 1. Top row (i == 0)
                // 2. Middle row (i == 2)
                // 3. Bottom row (i == 4)
                // 4. First column (j == 0) for rows 1
                // 5. Last column (j == 4) for rows 3
                if ((i == 0) ||
                        (i == 2) ||
                        (i == 4) ||
                        (j == 0 && i == 1) ||
                        (j == 4 && i == 3)) {
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