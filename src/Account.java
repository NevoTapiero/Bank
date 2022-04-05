public class Account {
    int accountNum;
    String ownerName;
    double balance;
    public Account(int accountNum, String ownerName, double balance){
        this.accountNum = accountNum;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
}

