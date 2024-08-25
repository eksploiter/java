//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

// 자바 언어의 관례 한번에 정리

// 클래스는 대문자로 시작, 나머지는 소문자로 시작

// - 자바에서 클래스 이름의 첫 글자는 대문자로 시작한다. 그라고 나머지는 모두 첫 글자를 소문자로 시작한다. 여기에 낙타 표기법을 적용하면 된다.
// 이렇게 하면 모든 자바 관례를 다 외울 수 있다!
// - 예시: 클래스는 첫 글자 대문자, 나머지는 모두 첫 글자 소문자로 시작 + 낙타 표기법
//      - 클래스: Person, OrderDetail
//      - 변수를 포함한 나머지: firstName, userAccount
// - 여기에 예외가 딱 두 가지 있다.
//      - 상수는 모두 대문자를 사용하고 언더바로 구분한다.(상수는 뒤에서 학습)
//          - USER_LIMIT
//      - 패키지는 모두 소문자를 사용한다. (패키지는 뒤에서 학습)
//          - org.spring.boot

// 참고
// 변수의 이름은 의미있고, 그 용도를 명확하게 설명해야 한다.
// - a, b: 이런 변수는 용도를 설명하지 않는다. 단순한 예제에서만 사용하는 것이 좋다.
// - studentCount, maxScore, userAccount, orderCount: 용도를 명확하게 설명한다.