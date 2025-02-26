public class Java_12_Logical_operator {
    public static void main(String[] args) {

        /*
        ======================
        LOGICAL AND (&&) OPERATOR
        ======================

        The logical AND (&&) returns true if BOTH conditions are true.
        Otherwise, it returns false.

        Example Cases:
        - true && true   → true
        - true && false  → false
        - false && true  → false
        - false && false → false
        */

        /*
        System.out.println("For logical AND");
        boolean a = true;
        boolean b = true;

        if (a && b) {  // Both are true, so condition is true
            System.out.println("Y");  // Prints "Y"
        } else {
            System.out.println("N");  // This won't execute in this case
        }

        // Expected Output:
        // For logical AND
        // Y
        */

        /*
        ======================
        LOGICAL OR (||) OPERATOR
        ======================

        The logical OR (||) returns true if AT LEAST ONE condition is true.
        It only returns false if BOTH conditions are false.

        Example Cases:
        - true || true   → true
        - true || false  → true
        - false || true  → true
        - false || false → false
        */

        /*
        System.out.println("For logical OR");
        boolean a = true;
        boolean b = false;

        if (a || b) {  // One is true, so condition is true
            System.out.println("Y");  // Prints "Y"
        } else {
            System.out.println("N");  // This won't execute in this case
        }

        // Expected Output:
        // For logical OR
        // Y
        */

        /*
        ======================
        LOGICAL NOT (!) OPERATOR
        ======================

        The logical NOT (!) inverts the boolean value.
        - !true  → false
        - !false → true
        */

        System.out.println("For logical NOT");
        boolean a = true;
        boolean b = false;

        System.out.println("Not(a) is ");
        System.out.println(!a); // Inverts 'true' to 'false'

        System.out.println("Not(b) is");
        System.out.println(!b); // Inverts 'false' to 'true'

        System.out.println("It inverts the condition");

        // Expected Output:
        // For logical NOT
        // Not(a) is
        // false
        // Not(b) is
        // true
        // It inverts the condition
    }
}
