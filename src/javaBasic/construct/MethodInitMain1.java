package javaBasic.construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit mi1 = new MemberInit();
        mi1.name = "user1";
        mi1.age = 15;
        mi1.grade = 90;

        MemberInit mi2 = new MemberInit();
        mi2.name = "user2";
        mi2.age = 16;
        mi2.grade = 80;

        MemberInit[] members = {mi1, mi2};

        for( MemberInit m : members ) {
            System.out.println("이름: " + m.name + ", 나이: " + m.age + ", 성적: " + m.grade);
        }
    }
}

// 회원 객체를 생성히고 나면 name, age, grade 같은 변수에 초기값을 설정한다. 아마도 회원 객체를 제대로 사용하기 위해서는
// 객체를 생성하자 마자 이런 초기값을 설정해야 할 것이다. 이 코드는 회원의 초기값을 설정하는 부분이 계속 반복된다.
// 메서드를 사용해서 반복을 제거해보자.