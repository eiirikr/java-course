import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);

//        ArrayList<Double> list = new ArrayList<>();
//
//        list.add(3.1);
//        list.add(1.2);
//        list.add(2.3);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("coconut");

//        fruits.remove(0);
//        fruits.set(0, "orange");

//        System.out.println(fruits.get(0));
//        System.out.println(fruits.size());

        Collections.sort(fruits);
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
