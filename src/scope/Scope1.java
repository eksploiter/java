// 스코프1 - 지역 변수와 스코프
// 변수는 선언한 위치에 따라 지역 변수, 멤버 변수(클래스 변수, 인스턴스 변수)와 같이 분류된다.
// 우리가 지금까지 학습한 변수들은 모두 영어로 로컬 변수(Local Variable) 한글로 지역 변수라 한다.
// 나머지 변수들은 뒤에서 학습한다 지금은 지역 변수만 기억하자.

// 지역 변수는 이름 그대로 특정 지역에서만 사용할 수 있는 변수라는 뜻이다. 그 특정 지역을 벗어나면 사용할 수 없다.
// 여기서 말하는 지역이 바로 변수가 선언된 블록 {}이다. 지역 변수는 자신이 선언된 크드 블록 {} 안에서만 생존하고,
// 자신이 선언된 코드 블록을 벗어나면 제거된다. 따라서 이후에는 접근할 수 없다.

// 예제 코드로 확인해보자

package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x = " + x);
        } // x 생존 종료

        // System.out,println("main x = " + x); // 오류, 변수 x에 접근 불가
        System.out.println("main m " + m);
    } // m 생존 종료
}

// int m
// - int m은 main{} 의 크드 블록 안에서 선언되었다. 따라서 변수를 선언한 시점부터 main{} 의 코드 블록이 종료될 때 까지 생존한다.
// - if{} 블록 내부에서도 외부 블록에서 선언된 m에 접근할 수 있다. 쉽게 이야기해서 생존 범위만 맞으면 다 접근할 수 있다.

// int x
// - int x는 if{} 블록 안에서 선언되었다. 따라서 변수를 선언한 시점부터 if{}의 코드 블록이 종료될 때 까지 생존한다.
// - if{} 내부에서는 자신의 범위에서 선언한 x에 당연히 접근할 수 있다.
// - if{} 코드 블록이 끝나버리면 x는 제거된다. 따라서 더는 x에 접근할 수 없다. 따라서 이후에 접근하면
// cannot find symbol 이라는 변수 이름을 찾을 수 없다는 컴파일 오류가 발생한다.

// 정리하면 지역 변수는 본인의 코드 블록 안에서만 생존한다.
// 그리고 지신의 코드 블록 안에서는 얼마든지 접근할 수 있다.
// 하지만 자신의 코드 블록을 벗어나면 제거되기 때문에 접근할 수 없다.