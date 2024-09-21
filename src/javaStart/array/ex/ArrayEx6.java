// 문제와 풀이2
// 문제 - 가장 작은 수, 큰 수 찾기
// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.
// 실행 결과 예시를 참고하자.

package javaStart.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int max, min;

        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        min = max = numbers[0]; // * 이곳이 헷갈린다. *
        for (int i = 1; i < numbers.length; i++) {
            // 0번째 배열 항목을 넣어놨으므로 Start.loop 는 1번째부터 시작한다.
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
