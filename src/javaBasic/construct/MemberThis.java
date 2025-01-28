// this 는 생략할 수 있다. 이 경우 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수다)를 먼저 찾고
// 없으면 그 다음으로 멤버변수를 찾는다. 멤버 변수도 없으면 오류가 발생한다.

package javaBasic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}

// 이렇게 이름이 다른 경우 this 가 생략 가능하다.
