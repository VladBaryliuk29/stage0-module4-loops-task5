package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printLine(int sideLength) {
        for (int x = 0; x < sideLength; x++) {
            System.out.print(8);
        }
        if ( sideLength > 0) {
            System.out.println();
        }
    }
    public static void printTriangle(int cathetusLength) {
        for (int y = 0; y <= cathetusLength; y++) {
            printLine(y);
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
