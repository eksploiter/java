package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);   // 출력: a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);  // 출력: a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력: a * b = 10

        // 나눗셈
        int div = a / b; // -> 2.5 이지만 int 형이기 때문에 소수점 표현이 안된다.
        System.out.println("a / b = " + div);   // 출력: a / b = 2

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);   // 출력: a % b = 1
        // 나머지 연산자는 실무와 알고리즘 모두 종종 사용되므로 잘 기억해두자
    }
}

// 주의! 0으로 나누기
// 10 /0과 같이 숫자는 0으로 나눌 수 없다. (수학에서 허용하지 않음)
// 방금 예제에서 변수 b = 0 을 대입하면 5 / 0 이 된다. 이 경우 프로그램에 오류가 발생한다.
// 실행하면 다음과 같은 예외를 확인할 수 있다.
// 예외가 발생하면 해당 시점 이후의 결과가 출력되지 않고 프로그램이 종료된다. 예외에 대한 자세한 부분은 예외처리에서 다룬다.
