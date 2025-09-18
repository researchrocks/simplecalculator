/**
 * SimpleCalculator - A basic calculator class for performing arithmetic operations
 * 
 * This class provides basic mathematical operations and serves as a foundation
 * for additional features to be added through version control exercises.
 * 
 * @author Student Name
 * @version 1.0
 */
public class SimpleCalculator {
    
    /**
     * Adds two numbers and returns the result
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts the second number from the first number
     * 
     * @param a the first number (minuend)
     * @param b the second number (subtrahend)
     * @return the difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Divides the first number by the second number
     * 
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    
    /**
     * Calculates the power of a number
     * 
     * @param base the base number
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    /**
     * Calculates the square root of a number
     * 
     * @param a the number to find the square root of
     * @return the square root of a
     * @throws IllegalArgumentException if a is negative
     */
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(a);
    }
    
    /**
     * Main method for testing the calculator functionality
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        
        // Test the calculator methods
        System.out.println("SimpleCalculator Test Results:");
        System.out.println("Addition: 5 + 3 = " + calc.add(5, 3));
        System.out.println("Subtraction: 10 - 4 = " + calc.subtract(10, 4));
        System.out.println("Division: 15 / 3 = " + calc.divide(15, 3));
        System.out.println("Power: 2^3 = " + calc.power(2, 3));
        System.out.println("Square Root: √16 = " + calc.sqrt(16));
        
        // Note: Multiplication method to be added in feature-addition branch
        System.out.println("\nReady for multiplication feature addition!");
    }
}
