// Scanner 학습
// 훈련 시작
// 지금까지 학습한 변수, 연산자, 조건문, 반복문은 프로그래밍의 가장 기본이 되는 기능이다.
// 대부분의 프로그램 언어는 이 기능을 필수로 가진다. 그리고 프로그래머가 하는 일의 대부분은 지금까지 설명한 변수, 연산자, 조건문, 반복문을 다루는 일이다.
// 그래서 이 기능을 다루는 것이 무엇보다 중요하다.
// 이번 시간에는 지금까지 배운 내용들을 훈련하는 시간이다.
// 여러분이 다음으로 나아가기 전에 최소한의 기본기를 훈련하는 시간으로 생각하자

// 지금까지 학습할 때 한가지 아쉬운 점이 있었는데, 바로 사용자의 입력이 없었다는 점이다.
// 이번 시간에는 사용자의 입력을 받는 방법을 배워서, 좀 더 그럴듯한 프로그램을 만들어보자.

// Scanner
// System.out 을 통해서 출력을 했듯이. System.in 을 통해서 사용자의 입력을 받을 수 있다.
// 그런데 자바가 제공하는 System.in 을 통해서 사용자 입력을 받으려면 여러 과정을 거쳐야해서 복잡하고 어렵다.
// 자바는 이런 문제를 해결하기 위해 Scanner 라는 클래스를 제공한다.
// 이 클래스를 사용하면 사용자 입력을 매우 편리하게 받을 수 있다.

package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 입력을 String 으로 가져옵니다.
        System.out.println("입력한 문자열: " + str);

        System.out.println("정수를 입력하세요: ");
        int intValue = scanner.nextInt(); // 입력을 int 로 가져옵니다.
        System.out.println("입력한 문자열: " + intValue);

        System.out.println("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble(); // 입력을 double 로 가져옵니다.
        System.out.println("입력한 문자열: " + doubleValue);
    }
}

// Scanner scanner = new Scanner(System.in);
// - 이 코드는 객체와 클래스를 배워야 정확히 이해할 수 있다. 지금은 Scanner 의 기능을 사용하기 위해 new 를 사용해서 Scanner 를 만든다 정도로 이해하면 된다.
// Scanner 는 System.in 을 사요애서 사용자의 입력을 편리하게 받도록 도와준다.
// - Scanner scanner 코드는 scanner 변수를 선언하는 것이다. 이제부터 scanner 변수를 통해서 scanner 를 사용할 수 있다.

// scanner.nextLine()
// - 엔터(\n)를 입력할 때 까지 문자를 가져온다.
// scanner.nextInt()
// - 입력을 int 형으로 가져온다. 정수 입력에 사용한다.
// scanner.nextDouble()
// - 입력을 double 형으로 가져온다. 실수 입력에 사용한다.

// 주의! - 다른 타입 입력시 오류
// 타입이 다르면 오류가 발생한다. 예제와 같이 숫자에 문자를 입력하면 오류가 발생한다.
