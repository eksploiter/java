package Start;

public class HelloJava { // Start.HelloJava 클래스의 범위 시작
    public static void main(String[] args) { // main() 메서드의 범위 시작
        System.out.println("hello java");
    } // main() 메서드의 범위 끝
} // Start.HelloJava 클래스의 범위 끝

// 주의
// 자바 언어는 대소문자를 구분한다. 대소문자가 다르면 오류가 발생할 수 있다.

// 실행 결과
// -> hello java

// 코드를 분석해보자

// public class Start.HelloJava
// - Start.HelloJava 를 클래스라 한다. 클래스(class) 의 개념을 학습해야 이해할 수 있다. 클래스는 뒤에 학습한다.
// - 지금은 단순히 Start.HelloJava.java 라는 파일을 만들었다고 이해하면 된다.
// - 파일명과 클래스 이름이 같아야 한다.
// - { } 블록을 사용해서 클래스의 시작과 끝을 나타낸다.

// public static void main(String[] args)
// - main 메서드라 한다. 함수, 메서드의 개념을 학습해야 이해할 수 있다. 함수, 메서드는 뒤에서 학습한다.
// - 자바는 main(String[] args) 메서드를 찾아서 프로그램을 시작한다.
// - 지금은 단순히 main 은 프로그램의 시작점이라고 이해하면 된다.
// - { } 블록을 사용해서 메서드의 시작과 끝을 나타낸다.

// System.out.println("hello java");
// - System.out.println(): 값을 콘솔에 출력하는 기능이다.
// - "hello java": 자바는 문자열을 나열할 때 "" (쌍따옴표)를 사용한다. 쌍따옴표 사이에 문자열을 감싸면 된다.
// - ;: 자바는 세미콜론으로 문장을 구분한다.문장이 끝나면 세미콜론은 필수로 넣어주어야한다.

// 참고: 괄호
// - 소괄호 ()
// - 중괄호 {}
// - 대괄호 []

// 실행과정
// 1. Start.HelloJava 프로그램을 실행한다.
// 2. 자바는 시작점인 main() 메서드를 실행한다.
// 3. System.out.println("hello java") 를 만나고, 문자열 hello java 을 출력한다.
// 4. main() 메서드의 {} 블록이 끝나면 프로그램은 종료된다.

// 블록(block) 예시
// - 블록{}이 시작되고 끝날 때 마다 들여쓰기가 적용되어 있는 것을 확인할 수 있다. 이것은 코드를 쉽게 구분하고 이해하도록 도와주는 좋은 관례이다. 블록이 중첩될 때 마다 들여쓰기의 깊이가 추가된다.
// - 들여쓰기는 보통 스페이스 4번을 사용한다. 참고로 인텔리제이를 사용하면 키보드 Tab 을 한 번 누르면 자동으로 스페이스 4번을 적용한다.
// - 참고로 들여쓰기를 하지 않아도 프로그램은 작동한다. 하지만 크드를 읽기에 좋지 않다.
