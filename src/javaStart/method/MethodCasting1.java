// 메서드와 형변환
// 메서드를 호출할 때도 형변환이 적용된다. 메서드 호출과 명시적 형변환, 자동 형변환에 대해 알아보자

// 명시적 형변환
// 메서드를 호출하는데 인자와 매개변수의 타입이 맞지 않는다면 어떻게 해야할까?
// 다음 예제 코드를 보자

package javaStart.method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); // double 을 int 형에 대입하므로 컴파일 오류
        printNumber((int) number); // 명시적 형변환을 사용해 double 을 int 로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}

// 먼저 주석으로 처리해둔 부분의 주석을 풀고 실행해보자
// printNumber(number) // double 을 int 형에 대입하므로 컴파일 오류

// 이 경우 메서드 호출이 꼭 필요하다면 다음과 같이 명시적 형변환을 사용해야 한다.
// printNumber((int) number); // 명시적 형변환을 사용해 double 을 int 로 변환
// printNumber(1); // (double) 1.5 -> (int) 1 로 변환
// void printNumber(int n = 1) // int 형 파라미터 변수 n에 int 형 1을 대입
