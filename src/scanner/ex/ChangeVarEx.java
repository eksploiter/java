// 문제와 풀이2
// 문제 - 변수 값 교환
// 변수 a = 10이 들어있고, b = 20이 들어있다.
// 변수 a의 값과 변수 b의 값을 서로 바꾸어라
// 다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다.
// 힌트: temp 뱐수를 활용해야 한다.

package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a; // temp = 10
        a = b;    // a = 20;
        b = temp; // b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// 풀이
// - a와 b를 한번에 서로 교환할 수는 없다.
// - a = b 라고 하면 a의 값인 10은 사라져버린다. 따라서 a, b 둘다 20이 돼버린다.
// - a = b 라고 하기 전에 a의 값을 어딘가에 보관해두어야 한다. 여기서는 임시로 사용할 변수인 temp 에 보관해두었다.
