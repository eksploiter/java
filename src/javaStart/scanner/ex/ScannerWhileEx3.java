package javaStart.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요.");
        // 반복문 예제1
        while (true) {
            input = scanner.nextInt(); // 스코프 확인. 바깥의 int input 을 while 문 안으로 넣어면 된다.
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }

        // 반복문 예제2
    /*

        while ((input = Start.scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
        // 이 문제에서 while 문은 주석으로 처리한 것 처럼 축약할 수 있다.
    */

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
