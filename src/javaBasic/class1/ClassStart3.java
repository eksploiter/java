// 이제 학생 클래스를 사용하는 코드를 작성해보자.

package javaBasic.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 학생을 실제 메모리에 만든다. -> 붕어빵
        // x001 (예시 값)
        student1.name = "학생1"; // 클래스에서는 .을 통해서 접근할 수 있다.
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student(); // -> 붕어빵
        // x002 (예시 값)
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.score);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.score);
    }
}

// 클래스와 사용자 정의 타입
// - 타입은 데이터의 종류나 형태를 나타낸다.
// - int 라고 하면 정수 타입, String 이라고 하면 문자 타입이다.
// - 학생(Student)이라는 타입을 만들면 되지 않을까?
// - 클래스를 사용하면 int, String 과 같은 타입을 직접 만들 수 있다.
// - 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 "설계도가 바로 *클래스*"이다.
// - 설계도인 클래스를 사용해서 **실제 메모리에 만들어진 실체를 객체 또는 인스턴스**라 한다.
// -> 예시 붕어빵! - 붕어빵 틀은 설계도! 붕어빵이 객체! 또는 인스턴스!!
// - 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.

// 용어: 클래스, 객체, 인스턴스
// 클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
// 둘 다 같은 의미로 사용된다.
// 여기서는 학생(Student) 클래스 기반으로 학생1(student1), 학생2(student2) 객체 또는 인스턴스를 만들었다.
// **클래스라는 설계도를 기반으로 new 를 이용해 새로운 인스턴스를 만들어낸다.**

// 참조값을 변수에 보관해야 하는 이유
// 객를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다.
// 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다.
// 따라서 생성한 객체에 접근할 수 있는 방법이 필요하다.
// 이런 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 한다.
// 앞서 Student student1 변수에 참조값(x001)을 저장해두었으므로 저장한 참조값(x001)을 통해서 실제 메모리에 존재하는 객체에 접근할 수 있다.

// 지금까지 설명한 내용을 간단히 풀어보면 다음과 같다.
// Student student1 = new Student(); // 1. Student 객체 생성
// Student student1 = x001; // 2. new Student()의 결과로 x001 참조값 반환
// student1 = x001; // 3. 최종 결과

//