// 문제와 풀이 1
// 문제 - 배열을 사용하도록 변경
// 다음 문제를 배열을 사용해서 개선하자.

package Start.array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열이기 때문에 보통 변수명을 복수로 만든다.

        int total = 0;
        for (int student : students) {
            //for (int i = 0; i < students.length; i++) 에서 향상된 for 문으로 바꿈
            total += student;
        }

        double average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
