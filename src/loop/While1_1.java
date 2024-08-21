// 반복문 시작
// 반복문은 이름 그대로 특정 코드를 반복해서 실행할 때 사용한다.
// 자바는 다음 3가지 종류의 반복문을 제공한다.

// while, do-while, for

// 먼저 간단한 예제를 통해 반복문이 왜 필요한지 이유를 알아보자.
// 1을 한 번씩 더해서 총 3번 더하는 간단한 코드를 만들어보자.

package loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);
    }
}

// 단순히 count 에 값을 1씩 3번 더하는 단순한 예제이다. 최종 결과는 3이다.

// count = count + 1은 증감 연산자(++)를 사용해서 다음과 같이 개선할 수 있다.
// 개선
// count++;
// System,out.println("현재 숫자는: " + count);
// count++;
// System,out.println("현재 숫자는: " + count);
// count++;
// System,out.println("현재 숫자는: " + count);

// 하지만 같은 코드가 3번 반복되고 있다. 이번에는 1을 한 번씩 더해서 총 100번 더하는 코드를 만들어보자
// 아마도 직접 작성한다면 같은 코드가 100번 반복될 것이다.
// 이렇게 특정 코드를 반복해서 실행될 때 사용하는 것이 바로 반복문이다.
// 반복문에는 while, for 문이 있다. 먼저 while 문부터 알아보자.