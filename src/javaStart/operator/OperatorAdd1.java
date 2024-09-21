// 증감 연산자

package javaStart.operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); // a = 1
        a = a + 1;
        System.out.println("a = " + a); // a = 2

        // 증감 연산자
        ++a; // a = a + 1
        System.out.println("a = " + a); // a = 3
        ++a; // a = a + 1
        System.out.println("a = " + a); // a = 4
    }
}

// a = 0
// a = a + 1
// a = 0 + 1 // 변수 a의 값 확인(0)
// a = 1

// a = a + 1을 ++a 로 간단히 표현할 수 있는 것이 바로 증감 연산자이다.
// 정리하면 해당 변수에 들어있는 숫자 값을 하나 증가시키는 것이다.
