public class JAVA_9_String {
    public static void main(String[] args) {

        // Declaring a string variable
        String name = ("Deven");

        // Printing the original string
//        System.out.println(name);
        // Output: Deven

        // Finding the length of the string
//        int value = name.length();
//        System.out.println(value);
        // Output: 5 (number of characters in "Deven")

        // Converting string to lowercase
//        String lower = name.toLowerCase();
//        System.out.println(lower);
        // Output: deven

        // Converting string to uppercase
//        String upper = name.toUpperCase();
//        System.out.println(upper);
        // Output: DEVEN

        // Removing leading and trailing spaces from the string
//        String trimmedname = name.trim();
//        System.out.println(trimmedname);
        // Output: Deven (No spaces to trim in this case)

        // Extracting a substring from index 2 onwards
//        System.out.println(name.substring(2));
        // Output: ven

        // Extracting a substring from index 1 to 3 (excluding 3)
//        System.out.println(name.substring(1, 3));
        // Output: ev

        // Replacing characters in the string
//        System.out.println(name.replace('e', 'a'));
        // Output: Davan (all 'e' replaced with 'a')

//        System.out.println(name.replace("e", "erg"));
        // Output: DergvErgn (each 'e' replaced with "erg")

        // Checking if the string starts with a specific prefix
//        System.out.println(name.startsWith("Dev"));
        // Output: true

//        System.out.println(name.startsWith("fev"));
        // Output: false

        // Checking if the string ends with a specific suffix
//        System.out.println(name.endsWith("en"));
        // Output: true

//        System.out.println(name.endsWith("fg"));
        // Output: false

        // Accessing characters at specific indexes
//        System.out.println(name.charAt(0));
        // Output: D

//        System.out.println(name.charAt(1));
        // Output: e

//        System.out.println(name.charAt(2));
        // Output: v

//        System.out.println(name.charAt(3));
        // Output: e

//        System.out.println(name.charAt(4));
        // Output: n

        // Finding the first occurrence of a character in the string
//        System.out.println(name.indexOf('v'));
        // Output: 2 (first occurrence of 'v')

        // Searching for a substring from a specific index
//        String name2 = "defdfdfer";
//        System.out.println(name2.indexOf("fd", 3));
        // Output: 4 (first occurrence of "fd" after index 3)

//        System.out.println(name2.indexOf("xxx", 3));
        // Output: -1 (since "xxx" does not exist in the string)

        // Finding the last occurrence of a character or substring
//        System.out.println(name.lastIndexOf('n'));
        // Output: 4 (last occurrence of 'n' in "Deven")

//        System.out.println(name.lastIndexOf("ven"));
        // Output: 2 (last occurrence of "ven" starts at index 2)

//        System.out.println(name2.lastIndexOf("fd", 4));
        // Output: 3 (last occurrence of "fd" before index 4 in "defdfdfer")

        // Comparing two strings (case-sensitive)
//        System.out.println(name.equals("Deven"));
        // Output: true (exact match)

//        System.out.println(name.equals("deven"));
        // Output: false (case-sensitive comparison)

        // Comparing two strings ignoring case
//        System.out.println(name.equalsIgnoreCase("deven"));
        // Output: true (ignores case differences)

        // Printing a string with escape sequences
//        System.out.println("hi im deven \" and im learning java ");
        // Output: hi im deven " and im learning java


        // Template letter with a placeholder for the name
//        String letter = "Dear </name>, Thanks a lot";
//
//         Name to replace in the template
//        String name = "Deven"; // You can change this name
//
//         Replacing the placeholder with the actual name
//        String personalizedLetter = letter.replace("</name>", name);
//
//         Printing the final letter
//       System.out.println(personalizedLetter);
    }
}
