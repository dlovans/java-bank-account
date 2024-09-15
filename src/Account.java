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
}
