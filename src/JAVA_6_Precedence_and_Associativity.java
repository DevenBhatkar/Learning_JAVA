public class JAVA_6_Precedence_and_Associativity {
    public static void main(String[] args) {
        // **Precedence & Associativity**
        // Operators follow precedence rules (multiplication, division first) and associativity (left to right)

        // Example 1: Operator precedence and associativity
        // int a = 6 * 5 - 34 / 2;
        /*
        Step-by-step evaluation:
        1. Highest precedence: * and /
        2. Left to right associativity applies:
           = 6 * 5 - 34 / 2
           = 30 - 17
           = 13
        */

        // Example 2: Operator precedence with division and multiplication
        // int b = 60 / 5 - 34 * 2;
        /*
        Step-by-step evaluation:
        1. Highest precedence: * and /
        2. Left to right associativity applies:
           = 60 / 5 - 34 * 2
           = 12 - 68
           = -56
        */

        // Uncomment the following lines to print the values of `a` and `b`
        // System.out.println(a);
        // System.out.println(b);

        // **Quick Quiz**
        int x = 6;
        int y = 1;
        // Example calculation: `k = x * y / 2;`
        // Step-by-step:
        // k = (6 * 1) / 2
        // k = 6 / 2
        // k = 3

        // Declaration of three integer variables
        int b = 0;
        int c = 0;
        int a = 10;

        // Formula: k = (b * b - (4 * a * c)) / (2 * a)
        int k = b * b - (4 * a * c) / (2 * a);
        /*
        Step-by-step evaluation:
        1. First, calculate `b * b` → 0 * 0 = 0
        2. Calculate `4 * a * c` → 4 * 10 * 0 = 0
        3. Divide by `2 * a` → 0 / (2 * 10) = 0
        4. Final result: `0 - 0 = 0`
        */

        // Print the result of k
        System.out.println(k);

    }
}
