public class JAVA_16_While_loops {

    public static void main(String[] args) {
        // Declare and initialize a variable 'a' with value 1
        int a = 1;

        // The while loop runs as long as the condition (a <= 100) is true
        while (a <= 100) {
            // Print the current value of 'a'
            System.out.println(a);

            // Increment 'a' by 1 to avoid an infinite loop
            a++;
        }

    }
}

