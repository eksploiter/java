// 문제와 풀이 1
// 문제 - 배열을 사용하도록 변경
// 다음 문제를 배열을 사용해서 개선하자.

package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};

        int total = 0;
        // double average = 0;
        for (int i = 0; i < student.length; i++) {
            total += student[i];
        }

        double average = (double) total / student.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
