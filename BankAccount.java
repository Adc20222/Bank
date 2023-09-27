

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + this.accountNumber +
                ", accountHolderName='" + this.accountHolderName + '\'' +
                ", balance=" + this.balance +
                '}';
    }
}