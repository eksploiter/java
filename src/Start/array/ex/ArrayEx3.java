// 문제와 풀이 1
// 문제 - 배열과 역순 출력
// 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
// 출력시 출력 포멧은 5, 4, 3, 2, 1과 같이 , 쉽표를 사용해서 구분하고, 마지막에는 쉽표를 넣지 않아야 한다.

package Start.array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력: "); // * 너무 어렵게 생각하지 말자 *
        // 배열의 인덱스를 역순으로 4, 3, 2, 1, 0
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) { // 마지막인 0번째를 제외하고 콤마를 붙인다.
                System.out.print(",");
            }
        }
        scanner.close();
    }
}
