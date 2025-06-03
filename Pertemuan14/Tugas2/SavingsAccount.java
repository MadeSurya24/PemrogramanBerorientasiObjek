package Pertemuan14.Tugas2;

// Error: Cannot override final method from BankAccount
/*
public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Info:");
        super.displayAccountInfo(); // ERROR karena method final
    }
}
*/

// Penanganan alternatif: buat method tambahan khusus
public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public void showDetailedInfo() {
        System.out.println("[Savings Account]");
        super.displayAccountInfo();
    }
}

