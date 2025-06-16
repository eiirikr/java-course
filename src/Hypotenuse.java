import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double legA;
        double legB;
        double hypotenuse;

        System.out.print("Enter the length of leg A: ");
        legA = scanner.nextDouble();

        System.out.print("Enter the length of leg B: ");
        legB = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));

        System.out.print("Hypotenuse: " + hypotenuse + "cm");

        scanner.close();
    }
}
