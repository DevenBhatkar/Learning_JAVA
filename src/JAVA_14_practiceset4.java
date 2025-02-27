import java.util.Scanner;

public class JAVA_14_practiceset4 {
    public static void main(String[] args) {

        // Question 1: Determine if a student has passed or failed
        // Criteria: At least 40% total and 33% in each subject

        Scanner sub = new Scanner(System.in);

        // Prompting the user to enter marks for three subjects
        System.out.println("Enter marks for subject 1:");
        byte a = sub.nextByte();

        System.out.println("Enter marks for subject 2:");
        byte b = sub.nextByte();

        System.out.println("Enter marks for subject 3:");
        byte c = sub.nextByte();

        // Calculate the average of the three subjects
        float avg = (a + b + c) / 3.0f; // Use 3.0f to ensure floating-point division
        System.out.println("Your average is: " + avg);

        // Check if student passed or failed
        if (avg < 40 || a < 33 || b < 33 || c < 33) {
            System.out.println("You have failed");
        } else {
            System.out.println("You passed");
        }

        // Question 2: Calculate income tax based on given slabs
        System.out.println("Enter your income in Lakhs per annum:");
        float tax = 0;
        float income = sub.nextFloat();

        if (income <= 2.5) {
            tax = 0;
        } else if (income > 2.5f && income <= 5f) {
            tax += 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (income - 5f);
        } else if (income > 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0f - 5f);
            tax += 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);

        // Question 3: Determine the day of the week based on number input
        System.out.println("Enter a number (1-7) to find the corresponding day of the week:");
        int day = sub.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input! Enter a number between 1 and 7.");
        }

        // Question 5: Check if a year is a leap year
        System.out.println("Enter the year:");
        int year = sub.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Question 6: Identify the type of website based on its domain extension
        System.out.println("Enter a website URL:");
        String website = sub.next();

        if (website.endsWith(".org")) {
            System.out.println("This is an organizational website.");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website.");
        } else {
            System.out.println("Unknown website type.");
        }
    }
}
