package Constructor;

public class Student {

    String name;
    int age;
    double gwa;
    boolean isEnrolled;

    Student(String name, int age, double gwa){
        this.name = name;
        this.age = age;
        this.gwa = gwa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }

}
