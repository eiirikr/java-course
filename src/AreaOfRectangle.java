import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // Calculate area of the rectangle

        double height = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        height = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("The area of the rectangle: " + area + "cm²");

        scanner.close();
    }
}
