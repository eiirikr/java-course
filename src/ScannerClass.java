import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your current year: ");
        int year = scanner.nextInt();

        System.out.print("Enter your gwa: ");
        double gwa = scanner.nextDouble();

        System.out.println("\nHello " + name);

        if(year == 1) {
            System.out.println("You are enrolled as " + year + "st year college.");
        } else if (year == 2) {
            System.out.println("You are enrolled as " + year + "nd year college.");
        } else if (year == 3) {
            System.out.println("You are enrolled as " + year + "rd year college.");
        } else {
            System.out.println("You are enrolled as " + year + "th year college.");
        }

        if(gwa >= 97 && gwa <= 100) {
            System.out.println("Excellent!");
        } else if (gwa >= 88 && gwa <= 96) {
            System.out.println("Very Good!");
        } else if (gwa >= 79 && gwa <= 87) {
            System.out.println("Satisfactory!");
        } else if (gwa >= 75 && gwa <= 78) {
            System.out.println("Fair!");
        } else if (gwa <= 74) {
            System.out.println("Failed!");
        } else {
            System.out.println("Invalid grade");
        }






        scanner.close();
    }
}
