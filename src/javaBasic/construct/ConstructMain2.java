// 생성자 - 오버로딩과 this()
// 생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 여러 생성자를 제고할 수 있다.

package javaBasic.construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);
        // 새로 추가한 생성자는 grade 를 받지 않는다. 대신에 grade 는 50점이 된다.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}

// 생성자를 오버로딩 한 덕분에 성적 입력이 꼭 필요한 경우에른 grade 가 있는 생성자를 호출하면 되고.
// 그렇지 않은 경우에는 grade 가 없는 생성자를 호출하면 된다.
// grade 가 없는 생성자를 호출하면 성적은 50점이 된다.
