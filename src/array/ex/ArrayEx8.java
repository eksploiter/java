// 문제 - 2차원 배열 2
// 이전 문제에서 학생 수를 입력받도록 개선하자.

package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int n = scanner.nextInt();
        int[][] scores = new int[n][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = (double) total / 3;
            System.out.println((i+1) + "번 학생 총점: " + total + ", 평균: " + average);
        }
    }
}
