interface Bank {
    void deposit(double amount);

    void withdraw(double amount);
}

class SavingsAccount implements Bank {
    double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit $" + amount + " into Savings Account. New Balance:$" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from Savings Account. New Balance:$" + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

}

class CurrentAccount implements Bank {
    double balance;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit $" + amount + " into Current Account. New Balance:$" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from Current Account. New Balance:$" + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

public class BankDetails {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        CurrentAccount ca = new CurrentAccount(2050);
        System.out.println("__SAVINGS_ACCOUNT__");
        sa.deposit(500);
        sa.withdraw(200);
        System.out.println("__CURRENT_ACCOUNT__");
        ca.deposit(1000);
        ca.withdraw(500);

    }

}
