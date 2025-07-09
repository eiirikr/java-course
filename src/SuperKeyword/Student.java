package SuperKeyword;

public class Student extends Person{

    double gwa;

    Student(String firstName, String lastName, double gwa){
        super(firstName, lastName);
        this.gwa = gwa;
    }

    void showGWA(){
        System.out.println(this.firstName + "'s gwa is " + this.gwa);
    }

}
