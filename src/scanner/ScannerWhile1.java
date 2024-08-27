// Scanner - 반복 예제
// 우리가 지금까지 개발한 프로그램들은 단 한 번의 결과 출력 후 종료되는 일회성 프로그램이었다.
// 실제 프로그램들은 이렇게 한 번의 결과만 출력하고 종료되지 않는다.
// 한 번 실행하면 사용자가 프로그램을 종료할 때 까지 반복해서 실행된다.
// 이제부터는 사용자의 입력을 지속해서 받아들이고, 반복해서 동작하는 프로그램을 개발해보자.

// Scanner 와 반복문을 함께 사용하면 된다.

// Scanner 반복 예제1
// - 사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어보자.
// - exit 이라는 문자가 입력되면 프로그램을 종료한다.
// - 프로그램은 반복해서 실행된다.

package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요.(exit: 종료): ");
            String str = scanner.nextLine();
            if (str.equals("exit")) { // 기억하자. String 에는 "==" 가 아닌 ".equals" 라는 사실을!
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력한 문자열: " + str);
        }

        scanner.close();
    }
}

// while (true): 중간에 break 문을 만나기 전까지 무한 반복된다.
// if (true) {
//      System.out.println("프로그램을 종료합니다.");
//      break;
// }
// 입력받은 문자가 "exit" 이면 "프로그램을 종료합니다."를 출력하고 break 문을 통해서 while 문을 빠져나간다.
