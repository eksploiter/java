// 생성자 - 도입
// 프로그래밍을 하다보면객체를 생성하고 이후에 바로 초기값을 할당하는 경우가 많다.
// 따라서 initMember(...) 와 같은 메서드를 매번 만들어야 한다.
// 그래서 대부분의 객체지향 언어는 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록 생성자라는 기능을 제공한다.
// 생성자를 사용하면 객체를 생성하는 시점에 즉시 필요한 기능을 수행할 수 있다.
// 생성자는 앞서 살펴본 initMember(...) 와 같이 메서드와 유사하지만 몇가지 다른 특징이 있다.

package javaBasic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 중복 제거
        // 아래의 생성자로 값을 넘긴다.
    }
    // 기존 MemberConstruct 에 생성자를 하나 추가해서 생성자가 2개가 되었다.
    // 생성자 오버로딩

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    } // 이 부분이 바로 생성자이다.
}

// 갱성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
// - 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
// - 생성자는 반환 타입이 없다. 비워두어야 한다.
// - 나머지는 메서드와 같다.

// 생성자 호출
// 생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
// 생성자를 호출하는 방법은 다음 코드와 길이 new 명령어 다음에
// 생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.

// 참고로 new 키워드를 사용해서 객체를 생성할 때 마지막 괄호 () 도 포함해야 하는 이유가 바로 생성자 때문이다.
// 객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함한다.

// 생성지를 사용하면 필수값 입력을 보장할 수 있다.

// 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.

// 이때 this() 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
// 참고로 this 는 인스턴스 자신의 참조값을 가리킨다, 그래서 자신의 생성자를 호출한다고 생각하면 된다.
// 이 코드는 첫번째 생성자 내부에거 두번째 생성자를 호출한다.

// this() 규칙
// - this() 는 생성자 코드의 첫줄에만 작성할 수 있다.