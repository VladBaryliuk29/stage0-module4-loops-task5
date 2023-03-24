package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printLine(int length, int middle) {
        for (int x = 0; x < length; x++) {
            if (x == middle) {
                System.out.print(8);
            } else {
                System.out.print(" ");
            }
        }
        if (length > 0) {
            System.out.println();
        }
    }
    public static void printFullLine(int sideLength) {
        for (int x = 0; x < sideLength; x++) {
            System.out.print(8);
        }
        if ( sideLength > 0) {
            System.out.println();
        }
    }
    public static void printCross(int sideLength){
        int middle = Math.round(sideLength / 2);
        for (int y = 0; y < sideLength; y ++) {
            if (y != middle) {
                printLine(sideLength, middle);
            } else {
                printFullLine(sideLength);
            }
        }
    }
}

