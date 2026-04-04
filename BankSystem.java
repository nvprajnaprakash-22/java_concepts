
import java.util.Scanner;
public class BankSystem {
    static double balance = 1000.00; 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("--- Welcome to Bank ---");

        while (true) {
            System.out.println("\n1. Check Balance  2. Deposit  3. Withdraw  4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                showBalance();
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                deposit(amount);
            } else if (choice == 3) {
                System.out.print("Enter amount to Withdraw: ");
                double withdraw_amo = sc.nextDouble();
                Withdraw(withdraw_amo);
            } else if (choice == 4) {
                System.out.println("Thank you for using Our Bank!");
                break;
            }
        }
        sc.close();
    }

    public static void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited " + amount);
    }
    public static void Withdraw(double amount) {
        if(balance>=amount){
        balance -= amount;
        System.out.println("Successfully withdrawn " + amount);
        showBalance();
    }else{System.out.println("Insufficient balance");}

    }
}
