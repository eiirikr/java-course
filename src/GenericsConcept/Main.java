package GenericsConcept;

public class Main {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        box1.setItem("banana");
        box2.setItem(3);
        box3.setItem(3.12);

        System.out.println(box1.getItem());
        System.out.println(box2.getItem());
        System.out.println(box3.getItem());

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

    }
}
