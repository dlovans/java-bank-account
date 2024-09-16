import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account;
        double balance;
        String name;

        System.out.println("Enter balance amount: ");
        balance = input.nextDouble();
        input.nextLine();

        System.out.println("Enter account owner name: ");
        name = input.nextLine();

        account = new Account(balance, name);

        System.out.println(account);

        account.deposit(500);
        System.out.println(account);
        account.withdraw(100);
        System.out.println(account);
        account.setName("llama");
        System.out.println(account);
    }
}