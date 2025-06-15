import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();

        System.out.print("Enter a type of bird: ");
        String bird = scanner.nextLine();

        System.out.print("Enter a room in a house: ");
        String room = scanner.nextLine();

        System.out.print("Enter a verb (past tense): ");
        String verb1 = scanner.nextLine();

        System.out.print("Enter another verb: ");
        String verb2 = scanner.nextLine();

        System.out.print("Enter a relative's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter a liquid: ");
        String liquid = scanner.nextLine();

        System.out.print("Enter another verb ending in -ing: ");
        String verb3 = scanner.nextLine();

        System.out.print("Enter a part of the body (plural): ");
        String body = scanner.nextLine();

        System.out.print("Enter a plural noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Enter another verb ending in -ing: ");
        String verb4 = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun3 = scanner.nextLine();

        System.out.println("\nIt was a " + adjective1 + ", cold November day. I \n" +
                "woke up to the " + adjective2 + " smell of " + bird +
                "\nroasting in the " + room + " downstairs. I\n" +
                verb1 + " down the stairs to see if I could " +
                "\nhelp " + verb2 + " the dinner. My mom said, " +
                "\n\"See if " + name + " needs a fresh " + noun1 + ".\" So I " +
                "\ncarried a tray of glasses full of " + liquid + " into" +
                "\nthe " + verb3 + " room. When I got there, I " +
                "\ncouldn't believe my " + body + "! There were\n" +
                noun2 + " " + verb4 + " on the " + noun3 + "!"  );

        scanner.close();
    }
}
