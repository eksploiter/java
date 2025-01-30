// 스택 영역
// 다음 코드를 실행하면 스탣 영역에서 어떤 변화가 있는지 확인해보자.

package javaBasic.memory;

public class JavaMemoryMain {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}

// 정리
// - 자바는 스택 영역을 사용해서 메서드 호출과 지역변수(매개변수 포함)를 관리한다,
// - 메서드를 계속 호출하면 스택 프레임이 계속 쌓인다.
// - 지역변수(매개변수 포함)는 스택 영역에서 관리한다.
// - 스택 프레임이 종료되면 지역 변수도 함께 제거된다.
// - 스택 프레임이 모두 제거되면 프로그램도 종료된다.
