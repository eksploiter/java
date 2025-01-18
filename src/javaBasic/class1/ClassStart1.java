// 클래스가 필요한 이유
// 자바 세상은 클래스와 객체로 이루어져 있다. 그만큼 클래스와 객체라는 개념은 중요하다.
// 그런데 클래스와 객체는 너무 많은 내용을 포함하고 있어서 한번에 이해하기 쉽지 않다.
// 여기서는 클래스와 객체라는 개념이 왜 필요한지 부터 시작해서,
// 클래스가 어떤 방식으로 발전하면서 만들어졌는지 점진적으로 알아보겠다.

// 먼저 클래스가 왜 필요한지 이해하기 위해 다음 문제를 풀어보자
// 지금까지 학습한 내용을 기반으로 문제를 풀어보면 된다.

// 문제: 학생 정보 출력 프로그램 만들기
// 당신은 두 명의 학생 정보를 출력하는 프로그램을 작성해야 한다. 각 학생은 이름, 나이, 성적을 갖고있다.

// 요구사항:
// 1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
// 2. 주 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
// 3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: "이름: [이름] 나이: [나이] 성적: [성적]"
// 4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.

package javaBasic.class1;

//public class ClassStart1 {
//
//    public static void main(String[] args) {
//        String student1Name = "학생1";
//        String student2Name = "학생2";
//
//        int student1Age = 15;
//        int student2Age = 16;
//
//        int student1Score = 90;
//        int student2Score = 80;
//
//        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Score);
//        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + student2Score);
//    }
//}

public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + student2Grade);
    }
}

// 학생 두 명을 다루어야 하기 때문에 각각 다른 변수를 사용했다.
// 이 코드의 문제는 학생이 늘어날 때마다 변수를 추가로 선언해야 하고, 또 출력하는 코드도 추가해야 한다.
// 이런 문제를 어떻게 하면 해결할 수 있을까?
// 앞서 배운 배열을 사용하면 문제를 해걀할 수 있다.
