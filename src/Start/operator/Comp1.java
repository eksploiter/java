// 비교 연산자
// 비교 연산자는 두 값을 비교하는데 사용한다. 비교 연산자는 줄 뒤에서 설명하는 조건문과 함께 사용한다.
// 비교 연산자를 사용하면 참(true) 또는 거짓(false)이라는 결과가 나온다. 참 거짓은 boolean 형을 사용한다.

// 주의
// =: 대입 연산자, 변수에 값을 대입한다.
// ==: 동등한지 확인하는 비교 연산자
// 불일치 연산자는 != 를 사용한다. !는 반대라는 뜻이다.

package Start.operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 boolean 변수에 담기
        boolean result = a == b; // a == b: false
        System.out.println(result); // false
    }
}
