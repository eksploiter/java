// 문제와 풀이3
// 문제 - 이름과 나이 반복
// - 사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요.
// 사용자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.

package Start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) { // String 에는 "==" 이거 안 쓴다!! .equals 기억!
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt(); // 10\n
            scanner.nextLine(); // * 숫자 입력 후의 줄바꿈 처리 * 이 문장을 작성하고 오류가 없어짐
            // \n를 while 문을 다시 돌기 전에 미리 읽어준다. (쉽게 말해 엔터를 읽고 버려준다.)
            // 이게 없으면 String name = Start.scanner.nextLine(); 여기서 빈 공백을 입력으로 받아들인다.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }

        scanner.close();
    }
}
