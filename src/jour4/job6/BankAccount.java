package src.jour4.job6;

public class BankAccount {
    private int balance;

    public BankAccount(int defBalance) {
        this.balance = defBalance;
    }

    public void Withdraw(int value) {
        this.balance -= value;
    }

    public int GetBalance() {
        return this.balance;
    }
}
