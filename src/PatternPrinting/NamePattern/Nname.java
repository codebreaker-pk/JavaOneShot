package PatternPrinting.NamePattern;

public class Nname {
    public static void main(String[] args) {

        // Define the size of the grid for the letter "N"
        final int GRID_SIZE = 5;

        // Iterate through each row of the grid
        for (int i = 0; i < GRID_SIZE; i++) {
            // Iterate through each column of the grid
            for (int j = 0; j < GRID_SIZE; j++) {
                // Conditions to print '*' or ' ':
                // 1. First column (j == 0)
                // 2. Last column (j == GRID_SIZE - 1)
                // 3. Diagonal from top-left to bottom-right (j == i)
                if (j == 0 || j == GRID_SIZE - 1 || j == i) {
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
