public class JAVA_7_increment_decrement {
    public static void main(String[] args) {
        /*
        // Example: Data type conversions in expressions
        byte x = 5;     // Declaring a byte variable
        int y = 6;      // Declaring an integer variable
        short z = 8;    // Declaring a short variable

        // When adding int and short, the result is promoted to int
        int a = y + z;

        // When adding float and byte, the result is promoted to float
        float b = 6.54f + x;

        // Print the value of b
        System.out.println(b);
        */

        // **Increment and Decrement Operators**

        // Initializing integer variable i
        int i = 56;

        // **Post-increment example**
        // int b = i++;  // First, b is assigned the current value of i (56), then i is incremented

        // Initializing integer variable j
        int j = 67;

        // **Pre-increment example**
        int c = ++j; // First, j is incremented, then c is assigned the incremented value (68)

        // **Demonstrating post-increment**
        System.out.println(i++); // Prints i (56), then increments i to 57
        System.out.println(i);   // Now i has become 57, so it prints 57

        // **Demonstrating pre-increment**
        System.out.println(++i); // First increments i to 58, then prints 58
        System.out.println(i);   // Prints i (58), as it remains unchanged

        // **Expression using pre-increment**
        int y = 7;
        System.out.println(++y * 8); // First, y is incremented to 8, then 8 * 8 = 64 is printed

        // **Character increment example**
        char ch = 'a'; // Character variable initialized to 'a'
        System.out.println(++ch); // Increments 'a' to 'b' and prints 'b'
    }
}
