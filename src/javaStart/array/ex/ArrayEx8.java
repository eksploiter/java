// 문제 - 2차원 배열 2
// 이전 문제에서 학생 수를 입력받도록 개선하자.

package javaStart.array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: "); // ArrayEx7과 다른 곳이다. 나머지는 같다.
        int N = scanner.nextInt();

        int[][] score = new int[N][3];
        String[] subject  = {"국어", "영어", "수학"};

        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < score.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += score[i][j];
            }
            double average = (double) total / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
