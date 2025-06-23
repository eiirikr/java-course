import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "strawberry", "orange"};

//        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

//        for(int i = 0; i < numOfFruits; i++){
//            System.out.println(fruits[i]);
//        }

//        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        // Enhance for loop / foreach loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

//        System.out.println(fruits[0]);
//        System.out.println(numOfFruits);

    }
}
