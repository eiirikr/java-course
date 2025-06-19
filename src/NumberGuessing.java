import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guessNumber;
        int min = 1;
        int max = 100;
        int attempts = 0;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guessNumber = scanner.nextInt();
            attempts++;

            if (guessNumber > randomNumber) {
                System.out.println("TOO HIGH! Try again");
            } else if (guessNumber < randomNumber) {
                System.out.println("TOO LOW! Try again");
            } else {
                System.out.println("CORRECT! the number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        } while(guessNumber != randomNumber);

        scanner.close();

    }
}
