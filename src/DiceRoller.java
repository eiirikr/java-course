import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberRoll;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numberRoll = scanner.nextInt();
        System.out.printf("Rolling %d dice...\n", numberRoll);

        if(numberRoll > 0){
            for(int i = 0; i < numberRoll; i++){
                int roll = random.nextInt(1, 7);
                rollDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
        } else{
            System.out.println("Number of roll should be greater than 0");
        }

        System.out.println("Total of all rolls: " + total);

        scanner.close();
    }

    static void rollDie(int roll){
        String roll1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String roll2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String roll3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String roll4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String roll5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String roll6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.print(roll1);
            case 2 -> System.out.print(roll2);
            case 3 -> System.out.print(roll3);
            case 4 -> System.out.print(roll4);
            case 5 -> System.out.print(roll5);
            case 6 -> System.out.print(roll6);
            default -> System.out.println("Invalid roll!");
        }
    }
}
