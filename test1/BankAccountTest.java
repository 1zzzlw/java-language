package test1;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(123456, 5000);
        //存款
        ba.deposit(1000);
        //取款
        ba.withdraw(2000);
        //查询余额
        int balance = ba.inquiry();
        System.out.println("余额为：" + balance);
    }
}
