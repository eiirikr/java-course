package OverloadedConstructor;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Jeric");
        User user2 = new User("Jane", "janedoe@mail.com");
        User user3 = new User("John", "johndoe@mail.com", 22);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
