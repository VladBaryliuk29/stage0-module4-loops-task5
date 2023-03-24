package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void printLine(int length) {
        for (int x = 0; x < length; x++) {
            System.out.print(8);
        }
        if ( length > 0) {
            System.out.println();
        }
    }
    public static void printRectangleFrom8s(int length, int height){
            printLine(length);
            for (int y = 0; y < height - 2; y++) {
                for (int line = 0; line < length ; line++) {
                    if (line == 0 || line == length - 1) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            printLine(length);
    }

    public static void main(String[] args) {
        printRectangleFrom8s(5,6);
    }
}
