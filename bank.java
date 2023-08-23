import java.util.Scanner;

class BankAccount {
    String depositorName;
    long accountNumber;
    String accountType;
    double balanceAmount;
    static double interestRate = 0.05; // Static interest rate of 5%

    // Default constructor
    BankAccount() {
        depositorName = "Default";
        accountNumber = 0;
        accountType = "Savings";
        balanceAmount = 0.0;
    }

    // Parameterized constructor
    BankAccount(String name, long accountNumber, String type, double initialBalance) {
        depositorName = name;
        this.accountNumber = accountNumber;
        accountType = type;
        balanceAmount = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    void withdraw(double amount) {
        double minBalance = 1000.0; // Minimum balance requirement
        if (amount > 0 && (balanceAmount - amount) >= minBalance) {
            balanceAmount -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
        }
    }

    void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }

    static void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter depositor name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, accountType, initialBalance);
        account.displayInterestRate();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        account.display();
    }
}
