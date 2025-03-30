// Method Overloading: Using multiple methods with the same name but different parameters
class Calculator {

    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b; // Returns the sum of two integers
    }

    // Method 2: Adds three integers (Overloaded Method)
    public int add(int a, int b, int c) {
        return a + b + c; // Returns the sum of three integers
    }

    // Method 3: Adds two double numbers (Overloaded Method)
    public double add(double a, double b) {
        return a + b; // Returns the sum of two double values
    }
}

// Main class where execution starts
public class JAVA_26_Method_Overloding {
    public static void main(String[] args) {

        // Create an object of the 'Calculator' class
        Calculator calc = new Calculator();

        // Call the first 'add' method (adds two integers)
        System.out.println("Sum of two integers: " + calc.add(5, 10));

        // Call the overloaded 'add' method (adds three integers)
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));

        // Call the overloaded 'add' method (adds two double numbers)
        System.out.println("Sum of two doubles: " + calc.add(5.5, 2.3));
    }
}
