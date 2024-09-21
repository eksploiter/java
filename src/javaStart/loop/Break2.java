// for 문2
// for 문 구조
// for (초기식; 조건식; 증감식) {
//      // 코드
// }
// for 문에서 초기식, 조건식, 증감식은 선택이다. 다음과 같이 생략해도 된다. 단 생략해도 각 영역을 구분하는 세미콜론(;)은 유지해야한다.

// 문제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?

package javaStart.loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ; ) { // while(true)와 같다.
            sum += i; // sum = sum + i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum= " + sum);
                break;
            }
            i++;
        }
    }
}

// for 문은 증가하는 값이 무엇인지 초기식과 증감식을 통해서 쉽게 확인할 수 있다.
// 이 코드나 while 문을 보면 어떤 값이 반복해서 사용되는 증가 값인지 즉시 확인하기는 어렵다.
// 여기서 i가 증가하는 값이다. 따라서 다음과 같이 i를 for 문에 넣어서 관리하도록 변경하면 더 깔끔한 코드가 된다. (Break3)
