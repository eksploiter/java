// 다양한 예제를 통해서 메서드 오버로딩을 알아보자
// 먼저 매개변수의 갯수가 다른 오버로딩 예제를 보자.

package javaStart.method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

//    public static int add(int c, int d) { // 변수명 다르다고 되는 거 아니다.
//        System.out.println("n번 호출");
//        return c + c;
//    }

    // 두 번때 add 메서드: 세 정수를 받아서 합을 반환한다.
    public static int add(int a, int b, int c) {
        System.out.println("2번 호춯");
        return a + b + c;
    }
}

// 1: 정수 1, 2를 호출했으므로 add(int a, int b)가 호출된다.
// 2: 정수 1, 2, 3을 호출했으므로 add(int a, int b, int c)가 호출된다.
