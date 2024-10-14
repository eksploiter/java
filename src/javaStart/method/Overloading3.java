// 마지막으로 매개변수의 타입이 다를 경우를 추가로 확인해보자.

package javaStart.method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // 두 번째 add 메서드: 두 실수를 받아서 합을 반환한다.
    // 첫 번째 메서드와 이름이 같지만, 매개변수 유형이 다르다.
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}

// 1: 정수1, 정수2를 호출했으므로 add(int a, int b)가 호출된다.
// 2: 실수 1.2, 실수 1.5를 호출했으므로 add(double a, double b)가 호출된다.

// 여기서 만약 다음의 첫 메서드를 삭제하면 어떻게 될까?
// public static int add(int a, int b)
//     System.out.println("1번 호출");
//     return a + b:
// }

// 1: int 형 정수1, int 형 정수2를 호출했으므로 자동 형변환이 발생해서 add(double a, double b)가 호출된다.
// 2: 실수 1.2, 실수 1.5를 호출했으므로 add(double a, double b)가 호출된다.

// 정리하면 먼저 본인의 타입에 맞는 메서드를 찾아서 실행하고, 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행한다.
