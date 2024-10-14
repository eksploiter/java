// 문제 - 입출금 리팩토링
// 다음은 입금, 출금을 나타내는 코드이다.
// 입금(deposit)과 출금(withdraw)을 메서드로 만들어서 리팩토링 해보자.

package javaStart.method.ex;

public class MethodEx3 {
    public static void main(String[] ars) {
        int balance = 10000;

        // 입금 1000
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입급하였습니다. 현재 잔액: " + balance + "원");

        // 출금 2000
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        System.out.println("최종 잔액: " + balance + "원");
    }
}
