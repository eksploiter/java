// 문제: 홀수 짝수 찾기
// 정수 x가 주어지면 x가 짝수이면 "짝수"를, x가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자.
// 삼할 연산자를 사용해야한다.

// 참고로 x % 2 를 사용하면 홀수, 짝수를 쉽게 계산할 수 있다.

package Start.cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 4;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
