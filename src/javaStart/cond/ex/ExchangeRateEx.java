// 문제: "환율 계산하기"
// 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자. 환율은 1달러당 1300원이라고 가정하자.
// 다음과 같은 기준을 따른다.
// - 달러가 0미만이면: "잘못된 금액입니다."
// - 달러가 0일 떄: "환전할 금액이 없습니다."
// - 달러가 0초과일 때: "환점 금액은 (계산된 원화 금액)원입니다."

// 금액은 변수(int dollar)로 지정하고, 해당 변수를 기반으로 한국 원으로의 환점 금액을 출력하자.

package javaStart.cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 2;

        if (dollar < 0) {
            System.out.println("출력: 잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("출력: 환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("출력: 환점 금액은 " + won + "원입니다.");
            //System.out.println("출력: 환점 금액은 " + (dollar * 1300) + "원입니다.");
        }
    }
}
