// Define a class named 'calculator'
class calculator {
    int a;  // This is a class-level variable (not used in this program)

    // Method to add two numbers and return the result
    public int add(int n1, int n2) {
        int r = n1 + n2; // Perform addition
        return r; // Return the sum
    }
}

// Main class where program execution starts
public class JAVA_25_Methods {

    public static void main(String[] args) {

        // Declare two integer variables and assign values
        int num1 = 4;
        int num2 = 5;

        // Create an object of the 'calculator' class
        // This allows us to use the 'add' method from the 'calculator' class
        calculator calc = new calculator();

        // Call the 'add' method using the object 'calc'
        // Pass 'num1' and 'num2' as arguments and store the result
        int result = calc.add(num1, num2);

        // Print the result of the addition
        System.out.println("The sum of two numbers is: " + result);
        //
    }
}
