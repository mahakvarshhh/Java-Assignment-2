import java.util.Scanner;
public class BankAccount {
    private int accountNumber;
    private float balance;
    float amount;
    float withdraw;
    float depositBalance;
    float withrawBalance;

    Scanner sc = new Scanner(System.in);
    void set(){
        System.out.println("Enter Account Number:");
        accountNumber = sc.nextInt();
        System.out.println("Enter Balance:");
        balance = sc.nextFloat();
    }

    void deposit(){
        System.out.println("Deposit Amount:");
        amount = sc.nextFloat();
        depositBalance = amount + balance;
    }

    void withdraw() {
        System.out.println("Enter Withdraw Amount:");
        withdraw = sc.nextFloat();
        withrawBalance = depositBalance - withdraw;
    }

    void display(){
        System.out.println("Deposit Successful. Current Balance:"+depositBalance );
        System.out.println("Withdraw Successful.Remaning Balance:"+withrawBalance );
    }
    public static void main (String[] args ) {
        BankAccount ba = new BankAccount();
        ba.set();
        ba.deposit();
        ba.withdraw();
        ba.display();
    }

}
