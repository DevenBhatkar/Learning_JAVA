public class JAVA_21_Arrays {
    public static void main(String[] args) {

        /*
        **Scenario:** Imagine a classroom with 500 students, and you need to store their marks.
        **Two possible solutions:**
        1. Create 500 different variables (not practical).
        2. Use **arrays**, which allow us to store multiple values in a **single variable** (recommended).
        */

        // **Ways to create an array in Java**

        // -------------------------------------------
        // 1. Declaration and Memory Allocation
        // -------------------------------------------
        // We declare an array of integers and allocate memory for 5 elements.
        // Each element is initialized to `0` by default.
        // int[] marks = new int[5];

        // -------------------------------------------
        // 2. Declaration, then Memory Allocation
        // -------------------------------------------
        // First, declare an integer array variable
        // int[] marks;

        // Then allocate memory for 5 elements in the array
        // marks = new int[5];

        // Now, initialize the array with values
        // marks[0] = 100;  // Assign 100 to the first element (index 0)
        // marks[1] = 60;   // Assign 60 to the second element (index 1)
        // marks[2] = 70;   // Assign 70 to the third element (index 2)
        // marks[3] = 90;   // Assign 90 to the fourth element (index 3)
        // marks[4] = 86;   // Assign 86 to the fifth element (index 4)

        // -------------------------------------------
        // 3. Declaration, Memory Allocation & Initialization Together
        // -------------------------------------------
        // This method is the most convenient as it combines declaration, memory allocation, and initialization in a single line.
        // int[] marks = {98, 45, 79, 99, 80};

        // -------------------------------------------
        // Accessing Array Elements
        // -------------------------------------------
        // To access an element, use its **index** (starting from 0).
        // System.out.println(marks[4]); // Prints the fifth element (index 4)

        // -------------------------------------------
        // Error Scenario: Accessing Out-of-Bounds Index
        // -------------------------------------------
        // Trying to access an index that doesn't exist causes an **ArrayIndexOutOfBoundsException**.
        // marks[5] = 96;  // ❌ This will cause an error since index 5 does not exist in a 5-element array.

        /*
        **Sample Output:**
        80 (If marks array is {98, 45, 79, 99, 80}, then marks[4] = 80)
        */
    }
}
