package javaBasic.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        bk.deposit(10000);
        bk.withdraw(3000);
        System.out.println("balance = " + bk.getBalance());
    }
}
