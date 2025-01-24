package PatternPrinting.NamePattern;

public class Pari {
    public static void main(String[] args) {

        // Define the size of the grid for each letter
        final int GRID_SIZE = 5;

        // Iterate through each row of the grid
        for (int i = 0; i < GRID_SIZE; i++) {
            // Print the "P" pattern
            for (int j = 0; j < GRID_SIZE; j++) {
                if (
                        (i == 0) ||                             // Top horizontal bar
                                (i == 2) ||                             // Middle horizontal bar
                                (j == 0 && i > 0) ||          // Left vertical bar (excluding the last row)
                                (j == 4 && i > 0 && i < 3)
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Add space between letters
            System.out.print("  "); // Two spaces for separation

            // Print the "A" pattern
            for (int j = 0; j < GRID_SIZE; j++) {
                if (
                        (i == 0 && j > 0 && j < GRID_SIZE - 1) ||  // Top horizontal bar of "A"
                                (j == 0 || j == GRID_SIZE - 1) && i > 0 || // Left and right diagonal lines
                                (i == 2)                                    // Middle horizontal bar
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Add space between letters
            System.out.print("  "); // Two spaces for separation

            // Print the "R" pattern
            for (int j = 0; j < GRID_SIZE; j++) {
                if (
                        (i == 0 && j < 4) ||                 // Top horizontal bar
                                (i == 2 && j < 4) ||                 // Middle horizontal bar
                                (j == 4 && i == 1) ||                // Upper right vertical line
                                (i == j && i >= 3) ||                // Diagonal leg
                                (j == 0)                             // Vertical spline
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Add space between letters
            System.out.print("  "); // Two spaces for separation

            // Print the "I" pattern
            for (int j = 0; j < GRID_SIZE; j++) {
                if (i == 0 || i == GRID_SIZE - 1 || j == GRID_SIZE / 2) {
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