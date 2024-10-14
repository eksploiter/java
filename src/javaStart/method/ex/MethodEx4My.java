// 문제와 풀이2

// 문제 - 은행 계좌 입출금
// - 다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
//   또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자.
// - 출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.

package javaStart.method.ex;

import java.util.Scanner;

public class MethodEx4My {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        int amount;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");

            int T = scanner.nextInt();

            if (T == 1) {
                System.out.println("선택: 1");
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = deposit(balance, amount);
            } else if (T == 2) {
                System.out.println("선택: 2");
                System.out.println("출금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (T == 3) {
                System.out.println("선택: 3");
                System.out.println("현재 잔액: " + balance + "원");
            } else if (T == 4) {
                System.out.println("선택: 4");
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 선택지를 선택해주세요.");
            }
        }

    }

    public static int deposit(int balance, int amount) { // 입금 메서드
        balance += amount;
        System.out.println(balance + "원을 입금하셨습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) { // 출금 메서드
        if (balance >= amount) {
            balance -= amount;
            System.out.println(balance + "원을 출금하셨습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
