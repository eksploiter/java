/// 기본형 vs 참조형1 - 시작
// 자바에서 참조형을 제대로 이해하는 것은 정말 중요하다.
// 지금까지 기본형과 참조형에 대해서 조금씩 보았다. 이번에는 기본형과 참조형에 대해서 더 깊이 알아보고 확실하게 정리해보자.

// 변수의 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류할 수 있다.
// 사용하는 값을 변수에 직접 넣을 수 있는 기본형, 이전에 본 Student student1과 같이 객체가 저장된 메모리의 위치를 가리키는 참조형으로 분류할 수 있다.
// - 기본형(Primitive Type): int, long, double, boolean 처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입을 기본형이라 한다.
// - 참조형(Reference Type): Student student1, int[] students 와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형이라 한다.
//   참조형은 객체 또는 배열에 사용된다.

// 쉽게 이야기해서 기본형 변수에는 직접 사용할 수 있는 값이 들어있지만 참조형 변수에는 위치(참조값)가 들어가 있다.
// 참조형 변수를 통해서 뭔가 하려면 결국 참조값을 통해 해당 위치로 이동해야 한다.

/// 기본형 vs 참조형 - 기본
// - 기본형은 숫자 10, 20과 같이 실제 사용하는 값을 변수에 담을 수 있다. 그래서 해당 값을 바로 사용할 수 있다.
// - 참조형은 실제 사용하는 값을 변수에 담는 것이 아니다. 이름 그대로 실제 객체의 위치(참조, 주소)를 저장한다. 참조형에는 객체와 배열이 있다.
//      - 객체는 .(dot)을 통해서 메모리 상에 생성된 객체를 찾아가야 사용할 수 있다.
//      - 베열은 [] 를 통해서 메모리 상에 생성된 배열을 찾아가야 사용할 수 있다.

/// 기본형 vs 참조혈 - 계산
// - 기본형은 들어있는 값을 그대로 계산에 사용할 수 있다.
//      - 더하고 빼고, 사용하고 등등,(숫자같은 것들은 바로 계산할 수 있음)
// - 참조형은 들어있는 참조값을 그대로 사용할 수 없다. 주소지만 가지고는 할 수 있는게 없다. 주소지에 가야 실체가 있다.
//      - 더하고 빼고 사용하고 못함! 참조값만 가지고는 할 수 있는 것이 없음!

/// Student s1 = new Student();
/// Student s2 = new Student();
/// s1 + s2 // 오류 발생
/// 참조형은 변수에 객체의 위치인 참조값이 들어있다, 참조값은 계산에 사용할 수 없다. 따라서 오류가 발생한다.

// 물론 다음과 같이 .을 통해 객체의 기본형 멤버변수에 접근한 경우 연산을 할 수 있다.
/// Student s1 = new Student();
/// s1.grade = 100;
/// Student s2 = new Student();
/// s2.grade = 90;
/// int sum = s1.grade + s2.grade; // 연산 가능

/// 쉽게 이해하는 팁
// 기본형을 제외한 나머지는 모두 참조형이다.
// - 기본형은 소문자로 시작한다. int, long, double, boolean 모두 소문자로 시작한다.
//      - 기본형은 자바가 기본으로 제공하는 데이터 타입이다. 이러한 기본형은 개발자가 새로 정의할 수 없다. 개발자는 참조인 클래스만 직접 정의할 수 있다.
// - 클래스는 대문자로 시작한다. Student
//      - 클래스는 모두 참조형이다.

/// 참고 - String
// 자바에서 String 은 특별하다. String 은 사실 클래스다. 따라서 참조형이다. 그런데 기본형처럼 문자 값을 바로 개입할 수 있다.
// 문자는 매우 자주 다루기 때문에 특별하게 편의 기능을 제공한다. String 에 대한 자세한 내용은 뒤에서 설명한다.

package javaBasic.ref;

public class VarChange {
}