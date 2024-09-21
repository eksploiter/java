// break, continue
// break, continue 는 반복문에서 사용할 수 있는 키워드이다.
// break 은 반복문을 즉시 종료하고 나간다. continue 는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용된다.
// 참고로 while, do-while, for 와 같은 반복문에서 사용할 수 있다.

// * break
// while(조건식) {
//  코드1;
//  break; // 즉시 while 문 종료로 이동한다.
//  코드2;
// }
// while 문 종료 -> break 을 만나면 코드2가 실행되지 않고 while 문이 종료된다.

// * continue
// while(조건식) {
//  코드1;
//  continue; // 즉시 조건식으로 이동한다.
//  코드2;
// }
// continue 를 만나면 코드2가 실행되지 않고 다시 조건식으로 이동한다. 조건식이 참이면 while 문을 실행핸다.

// 예제를 통해 알아보자.

// 문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?

package Start.loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) { // -> 무한 반복
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
                break; // 무조건!
            }
            i++;
        }
    }
}

// 조건식을 잘 보면 true 라고 되어있다. 조건이 항상 참이기 때문에 이렇게 두면 while 문은 무한 반복된다.
// 물론 break 문이 있기 때문에 중간에 빠져나올 수 있다.
// 만약 sum > 10 조건을 만족하면 결과를 출력하고, break 을 사용해서 while 문을 빠져나간다.
