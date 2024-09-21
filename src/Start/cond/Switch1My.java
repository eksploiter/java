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

package Start.cond;

public class Switch1My {
    public static void main(String[] args) {
        int grade = 2;
        int coupon = 0;

        if (grade == 1) {
            coupon = coupon + 1000; // 그냥 -> coupon = 1000;
            System.out.println("발급받은 쿠폰 " + coupon);
        } else if (grade == 2) {
            coupon = coupon + 2000;
            System.out.println("발급받은 쿠폰 " + coupon);
        } else if (grade == 3) {
            coupon = coupon + 3000;
            System.out.println("발급받은 쿠폰 " + coupon);
        } else {
            coupon = coupon + 500;
            System.out.println("발급받은 쿠폰 " + coupon);
        }
    }
}

// 내가 한 풀이 - 불필요한 요소가 너무 많이 들어갔다.
