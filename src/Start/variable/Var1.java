package Start.variable;

public class Var1 {

    public static void main(String[] args) {
        System.out.println(20); // 변경 10 -> 20
        System.out.println(20); // 변경 10 -> 20
        System.out.println(20); // 변경 10 -> 20
    }
}

// 패키지(package)
// - 이번에는 처음으로 패키지를 만든다.
// - 패키지는 지금 단계에서는 자바 파일을 구분하기 위한 폴더로 이해하면 된다.
// - Start.variable 이라는 패키지를 만들었다면, 해당 패키지에 들어가는 자바 파일 첫 줄에 package Start.variable; 와 같이 소속된 패키지를 선언해주어야한다.
// - 자바 파일이 위치하는 패키지와 package Start.variable 선언 위치가 같아야한다.

// 단순히 숫자 10을 3번 출력하는 코드이다. 그런데 여기서 숫자 10을 3번 출력하는 대신에 숫자 20을 3번 출력하도록 코드를 변경해 보자. 어떻게 해야할까?

// 어딘가에 값을 보관해두고 필요할 때 값을 꺼내서 읽을 수 있는 저장소가 필요하다. 쉽게 비유하자면 데이터를 담을 수 있는 그릇이 필요하다.
// 모든 프로그래밍 언어는 이런 문제를 해결하기 위해 변수(Start.variable) 이라는 기능을 제공한다.
// 변수는 이름 그대로 변할 수 있다는 뜻이다.