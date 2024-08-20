// 문제: "학점 계산하기"
// 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
// - 90점 이상: "A"
// - 80점 이상 90점 미만: "B"
// - 70점 이상 80점 미만: "C"
// - 60점 이상 70점 미만: "D"
// - 60점 미만: "F"

// 점수는 변수 (int score)로 지정하고, 해당 변수를 기반으로 학점을 출력하자

package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 95;

        String credit;
        if (score >= 90) {
            credit = "A";
        } else if (score >= 80) {
            credit = "B";
        } else if (score >= 70) {
            credit = "C";
        } else if (score >= 60) {
            credit = "D";
        } else {
            credit = "F";
        }
        System.out.println("score: " + score);
        System.out.println("출력: 학점은 " + credit + "입니다." );
    }
}
