// 자동 형변환
// int < long < double
// 메서드를 호출할 때 매개변수 값을 전달하는 것도 결국 변수의 값을 대입하는 것이다.
// 따라서 앞서 배운 자동 형변환이 그대로 적용된다.

package javaStart.method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}

// double 형 매개변수(파라미터)에 int 형 인수를 전달하는데 문제없이 잘 동작한다.

// 다음과 같이 자동 형변환이 동작한다.
// printNumber(number); // number 는 int 형 100
// printNumber(100); // 메서드에 호출하기 전에 number 변수의 값을 읽음

// void printNumber(double n = 100) // double 형 파라미터 변수 n에 int 형 값 100을 대입
// void printNumber(double n = (double) 100) // double 이 더 큰 숫자 범위이므로 자동 형변환 적용
// void printNumber(double n = 100.0) // 자동 형변환 완료

// 정리
// 메서드를 호출할 때는 전달하는 인수의 다입과 매개변수의 타입이 맞아야 한다.
// 단, 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다.
