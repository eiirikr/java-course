package GetterAndSetter;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Charger", "Yellow", 10000);

        car.setPrice(5000);
        car.setColor("Blue");

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
