import java.util.Scanner;

public class SubstringMethod {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        // .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@') + 1);

            System.out.printf("\nYour username is: %s", username);
            System.out.printf("\nYour domain is: %s", domain);
        } else {
            System.out.println("Emails must contain @");
        }

        scanner.close();
    }
}
