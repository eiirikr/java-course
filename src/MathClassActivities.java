import java.util.Scanner;

public class MathClassActivities {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("\nThe radius " + radius + " is equivalent of:");
        System.out.printf("Circumference: %.2fcm\n", circumference);
        System.out.printf("Area: %.2fcm²\n", area);
        System.out.printf("Volume: %.2fcm³\n", volume);

        scanner.close();

    }
}
