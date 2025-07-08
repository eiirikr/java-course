package ObjectArray;

public class Main {
    public static void main(String[] args) {

//        Car car1 = new Car("Mustang", "red");
//        Car car2 = new Car("Corvette", "blue");
//        Car car3 = new Car("Charger", "yellow");
//
//        Car[] cars = {car1, car2, car3};
//
//        for(Car car: cars){
//            car.drive();
//        }



        Car[] cars = {new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow")
        };

        for(Car car: cars){
            car.color = "black";
        }

        for(Car car: cars){
            car.drive();
        }

    }
}
