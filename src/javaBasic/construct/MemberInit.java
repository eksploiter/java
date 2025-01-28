// 생성자 - 필요한 이유
// 객체를 생성하는 시점에 어떤 닥업을 하고 싶다면 생성자(Constructor)를 이용하면 된다.
// 생성자를 알아보기 전에 먼저 생성자가 왜 필요한디 코드로 간단히 알아보자.

package javaBasic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = grade;
        this.grade = grade;
    }
}
