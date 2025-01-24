package PatternPrinting.NamePattern;

public class Iname {
    public static void main(String[] args) {

        // Define the size of the grid for the letter "I"
        final int GRID_SIZE = 5;

        // Iterate through each row of the grid
        for (int i = 0; i < GRID_SIZE; i++) {
            // Iterate through each column of the grid
            for (int j = 0; j < GRID_SIZE; j++) {
                // Conditions to print '*' or ' '
                // 1. First row (i == 0)
                // 2. Last row (i == GRID_SIZE - 1)
                // 3. Middle column (j == GRID_SIZE / 2)
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