/// 참조형과 메소드 호출 - 활용

// 이전에 보았던 class1.ClassStart3 코드에는 중복되는 부분이 2가지 있다.
// name, age, grade 에 값을 할당
// 학생 정보 출력

// 이런 중복은 메서드를 통해 손쉽게 제거할 수 있다.

// 메서드에 객체 전달
// 다음과 같이 코드를 작성해보자.

package javaBasic.ref;

public class Student {
    String name;
    int age;
    int grade;
}

// - ref 패키지에도 Student 클래스를 만든다.
