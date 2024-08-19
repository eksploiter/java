// 논리 연산자 활용

package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20보다 작다.
        boolean result = a > 10 && a < 20; // (a > 10) && (a < 20)
        System.out.println("result = " + result);
    }
}

// 참고로 다음과 같이 변수의 위치를 변경해도 결과는 같다.
// 범위를 나타내는 경우 이렇게 작성하면 코드를 조금 더 읽기 좋다.
// boolean result = 10 < a && a < 20;
