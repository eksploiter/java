// 변수 타입 1
// 변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재한다.

package javaStart.variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 불리언(boolean) true, false 입력 가능
        char d = 'A'; // 문자 하나
        String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

// 변수 타입의 예
// int: 정수를 다룬다. 예) 1, 100, 1000
// double: 실수를 다룬다. 예) 0.2, 1.5, 100.21
// boolean: 불리언 타입이라 한다. ture, false 값만 사용할 수 있다. 주로 참과 거짓을 판단하는 곳에서 사용한다.
// char: 문자 하나를 다룰 때 사용한다. 작은 따옴표(')를 사용해서 감싸야한다. 예) 'A', '가'
// String: 문자열을 다룬다. 큰 따옴표를 사용해야한다. 예) "hello java"

// 참고
// String 은 첫 글자가 대문자로 시작하는 특별한 타입이다. 이 부분은 뒤에 클래스를 배워야 자세히 이해할 수 있다.
// 지금은 문자열을 다루는 특별한 타입이라고 이해하면 된다. String 에 대한 자세한 내용은 별도로 다룬다.

// 리터럴
// 코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java" 와 같은 고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.
// 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.

// 참고
// 리터럴(literal)이라는 단어의 어원은 문자 또는 글자를 의미한다.
