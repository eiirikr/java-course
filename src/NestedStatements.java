import java.util.Scanner;

public class NestedStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price = 100.00;

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior? (true/false): ");
        isSenior = scanner.nextBoolean();

        if(isStudent) {
            if(isSenior) {
                System.out.println("\nYou get a student discount of 10%");
                System.out.println("You get a senior discount of 20%");
                price *= 0.7;
            } else {
                System.out.println("\nYou get a student discount of 10%");
                price *= 0.9;
            }

        } else {
            if(isSenior) {
                System.out.println("\nYou get a senior discount of 20%");
                price *= 0.8;
            } else {
                System.out.println();
                price *= 1;
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);

        scanner.close();
    }
}
