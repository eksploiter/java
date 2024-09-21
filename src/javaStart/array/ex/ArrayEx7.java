// 문제 - 2차원 배열1
// 사용자로부터 4명의 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
// 2차원 배열을 사용해라.

package javaStart.array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) { // 행
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) { // 열
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) { // 이 Start.loop 한 번당 학생 한 명의 결과
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / 3;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
