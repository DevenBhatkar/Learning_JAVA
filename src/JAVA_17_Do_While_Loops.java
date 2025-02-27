public class JAVA_17_Do_While_Loops {
    public static void main(String[] args) {
        // Declare and initialize variable 'a' with value 1 (for do-while loop)
        int a = 1;
        // Declare and initialize variable 'b' with value 1 (for while loop)
        int b = 1;

        // WHILE LOOP
        // The while loop checks the condition first before executing the loop body
        while (b <= 45) {  // Condition: Loop runs as long as 'b' is less than or equal to 45
            System.out.println(b);  // Print the current value of 'b'
            b++;  // Increment 'b' to avoid infinite loop
        }

        // DO-WHILE LOOP
        // The do-while loop executes the loop body first and checks the condition afterward
        do {
            System.out.println(a);  // Print the current value of 'a'
            a++;  // Increment 'a'
        } while (a <= 45);  // Condition is checked after executing the loop body
    }
}
