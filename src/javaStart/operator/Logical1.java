// 논리 연산자
// 논리 연산자는 boolean 형인 true, false 를 비교하는데 사용한다.

// - &&(and): 두 피연산자가 모두 참이면 참을 반환, 둘 중 하나라도 거짓이면 거짓을 반환
// - ||(or): 두 피연산자중 하나라도 참이면 참을 반환, 둘 다 거짓이면 거짓을 반환
// - !(not): 피연산자의 논리적 부정을 반환. 즉, 참이면 거짓을, 거짓이면 참을 반환

package javaStart.operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        System.out.println("||: OR 연산");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        System.out.println("! 연산");
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // true
    }
}
