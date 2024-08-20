// switch 문
// 문제
// 당신은 회원 등급에 따라 쿠폰을 발급하는 프로그램을 작성해야한다.
// 이 프로그램은 int grade 라는 변수를 사용하며, 회원 등급(garde)에 따라 다음의 쿠폰을 발급해야 한다.

// - 1등급: 쿠폰 1000
// - 2등급: 쿠폰 2000
// - 3등급: 쿠폰 3000
// - 위의 등급이 아닐 경우: 쿠폰 500

// 각 쿠폰이 할당된 후에는 "발급받은 쿠폰 " + 쿠폰 값을 출력해야 한다.
// 2등급 사용자 출력 예)
// 발급받은 쿠폰 2000

// * if 문 사용 *

package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}

// switch 문
// switch 문은 앞서 배운 if 문을 조금 더 편리하게 사용할 수 있는 기능이다.
// 참고로 if 문은 비교 연산자를 사용할 수 있지만, switch 문은 단순히 값이 같은지만 비교할 수 있다.

// switch 문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다.
