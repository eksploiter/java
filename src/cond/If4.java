// if 문2 - else if

// 문제
// 당신은 연령에 따라 다른 메시지를 출력하는 프로그램을 작성해야한다.
// 이 프로그램은 int age 라는 변수를 사용해야 하며, 연령에 따라 다음의 출력을 해야 한다.

// 7세 이하일 경우: "미취학"
// 8세 이상, 13세 이하일 경우: "초등학생"
// 14세 이상, 16세 이하일 경우: "중학생"
// 17세 이상, 19세 이하일 경우: "고등학생"
// 20세 이상일 경우: "성인"

package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 26;

        if (age <= 7) { // ~7: 미취학
            System.out.println("미취학");
        } else if (age <= 13) { // 8 ~ 13: 초등학생
            System.out.println("초등학생");
        } else if (age <= 16) { // 14 ~ 16: 중학생
            System.out.println("중학생");
        } else if (age <= 19) { // 17 ~ 19: 고등학생
            System.out.println("고등학생");
        } else { // 20 ~: 성인
            System.out.println("성인");
        }
    }
}
