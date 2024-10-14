package javaStart.method.ex;

// * 중간에 헷갈려서 보고 품 *

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}

// 리팩토링 결과를 보면 main()은 세세한 코드가 아니라 전체 구조를 한눈에 볼 수 있게 되었다.
// 쉽게 이야기해서 책의 목차를 보는 것과 같다. 더 자세히 알고 싶으면 해당 메서드를 찾아서 들어가면 된다.
// 그리고 입금과 출금 부분이 메서드로 명확하게 분리되었기 때문에 이후 변경 사항이 발생하면 관련된 메서드만 수정하면 된다.
// 특정 메서드로 수정 범위가 한정되기 때문에 더 유지보수 하기 좋다.
// 이런 리팩토링을 메서드 추출(Extract Method)이라 한다. 메서드를 재사용하는 목적이 아니어도 괜찮다.
// 메서드를 적절하게 사용해서 분류하면 구조적으로 읽기 쉽고 유지보수 하기 좋은 코드를 만들 수 있다.
// 그리고 메서드의 이름 덕분에 프로그램을 더 읽기 좋게 만들 수 있다.
