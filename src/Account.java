/**
 * Represents a bank account.
 */
public class Account {
    /**
     * Bank account balance.
     */
    private double balance;

    /**
     * Creates an instance with default value.
     */
    Account() {
        balance = 0;
    }

    /**
     * Creates an instance with specified value.
     * @param balance - Balance in bank account.
     */
    Account(double balance) {
        this.balance = balance;
    }

    /**
     * Withdraws funds from account.
     * @param amount - Amount to be withdrawn from account.
     * @return - Status message.
     */
    public String withdraw(double amount) {
        if (amount > balance) {
            return "Insufficient Funds";
        } else {
            balance -= amount;
            return "Withdrawn";
        }
    }

    /**
     * Deposits funds into account.
     * @param amount - Amount to be deposited into account.
     */
    public void deposit(double amount) {
        balance += amount;
    }
}
