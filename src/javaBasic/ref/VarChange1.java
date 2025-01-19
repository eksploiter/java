/// 기본형 vs 참조형 - 변수 대입
/// **대원칙: 자바는 항상 변수의 값을 복사해서 대입한다!!**
// 자바에서 변수에 값을 대입하는 것은 변수에 들어있는 값을 복사해서 대입하는 것이다.
// 기본형 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다.
// 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입하고, 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.

// 이 대원칙을 이해하면 복잡한 상황에서도 코드를 단순하게 이해할 수 있다.

// 기본형 대입
/// int a = 10;
/// int b = a;

// 참조형 대입
/// Student a1 = new Student();
/// Student a2 = a1;

// 기본형은 변수에 값을 대입하더라도 실제 사용하는 값이 변수에 바로 들어있기 때문에 해당 값만 복사해서 대입한다고 생각하면 쉽게 이해할 수 있다.
/// 그런데 참조형의 경우 실제 사용하는 객체가 아니라 위치를 가리키는 참조값만 복사된다.
// 쉽게 이야기 해서 실제 건물 복사가 아니라 건물의 위치인 주소만 복사되는 것이다.
// 따라서 같은 건물을 찾아갈 수 있는 방법이 하나 늘어날 뿐이다.

// 구체적인 예시를 통해서 변수 대입시 기본형과 참조형의 차이를 알아보자

/// 기본형과 변수 대입
// 다음 코드를 보고 어떤 결과가 나올지 먼저 생각해보자.
// 너무 쉽고 당연한 내용이지만, 이후 나올 참조형과 비교를 위해서 다시 한번 정리해보자.

package javaBasic.ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}