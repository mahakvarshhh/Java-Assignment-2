class Base{
    Base(){
        System.out.println("Base Class Constructor Called");
    }
}
public class Derived extends Base{
    Derived(){
        System.out.println("Derived Class Constructor Called");
    }

    public static void main(String[] args){
        Derived dr = new Derived();
    }
}
