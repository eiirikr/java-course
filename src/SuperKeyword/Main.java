package SuperKeyword;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jeric", "Javier");
        Student student = new Student("Jeric", "Javier", 1.5);
        Employee employee = new Employee("Jeric", "Javier", 50_000);

        person.showName();
        student.showGWA();
        employee.showSalary();

    }
}
