public class BankAccount {
    private final String accountHolder;
    private double balance;
    private boolean accountLocked = false;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if (accountLocked) {
            throw new IllegalStateException("Error: Account Locked! Please contact your account representative.");
        }
        if (depositAmount <= 0) {
            throw new IllegalArgumentException("Cannot deposit a value less than or equal to 0.");
        }
        else {
            this.balance += depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (accountLocked) {
            throw new IllegalStateException("Error: Account Locked! Please contact your account representative");
        }
        if (withdrawAmount > balance) {
            throw new IllegalArgumentException("Error, withdrawal of this amount will cause overdraft.");
        }
        if (withdrawAmount <= 0){
            throw new IllegalArgumentException("Cannot deposit a value less than or equal to 0.");
        }
        else {
            this.balance -= withdrawAmount;
        }
    }

    public void lockAccount() {
        this.accountLocked = true;
    }

    public void unlockAccount() {
        this.accountLocked = false;
    }

    public double getBalance() {
        return balance;
    }
}
