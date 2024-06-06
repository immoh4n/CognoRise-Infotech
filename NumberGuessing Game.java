import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random rand = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Variable to track the number of attempts
        int attempts = 0;
        
        // Maximum number of attempts
        int maxAttempts = 10;
        
        // Variable to store the user's guess
        int guess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        // Loop to allow multiple attempts
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Compare the guess with the random number and provide feedback
            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                break;
            }

            // Check if the user has reached the maximum number of attempts
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + randomNumber + ".");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
