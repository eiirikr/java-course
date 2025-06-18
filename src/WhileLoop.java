import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String name = "";
//
//        while(name.isEmpty()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);


//        String response = "";
//
//        while(!response.equals("Q")) {
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//        }
//
//        System.out.println("You have quit the game");


//        int age = 0;
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        while(age < 0){
//            System.out.println("Your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
//
//        System.out.printf("You are %d years old", age);


        int num = 0;

        do{
            System.out.print("Enter a number between 1-10: ");
            num = scanner.nextInt();
        }while(num < 1 || num > 10);

        System.out.println("You picked " + num);

        scanner.close();

    }
}
