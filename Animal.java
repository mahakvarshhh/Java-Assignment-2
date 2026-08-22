import java.util.Scanner;

public class Animal {
    String dogName;

    Scanner sc = new Scanner(System.in);

    Animal(){
        System.out.println("Enter Dog Name:");
        dogName = sc.nextLine();
    }

    void setdogName(){
        System.out.println("Dog name:" +dogName);
    }
}

class Mammal extends Animal {
    String animalType = "Mammal";


    void setanimalType(){
        System.out.println("AnimalType:" + animalType);
    }
}

class Dog extends Mammal {
    String breed;

    Dog(){
        System.out.println("Enter Breed:");
        breed =sc.nextLine();
    }

    void setbreed(){
        System.out.println("Breed:" + breed);
    }


    public static void main(String[] args){
        Dog dg= new Dog();
        dg.setdogName();
        dg.setbreed();
        dg.setanimalType();
    }
}
