// 전위, 후위 증감 연산자

package Start.operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;
        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); // 결과: a = 2, b = 2

        // 후위 증감 연산자 사용 예
        a = 1; // a 값을 다시 1로 지정
        b = 0; // b 값을 다시 0으로 지정
        b = a++; // a의 현재값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); // 결과: a = 2, b = 1
    }
}

// (++a) == (a = a + 1)

// 증감 연산자가 변수 앞에 오는 경우를 전위 증감 연산자라고 하며, 이 경우에는 증감 연산이 먼저 수행된 후 나머지 연산이 수행된다.
// 증감 연산자가 변수 뒤에 오는 경우를 후위 증감 연산자라고 하며, 이 경우에는 다른 연산이 먼저 수행된 후 증감 연산이 수행된다.

// 가장 최근에 돌렸던 파일 확인: shift + F10
// 현재 파일 확인: Ctrl + shift + F10
