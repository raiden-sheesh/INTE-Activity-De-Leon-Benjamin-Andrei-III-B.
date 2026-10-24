
// Online IDE - Code Editor, Compiler, Interpreter

public class Main {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println("Overflowed byte: " + b);

        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 99;
        System.out.println("arr1[0]: " + arr1[0]);
        System.out.println("arr2[0]: " + arr2[0]);
    }
}