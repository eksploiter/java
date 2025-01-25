// 문제2 - 객체 지향 계좌
// 은행 계좌를 객체로 설계해야 한다.

package javaBasic.oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
