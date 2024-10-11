// 메서드 호출과 값 전달2
// 메서드 호출과 이름이 같은 변수
// 같은 문제를 호출자의 변수 이름과 매개변수의 이름을 *같게* 해서 한번 더 풀어보자 (헷갈리게)

// * 자바는 항상 변수의 값을 복사해서 대입한다. *

package javaStart.method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5
        changeNumber(number); // -> changeMethod 로 이동

        System.out.println("4. changeNumber 호출 후, number: " + number); // 5
        // 하지만 number 는 기존의 5값을 그대로 유지
    }

    public static void changeNumber(int number) { // 5
        System.out.println("2. changeNumber 변경 전, number: " + number); // 5
        number = number * 2; // 10
        System.out.println("3. changeNumber 변경 후, number: " + number); // 10
        // changeNumber 의 number 를 바꾼 것이지, main 의 number 를 바꾼 것이 아니다.
    }
}

// 이번에는 main()에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 같다. 둘 다 number 로 같다.

// 실행 결과
// 1. changeNumber 호출 전, number: 5
// 2. changeNumber 변경 전, number: 5
// 3. changeNumber 변경 후, number: 10
// 4. changeNumber 호출 후, number: 5

// main() 도 사실은 메서드이다. 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
// 물론 이름이 같아도 완전히 다른 변수다. (완전 다른 영역에서 생성이 된 것, 다른 공간에서 생성되는 지역변수)
// 따라서 main()의 number 와 changeNumber()의 number 는 서로 다른 변수이다.
