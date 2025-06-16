public class Printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

//        String name = "Jeric";
//        char firstLetter = 'J';
//        int age = 22;
//        double height = 170.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with a %c\n", firstLetter);
//        System.out.printf("You are %d years old\n", age);
//        System.out.printf("You are %.1fcm tall\n", height);
//        System.out.printf("Employed: %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old", name, age);


//        double num1 = 9897687545.99;
//        double num2 = 19.99;
//        double num3 = -59.99;
//        double num4 = 623759.99;
//
//        System.out.printf("Num1: %.1f\n", num1);
//        System.out.printf("Num2: %.2f\n", num2);
//        System.out.printf("Num3: %.3f\n", num3);

//        System.out.printf("Num1: % f\n", num1);
//        System.out.printf("Num2: %+f\n", num2);
//        System.out.printf("Num3: %(f\n", num3);
//        System.out.printf("Num4: %,f\n", num4);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n\n", id4);

    }
}
