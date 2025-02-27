import java.util.Scanner;  // Import Scanner class for user input

public class JAVA_18_For_Loop {
    public static void main(String[] args) {

        // BASIC FOR LOOP: Prints numbers from 0 to 20
        // Initialization: int a = 0 (Loop starts with a = 0)
        // Condition: a <= 20 (Loop runs until a becomes greater than 20)
        // Increment: a++ (Increases 'a' by 1 in each iteration)

//        for (int a = 0; a <= 20; a++) {
//            System.out.println(a);  // Prints numbers from 0 to 20
//        }

        // NOTE: To find even numbers, we use the formula: 2n → 2, 4, 6, 8, ...
        //       To find odd numbers, we use the formula: 2n + 1 → 1, 3, 5, 7, 9, ...

        // PROGRAM TO PRINT NATURAL NUMBERS IN REVERSE ORDER
        // This loop prints numbers from 20 down to 0
        // Initialization: int i = 20 (Starts from 20)
        // Condition: i >= 0 (Runs until i becomes less than 0)
        // Decrement: i-- (Decreases 'i' by 1 in each iteration)

//        for (int i = 20; i >= 0; i--) {
//            System.out.println(i);  // Prints numbers from 20 to 0
//        }

        // ALTERNATIVE APPROACH: Print numbers from 20 to 1 (not including 0)
        // Condition: i != 0 (Loop stops when i reaches 0)

//        for (int i = 20; i != 0; i--) {
//            System.out.println(i);  // Prints numbers from 20 to 1
//        }

        // PROGRAM TO PRINT FIRST 'N' ODD NUMBERS IN REVERSE ORDER
        // Scanner class is used to take user input

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of N");  // Prompt user for input
//        int n = sc.nextInt();  // Read user input and store it in 'n'

        // This loop prints the first 'N' odd numbers using the formula 2a + 1
        // The loop runs from 1 to n-1 (as per condition a < n)

//        for (int a = 1; a < n; a++) {
//            System.out.println(2 * a + 1);  // Prints odd numbers: 1, 3, 5, 7, 9, ...
//
//        }
    }
}
