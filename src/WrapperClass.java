public class WrapperClass {
    public static void main(String[] args) {

        // Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
//
//        // Unboxing
//        int w = a;
//        double x = b;
//        char y = c;
//        boolean z = d;

//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        String x = a + b + c + d;
//
//        System.out.println(x);

//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
