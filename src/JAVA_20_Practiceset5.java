public class JAVA_20_Practiceset5 {

    public static void main(String[] args) {
        /*
        Q1) Write a program to print the following pattern:

        ****
        ***
        **
        *

        The pattern consists of 4 rows where each row has decreasing stars.
        */

//        int n = 4;  // Number of rows
//        for (int i = n; i > 0; i--) {  // Outer loop runs from 4 to 1
//            for (int j = 0; j < i; j++) {  // Inner loop prints stars equal to row number
//                System.out.print("*");
//            }
//            System.out.print("\n");  // Moves to the next line after printing stars
//        }

        /* Sample Output:
         ****
         ***
         **
         *
         */

        /*
        Q2) Write a program to sum the first 'n' even numbers.
        Even numbers start from 0, 2, 4, 6, 8...
        */

//        int sum = 0;  // Variable to store the sum
//        int n = 4;  // Number of even numbers to sum
//        for (int i = 0; i < n; i++) {  // Loop runs for 'n' times
//            sum = sum + (2 * i);  // Adds the even number (0, 2, 4, 6, ...)
//        }
//        System.out.print(sum);  // Prints the sum

        /* Sample Output:
        12  (0 + 2 + 4 + 6)
        */

        /*
        Q3) Write a program to print the multiplication table of a given number 'n'.
        */

//        int n = 5;  // The number whose multiplication table is to be printed
//
//        for (int i = 1; i <= 10; i++) {  // Loop runs from 1 to 10
//            System.out.printf("%d X %d = %d\n", n, i, n * i);  // Prints the table row
//        }

        /* Sample Output:
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        ...
        5 X 10 = 50
        */

        /*
        Q4) Write a program to print the multiplication table of 10 in reverse order.
        */

//        int n = 10;  // The number whose table is to be printed
//
//        for (int i = 10; i >= 0; i--) {  // Loop runs from 10 to 0 in reverse
//            System.out.printf("%d X %d = %d\n", n, i, n * i);  // Prints the table row
//        }

        /* Sample Output:
        10 X 10 = 100
        10 X 9 = 90
        10 X 8 = 80
        ...
        10 X 0 = 0
        */

        /*
        Q5) Write a program to find the factorial of a given number using a for loop.
        Factorial of 'n' is calculated as:
        n! = n × (n-1) × (n-2) × ... × 1
        */

//        int n = 3;  // Number to find factorial of
//        int factorial = 1;  // Variable to store the factorial, initialized to 1
//
//        for (int i = 1; i <= n; i++) {  // Loop runs from 1 to n
//            factorial *= i;  // Multiply factorial by the current number
//        }
//        System.out.println(factorial);  // Print the factorial

        /* Sample Output:
        6  (3! = 3 × 2 × 1 = 6)
        */

        /*
        Q6) Write a program to find the factorial of a given number using a while loop.
        */

//        int n = 5;  // Number to find factorial of
//        int fac = 1;  // Variable to store factorial, initialized to 1
//        int i = 1;  // Loop counter
//
//        while (i <= n) {  // Loop runs from 1 to n
//            fac *= i;  // Multiply fac by the current number
//            i++;  // Increment i
//        }
//        System.out.println(fac);  // Print the factorial

        /* Sample Output:
        120  (5! = 5 × 4 × 3 × 2 × 1 = 120)
        */

        /*
        Q8) What can be done using one type of loop can also be done using the other two types of loops. True or False?

        Answer: True
        */

        /*
        Q9) Write a program to calculate the sum of numbers occurring in the multiplication table of 8.
        */

//        int n = 8;  // The number whose table is to be summed
//        int sum = 0;  // Variable to store the sum
//
//        for (int i = 1; i <= 10; i++) {  // Loop runs from 1 to 10
//            sum += n * i;  // Adds the current product of 8 to sum
//        }
//
//        System.out.println(sum);  // Print the sum

        /* Sample Output:
        440  (8 × 1 + 8 × 2 + ... + 8 × 10 = 440)
        */

        /*
        Q10) A do-while loop is executed:

        1. At least once
        2. At least twice
        3. At most once.

        Answer: 1. At least once
        */

        /*
        Q2 (Repeat) Using a while loop:
        */

//        int n = 3;  // Number of even numbers to sum
//        int sum = 0;  // Variable to store sum
//        int i = 0;  // Loop counter
//
//        while (i < n) {  // Loop runs while i is less than n
//            sum += (2 * i);  // Adds even number (0, 2, 4, ...)
//            i++;  // Increment i
//        }
//
//        System.out.println(sum);  // Print the sum

        /* Sample Output:
        12  (0 + 2 + 4 + 6)
        */
    }
}
