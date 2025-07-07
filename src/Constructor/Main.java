package Constructor;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Luffy", 22, 2.0);
        Student student2 = new Student("Zoro", 23, 1.5);
        Student student3 = new Student("Sanji", 21, 1.0);

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gwa);
//        System.out.println(student1.isEnrolled);
//
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gwa);
//        System.out.println(student2.isEnrolled);
//
//        System.out.println(student3.name);
//        System.out.println(student3.age);
//        System.out.println(student3.gwa);
//        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();

    }
}
