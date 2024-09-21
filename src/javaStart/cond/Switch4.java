// 자바 14 새로운 switch 문
// switch 문은 if 문 보다 조금 덜 복잡한 것 같지만, 그래도 코드가 기대보다 깔끔하게 나오진 않는다.
// 이런 문제를 해결하고자 자바 14부터는 새로운 switch 문이 정식 도입되었다.

package javaStart.cond;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 0;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}

// 기존 switch 문과 차이는 다음과 같다.
// -> 를 사용한다.
// 선택된 데이터를 반환할 수 있다.

// 새로운 switch 문은 더 많은 내용을 담고 있다. 지금 이해하기에 어려운 내용들이 있으므로, 자세한 내용은 별도로 다룬다.
