public class JAVA_24_Practiceset6 {
    public static void main(String[] args) {

        // Q1) Create an array of 5 floats and calculate their sum
        /*
        float[] nums = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f}; // Declare and initialize an array of floats
        float sum = 0; // Variable to store the sum

        // Loop through each element in the array and add to sum
        for(float element : nums){
            sum = sum + element;
        }

        System.out.println("The sum of numbers is: " + sum);

        // Sample Output:
        // The sum of numbers is: 16.5
        */

        // Q2) Write a program to find out whether a given value is present in an array or not
        /*
        float[] nums = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        float select = 5.9f; // Number to check for presence
        boolean isInArray = false; // Flag to track if the number is found

        // Loop through array to check if the number exists
        for(float element : nums){
            if(select == element){
                isInArray = true;
                break;
            }
        }

        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }

        // Sample Output:
        // The value is not present in the array
        */

        // Q3) Calculate the average marks from the array containing marks of all students in physics
        /*
        float[] marks = {44.5f, 55.6f, 76.4f, 66.0f, 33.0f};
        float sum = 0;

        // Loop through each mark and sum it up
        for(float element : marks){
            sum = sum + element;
        }

        // Calculate and print the average
        System.out.println("The average of marks is: " + sum/marks.length);

        // Sample Output:
        // The average of marks is: 55.1
        */

        // Q4) Create a Java program to add two matrices of size 2x3
        /*
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13}, {3, 7, 1}};
        int[][] result = new int[2][3]; // Matrix to store the sum

        // Adding corresponding elements from both matrices
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the resultant matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Sample Output:
        // 3 8 16
        // 7 12 7
        */

        // Q5) Write a Java program to reverse an array
        /*
        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = l / 2; // Half the length of the array
        int temp;

        // Swapping elements to reverse the array
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        // Printing reversed array
        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Sample Output:
        // 67 34 5 4 3 21 1
        */

        // Q6) Write a Java program to find the maximum element in an array
        /*
        int[] arr = {1, 21, 3, 455, 5, 34, 67};
        int max = arr[0];

        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("Maximum value in the array is: " + max);

        // Sample Output:
        // Maximum value in the array is: 455
        */

        // Q7) Write a Java program to find the minimum element in an array
        /*
        int[] arr = {1, 21, 3, 455, 5, 34, 67};
        int min = arr[0];

        for (int e : arr) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("Minimum value in the array is: " + min);

        // Sample Output:
        // Minimum value in the array is: 1
        */

        // Q8) Write a Java program to find whether an array is sorted or not
        boolean isSorted = true; // Flag to check sorting status
        int[] arr = {1, 2100, 3, 455, 5, 34, 67};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }

        // Sample Output:
        // The array is not sorted
    }
}
