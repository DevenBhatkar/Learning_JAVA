import java.util.Random;  // Import Random class for generating computer's choice
import java.util.Scanner; // Import Scanner class for user input

public class JAVA_15_ROCK_PAPER_SCISSORS {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random choice for the computer
        Random random = new Random();

        // Define an array containing the three possible choices
        String[] choices = {"rock", "paper", "scissors"};

        // Prompt the user to enter their choice
        System.out.println("Enter rock, paper, or scissors:");
        String userChoice = scanner.next().toLowerCase(); // Convert input to lowercase for consistency

        // Validate user input to ensure it's a correct choice
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
            return; // Exit the program if input is invalid
        }

        // Generate a random index (0, 1, or 2) for the computer's choice
        String computerChoice = choices[random.nextInt(3)];

        // Display the computer's choice
        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner using if-else conditions
        if (userChoice.equals(computerChoice)) {
            // If both choices are the same, it's a tie
            System.out.println("It's a tie!");
        } else if (
            // User wins if:
            // Rock beats Scissors, Paper beats Rock, Scissors beats Paper
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!"); // User wins
        } else {
            System.out.println("You lose!"); // Otherwise, the computer wins
        }
    }
}
