
// Online IDE - Code Editor, Compiler, Interpreter

public class Main {
    public static void main(String[] args) {
        double centimeters = 300.5;
        int wholeMeters = (int) (centimeters / 100);
        double remainingCm = centimeters % 100;

        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCm);

        int baseInt = 42;
        double widenedDouble = baseInt;
        System.out.println("Widened Double: " + widenedDouble);

        double preciseDouble = 99.75;
        int narrowedInt = (int) preciseDouble;
        System.out.println("Narrowed Int: " + narrowedInt);
    }
}