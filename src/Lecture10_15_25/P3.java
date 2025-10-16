package Lecture10_15_25;

public class P3 {

    public static class BankAcc {
        private long accNo;
        private String accHolder;
        private double balance;

        private static int totalAcc = 0;

        // Default Constructor
        public BankAcc() {
            this(0, "N/A", 0.0);
        }

        // Parameterized Constructor
        public BankAcc(long accNo, String accHolder, double balance) {
            this.accNo = accNo;
            this.accHolder = accHolder;
            this.balance = (balance < 0) ? 0.0 : balance;
            totalAcc++;
        }

        // Copy Constructor
        public BankAcc(BankAcc other) {
            this.accNo = other.accNo;
            this.accHolder = other.accHolder + " (Copy)";
            this.balance = other.balance;
            totalAcc++;
        }

        // Deposit Method
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("\nDeposit successful: $" + amount + " added.");
                display();
            } else {
                System.out.println("\nError: Deposit amount must be positive.");
            }
        }

        // Withdraw Method
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("\nError: Withdrawal amount must be positive.");
            } else if (amount > this.balance) {
                System.out.println("\nError: Insufficient balance. Available balance: $" + this.balance);
            } else {
                this.balance -= amount;
                System.out.println("\nWithdrawal successful: $" + amount + " debited.");
                display();
            }
        }

        // Display Method
        public void display() {
            System.out.println("Account No: " + this.accNo);
            System.out.println("Account Holder: " + this.accHolder);
            System.out.println("Current Balance: " + this.balance);
            System.out.println("Total Bank Accounts: " + totalAcc);
        }

        public static void displayTotalAccounts() {
            System.out.println("\nTotal Bank Accounts: " + totalAcc);
        }
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {

        BankAcc acc1 = new BankAcc(1001, "Alice Smith", 500.75);

        BankAcc acc2 = new BankAcc();

        BankAcc acc3 = new BankAcc(acc1);

        acc1.deposit(150.25);

        acc1.withdraw(50.0);

        acc3.withdraw(1000.0);

        BankAcc.displayTotalAccounts();
    }
}