import java.util.Scanner;

public class Person {
    String name;
    byte age;
    String empId;
    float salary;

    static Scanner sc = new Scanner(System.in);

    Person() {

        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextByte();
        sc.nextLine();   // clears leftover Enter
    }

}
class Employee extends Person {

    Employee() {
        System.out.println("Enter EmployeeID:");
        empId = sc.nextLine();
        System.out.println("Enter Salary:");
        salary = sc.nextFloat();
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("EmployeeID:" + empId);
        System.out.println("Salary:" + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();

    }
}
