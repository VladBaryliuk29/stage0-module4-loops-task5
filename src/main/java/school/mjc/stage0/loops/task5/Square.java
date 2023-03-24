package school.mjc.stage0.loops.task5;

public class Square {
    public static void printLine(int sideLength) {
        for (int x = 0; x < sideLength; x++) {
            System.out.print(8);
        }
        if ( sideLength > 0) {
            System.out.println();
        }
    }
    public static void printSquareFrom8s(int sideLength){
        printLine(sideLength);
        for (int y = 0; y < sideLength - 2; y++) {
            for (int line = 0; line < sideLength; line++) {
                if (line == 0 || line == sideLength - 1) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        printLine(sideLength);
    }
}
