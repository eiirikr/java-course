public class Method {
    public static void main(String[] args) {

        String name = "Jeric";
        int age = 22;

//        happyBirthday(name, age);
//        System.out.println(square(3));
//        System.out.println(cube(3));
//        System.out.println(getFullName("Jeric", "Javier"));

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        } else{
            System.out.println("You must be 18+ to sign up");
        }
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static boolean ageCheck(int age){
        return age >= 18;
    }
}
