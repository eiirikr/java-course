import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int numOfFood;

        System.out.print("What # of food do you want?: ");
        numOfFood = scanner.nextInt(); // ex. 4\n = input buffer
        scanner.nextLine(); // clear input buffer

        foods = new String[numOfFood];


        for(int i = 0; i < numOfFood; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
