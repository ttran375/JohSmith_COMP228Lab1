package lesson2ex3;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String name, double balance, double overdraftLimit) {
        super(name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > getBalance() + overdraftLimit) {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        } else {
            super.withdraw(withdrawAmount);
        }
    }
}
