public class JAVA_19_Break_and_Continue {
    public static void main(String[] args) {
        // Demonstrating 'break' and 'continue' statements using different loops

        // =========================
        // Example 1: 'break' in a for loop
        // =========================

        /*
        for (int i = 0; i < 5; i++) {  // Loop runs from i = 0 to i = 4
            System.out.println(i);  // Prints the current value of i
            System.out.println("Java is Great!");  // Prints a message

            if (i == 2) {  // If i reaches 2
                System.out.println("end");  // Print "end"
                break;  // Exit the loop immediately
            }
        }
        */

        // =========================
        // Example 2: 'break' in a while loop
        // =========================

        /*
        int i = 0;  // Initialize loop counter
        while (i < 5) {  // Run loop while i is less than 5
            System.out.println(i);  // Print value of i
            System.out.println("Java is great");  // Print message

            if (i == 2) {  // When i reaches 2
                System.out.println("ending the loop");  // Print message
                break;  // Exit loop immediately
            }
            i++;  // Increment i to avoid infinite loop
        }
        */

        // =========================
        // Example 3: 'break' in a do-while loop
        // =========================

        /*
        int i = 0;  // Initialize loop counter
        do {
            System.out.println(i);  // Print value of i
            System.out.println("Java is great");  // Print message

            if (i == 2) {  // When i reaches 2
                System.out.println("Ending the loop");  // Print message
                break;  // Exit loop immediately
            }
            i++;  // Increment i
        } while (i < 5);  // Condition to continue loop while i < 5
        */

        // =========================
        // Example 4: 'continue' in a for loop
        // =========================

        /*
        for (int i = 0; i < 5; i++) {  // Loop runs from i = 0 to i = 4
            if (i == 2) {  // If i is 2
                System.out.println("end");  // Print "end"
                continue;  // Skip the rest of this iteration and go to next iteration
            }
            System.out.println(i);  // Print value of i
            System.out.println("Java is Great!");  // Print message
        }
        */

        // =========================
        // Example 5: 'continue' in a do-while loop
        // =========================

        /*
        int i = 0;  // Initialize loop counter
        do {
            i++;  // Increment i at the beginning

            if (i == 2) {  // When i is 2
                System.out.println("Ending the loop");  // Print message
                continue;  // Skip the rest of this iteration and go to next
            }
            System.out.println(i);  // Print value of i
            System.out.println("java is great");  // Print message
        } while (i < 5);  // Condition to continue loop while i < 5
        */

        // =========================
        // Example 6: 'continue' in a while loop
        // =========================

        /*
        int i = 0;  // Initialize loop counter
        while (i < 5) {  // Loop runs while i < 5
            i++;  // Increment i at the beginning

            if (i == 2) {  // If i is 2
                System.out.println("ending the loop");  // Print message
                continue;  // Skip the rest of this iteration and go to next iteration
            }

            System.out.println(i);  // Print value of i
            System.out.println("Java is great");  // Print message
        }
        */
    }
}
