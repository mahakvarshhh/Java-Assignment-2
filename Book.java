import java.util.Scanner;

public class main {
    public static void main (String [] args ) {
        Book b1 = new Book();
        b1.set();
    }
}
class Book {
    String title;
    String author;
    float price;

    void set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Title:");
        title = sc.nextLine();
        System.out.println("Enter Author:");
        author = sc.nextLine();
        System.out.println("Enter Price:");
        price = sc.nextFloat();
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

