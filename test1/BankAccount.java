package test1;

public class BankAccount {
    private int account;
    private int balance;

    public BankAccount() {
    }

    public BankAccount(int account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(int money) {
        balance += money;
    }

    //取款
    public void withdraw(int money) {
        balance -= money;
    }

    //查询余额
    public int inquiry() {
        return balance;
    }
}
