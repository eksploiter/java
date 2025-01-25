/// 클래스와 메서드
// 클래스는 데이터인 멤버 변수 뿐 아니라 기능 역할을 하는 메서드도 포함할 수 있다.
// 먼저 멤버 변수만 존재하는 클래스로 간단한 코드를 작성해보자.

package javaBasic.oop1;

public class ValueDataMain {

    public static void main(String[] args) {

        ValueData vd = new ValueData();
        add(vd);
        add(vd);
        add(vd);
        System.out.println("최종 숫자 = " + vd.value);
    }

    static void add(ValueData vd) {
        vd.value++;
        System.out.println("숫자 증가 value = " + vd.value);
    }
}

// valueData 라는 인스턴스를 생성하고 외부에서 ValueData.value 에 접근해 숫자를 하나씩 증가시키는 단순한 코드이다.
// 코드를 보면 데이터인  value 와 value 의 값을 증가시키는 기능인 add() 메서드가 서로 분리되어 있다.

// 자바 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 표함할 수 있다.
// 클래스 내부에 멤버 변수 뿐만 아니라 메서드도 함께 포함할 수 있다는 뜻이다.

// 이번에는 숫자를 증가시키는 키능도 클래스에 함께 포함해서 새로운 클래스를 정의해보자.
