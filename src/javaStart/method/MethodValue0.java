// 메서드 호출과 값 전달1
// 지금부터 자바에서 아주 중요한 대원칙 하나를 이야기하겠다.밑줄 100번 긋자!!
// * 자바는 항상 변수의 값을 복사해서 대입한다. *
// * 자바는 항상 변수의 값을 복사해서 대입한다. *
// 이 대원칙은 반드시 이해해야 한다. 그러면 아무리 복접한 상황에도 코드를 단순하게 이해할 수 있다.

// 변수와 값 복사
// 다음 코드를 보고 어떤 결과가 나올지 먼저 생각해보자.

package javaStart.method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

// 실행 과정
// int num2 = num1; // num1의 값은 5이다. num1(5)
// int num2 = 5; // num2 변수에 대입하기 전에 num1의 값 5를 읽는다. num1(5), num2(5)
// num2 = 10 // num2에 10을 대입한다. 결과: num1(5), num2(10)

// 여기서 값을 복사해서 대입하는 부분이 바로 이 부분이다.
// int num2 = num1;
// - 이 부분을 생각해보면 num1에 있는 값 5를 복사해서 num2에 넣는 것이다.
//      - 복사한다고 표현하는 이유는 num1의 값을 읽어도 num1에 있는 기존 값이 유지되고,
//        새로운 값이 num2에 들어가기 때문이다. 마치 num1의 값이 num2에 복사가 된 것 같다.
//      - num1이라는 변수 자체가 num2에 들어가는 것은 아니다. num1에 들어있는 값을 읽고 *복사*해서 num2에 넣는 것이다.
//      - 간단하게 num1에 있는 값을 num2에 대입한다고 표현한다. 하지만 실제로는 그 값을 복사해서 대입하는 것이다.
//      - 그러므로 num1과 num2와는 아무런 관계가 없다.

// 너무나 당연한 이야기를 왜 이렇게 장황하게 풀러서 하지? 라고 생각한다면 이제 진짜 문제를 만나보자.
