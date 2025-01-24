package PatternPrinting.NamePattern;

public class Rname {
    public static void main(String[] args) {

        // Define the size of the grid for the letter "R"
        final int GRID_SIZE = 5;

        // Iterate through each row of the grid
        for (int i = 0; i < GRID_SIZE; i++) {
            // Iterate through each column of the grid
            for (int j = 0; j < GRID_SIZE; j++) {
                // Improved Conditions to print '*' or ' '
                // Upper vertical line
                if (
                        (i == 0 && j < 4) ||                 // Top horizontal bar
                                (i == 2 && j < 4) ||                 // Middle horizontal bar
                                (j == 4 && i == 1) ||                // Upper right vertical line
                                (i == j && i >= 3) ||                // Diagonal leg
                                (j == 0)                             // Vertical Spline
                ) {
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