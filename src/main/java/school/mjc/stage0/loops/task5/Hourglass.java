package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printSpaces(int spaces) {
        for (int x = 0; x < spaces; x++) {
            System.out.print(" ");
        }
    }
    public static void printLine(int sideLength, int ignoring) {
        printSpaces(ignoring);
        for (int x = 0; x < sideLength - 2 * ignoring; x ++) {
            System.out.print(8);
        }
        printSpaces(ignoring);
        if ( sideLength > 0) {
            System.out.println();
        }
    }
    public static void printHourglassOfGivenSize(int height) {
        if (height > 0) {
            for (int y = 0; y < Math.round(height / 2); y++) {
                printLine(height, y);
            }
            if (height % 2 == 1) {
                printLine(height, Math.round(height / 2));
            }
            for (int y = Math.round(height / 2) - 1; y > 0; y--) {
                printLine(height, y);
            }
            for (int i = 0; i < height; i++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
