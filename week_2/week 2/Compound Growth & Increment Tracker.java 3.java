
// Online IDE - Code Editor, Compiler, Interpreter

public class Main {
    public static void main(String[] args) {
        double balance = 1000.0;
        
        balance += 500.0;
        System.out.println("Balance after step 1: " + balance);
        
        balance *= 1.05;
        System.out.println("Balance after step 2: " + balance);
        
        balance += 200.0;
        System.out.println("Balance after step 3: " + balance);

        int count = 5;
        System.out.println("count++: " + (count++));
        System.out.println("count afterwards: " + count);

        int counter = 5;
        System.out.println("++counter: " + (++counter));
        System.out.println("counter afterwards: " + counter);
    }
}