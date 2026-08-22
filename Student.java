public class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor: Name"+ name + "Age:" + age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: Name" + name + "Age:" + age);
    }

    Student(Student s ) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor: Name:" + name + "Age:" + age);

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John",20);
        Student s3 = new Student(s2);
    }
}
