// 대입 연산자
// 대입 연산자(=)는 값을 변수에 할당하는 연산자이다. 이 연산자를 사용하면 변수에 값을 할당할 수 있다.

// 축약(복합) 대입 연산자
// 산술 연산자와 대입 연산자를 한번에 축약해서 사용할 수 있는데, 이것을 축약(복합) 대입 연산자라 한다.
// 연산자 종류: +=, -=, *=, /=, %=

// ex) i = i + 3 -> i += 3

package javaStart.operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;  // a = 5
        a += 3;     // 8, (5 + 3): a = a + 3
        a -= 2;     // 6, (8 - 2): a = a - 2
        a *= 4;     // 24, (6 * 4): a = a * 4
        a /= 3;     // 8, (24 / 3): a = a / 3
        a %= 5;     // 3, (8 % 5): a = a % 5
        System.out.println(a);
    }
}
