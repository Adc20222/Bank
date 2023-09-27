import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Enter account holder name: ");
        String accountHolderName = scanner.next();

        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);

        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount of money to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    System.out.println("Amount deposited successfully!");
                    break;
                case 2:
                    System.out.println("Enter amount of money to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your account balance is: " + bankAccount.checkBalance());
                    break;
                case 4:
                    System.out.println("You Have Exited!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 4);
    }
}
