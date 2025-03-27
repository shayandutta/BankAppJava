class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            System.out.println("Withdrawal successful: Rs." + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}
