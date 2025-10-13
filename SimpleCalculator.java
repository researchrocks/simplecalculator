public class SimpleCalculator {
    
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Method to divide two numbers
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    // NOTE: Multiplication method is intentionally missing
    // Students will add this as part of the exercise
    
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("6 / 2 = " + calc.divide(6, 2));
    }
}
