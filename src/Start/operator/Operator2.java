// 문자열 더하기
// 자바는 특별하게도 문자열에고 + 연산자를 사용할 수 있다. 문자열에 + 연산자를 사용하면 주 문자를 연결할 수 있다.

package Start.operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기 2
        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1
        String result3 = "a + b = " + 10; // 자바가 문자랑 더하는 다른 것은 문자로 바꾼다. (10 -> "10")
        System.out.println(result3);

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}

// 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다. 쉽게 이야기 해서 문자열에 더하는 것은 다 문자열이 된다.
