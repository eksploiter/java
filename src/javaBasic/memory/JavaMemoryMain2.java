// 스택과 힙 영역
// 이번에는 스택 영역과 힙 영역이 함께 사용되는 경우를 알아보자.

package javaBasic.memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1); // 참조값
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}

// - method1()이 종료된 직후의 상태를 보자. method1()의 스택 프레임이 제거되고 지역변수 data1도 함께 제거되었다.
// - 이제 x001 참조값을 가진 Data 인스턴스를 참고하는 곳이 더는 없다.
// - 참조하는 곳이 없으므로 사용되는 곳도 없다. 결과적으로 프로그램에서 더는 사용하지 않는 객체인 것이다.
//   이런 객체는 메모리만 차지하게 된다.
// - GC(가비지 컬렉션)은 이렇게 참조가 모두 사라진 인스턴스를 찾아서 메모리에 제거한다.

// 정리
// 지역 변수는 스택 영역에, 객체(인스턴스)는 힙 영역에 관리되는 것을 확인했다. 이제 나머지 하나가 남았다.
// 바로 메서드 영역이다. 메서드 영역이 관리하는 변수도 있다. 이것을 이해하기 위해서는 먼저 static 키워드를 알아야 한다.
// static 키워드와 밀접한 연관이 있다.

