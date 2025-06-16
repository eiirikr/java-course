public class StringMethods {
    public static void main(String[] args) {

        String name = "Jeric Javier";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf('i');
        int lastIndex = name.lastIndexOf('i');


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = "      Jeric Javier    ";
        System.out.println(name);
        name = name.trim();
        System.out.println(name);

        name = name.replace('J', 'T');
        System.out.println(name);

        String a = "";
        System.out.println(a.isEmpty());

        String b = "Jeric Javier";
        System.out.println(b.contains(" "));

        System.out.println(b.equals("Jeric Javier"));
        System.out.println(b.equalsIgnoreCase("jeric javier"));

    }
}
