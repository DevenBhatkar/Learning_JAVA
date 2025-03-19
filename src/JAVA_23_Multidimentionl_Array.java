public class JAVA_23_Multidimentionl_Array {
    public static void main(String[] args) {

        // ---------------------------------------------
        // **1D and 2D Array Declaration**
        // ---------------------------------------------

        int [] marks; // A 1-Dimensional (1D) Array declaration
        int [][] flats; // A 2-Dimensional (2D) Array declaration

        // ---------------------------------------------
        // **Memory Allocation for 2D Array**
        // ---------------------------------------------
        // Here, we are creating a 2D array with **2 rows** and **3 columns**
        flats = new int [2][3]; // Now 'flats' is a 2x3 array

        // ---------------------------------------------
        // **Initializing the 2D Array**
        // ---------------------------------------------
        // First row (index 0)
        flats[0][0] = 101; // First apartment in the first row
        flats[0][1] = 102; // Second apartment in the first row
        flats[0][2] = 103; // Third apartment in the first row

        // Second row (index 1)
        flats[1][0] = 201; // First apartment in the second row
        flats[1][1] = 202; // Second apartment in the second row
        flats[1][2] = 203; // Third apartment in the second row

        // ---------------------------------------------
        // **Printing the 2D Array Using Nested for Loop**
        // ---------------------------------------------
        System.out.println("Printing a 2-D array using for loop");

        for (int i = 0; i < flats.length; i++) { // Loop through each row
            for (int j = 0; j < flats[i].length; j++) { // Loop through each column in the current row
                System.out.print(flats[i][j]); // Print each element in the row
                System.out.print(" "); // Print a space for better readability
            }
            System.out.println(""); // Move to the next line after printing a row
        }

        /*
        **Sample Output:**
        Printing a 2-D array using for loop
        101 102 103
        201 202 203
        */

    }
}
