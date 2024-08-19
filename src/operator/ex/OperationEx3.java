// 문제3 - 합격 범위 *
// int 형 변수 score 를 선언하세요.
// score 가 80점 이상이고, 100점 이하면 true 를 출력하고, 아니면 false 를 출력하세요.

package operator.ex;

public class OperationEx3 {
    public static void main(String[] args) {
        int score = 85;

        boolean result = 80 <= score && score <= 100;
        System.out.println("result = " + result);
    }
}

// 정리
// 자주 사용하는 연산자
// - 산술 연산자: +, -, *, /, %(나머지)
// - 증가 및 감소 연산자: ++, --
// - 비교 연산자: ==, !=, <. > ,<=, >=
// - 논리 연산자: &&, ||, !
// - 대입 연산자: =, +=, -=, *=, /=, %=

// 다음 연산자들도 자주 사용하는데, 뒷 부분에서 학습한다.
// - 삼항 연산자: ? :
// - instanceof 연산자: 객체 타입을 확인한다.
// - 그 외: new, [] (배열 인덱스), .(객체 멤버 접근), ()(메소드 호출)

// 비트 연산자는 실무에서 거의 사용하지 않는다. 필요할 때 찾아보자
// - &, |, ^, ~, <<, >>, >>>
