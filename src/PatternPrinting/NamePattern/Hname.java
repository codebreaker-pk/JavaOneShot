package PatternPrinting.NamePattern;

public class Hname {
    public static void main(String[] args) {

        int GRID_SIZE = 5;

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j == 0 || j == GRID_SIZE - 1 || i == GRID_SIZE / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
