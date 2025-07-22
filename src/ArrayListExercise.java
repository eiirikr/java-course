import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfFood;
        String food;

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

    }
}
