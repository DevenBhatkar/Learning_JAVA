public class JAVA_22_Array_part_2 {
    public static void main(String[] args) {
        /*
        **Understanding Arrays in Java**

        Arrays allow us to store multiple values of the same data type in a single variable.

        Below are examples of **float** and **String** arrays.

        // A float array storing marks of students
        // float[] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};

        // A String array storing names of students
        // String[] students = {"Harry", "Rohan", "Shubham", "Lovish"};

        // Printing the number of elements in the 'students' array
        // System.out.println(students.length); // Output: 4

        // Printing the third student (index 2 because indexing starts from 0)
        // System.out.println(students[2]); // Output: Shubham
        */

        // ---------------------------------------------
        // **Integer Array Declaration & Initialization**
        // ---------------------------------------------
        int[] marks = {98, 45, 79, 99, 80}; // Creating an integer array with 5 elements

        // ---------------------------------------------
        // **Getting the Size of an Array**
        // ---------------------------------------------
        // System.out.println(marks.length); // Output: 5 (since there are 5 elements)

        // ---------------------------------------------
        // **Printing Array Elements - Naive Way**
        // ---------------------------------------------
        System.out.println("Printing using Naive way"); // Using individual print statements
        System.out.println(marks[0]); // Output: 98
        System.out.println(marks[1]); // Output: 45
        System.out.println(marks[2]); // Output: 79
        System.out.println(marks[3]); // Output: 99
        System.out.println(marks[4]); // Output: 80

        /*
        **Sample Output for Naive Way:**
        Printing using Naive way
        98
        45
        79
        99
        80
        */

        // ---------------------------------------------
        // **Printing Array Elements Using a for Loop**
        // ---------------------------------------------
        System.out.println("Printing using for loop");

        for (int i = 0; i < marks.length; i++) { // Loop runs from index 0 to 4
            System.out.println(marks[i]); // Prints each element one by one
        }

        /*
        **Sample Output for for loop:**
        Printing using for loop
        98
        45
        79
        99
        80
        */

        // ---------------------------------------------
        // **Printing Array in Reverse Order**
        // ---------------------------------------------
        System.out.println("Printing using for loop in reverse order");

        for (int i = marks.length - 1; i >= 0; i--) { // Loop runs from last index to 0
            System.out.println(marks[i]); // Prints each element in reverse order
        }

        /*
        **Sample Output for Reverse Order:**
        Printing using for loop in reverse order
        80
        99
        79
        45
        98
        */

        // ---------------------------------------------
        // **Printing Array Elements Using for-each Loop**
        // ---------------------------------------------
        // The for-each loop is used when we just need to iterate over all elements.
        System.out.println("Printing using for-each loop");

        for (int element : marks) { // This loop goes through each element in the array
            System.out.println(element);
        }

        /*
        **Sample Output for for-each loop:**
        Printing using for-each loop
        98
        45
        79
        99
        80
        */
    }
}
