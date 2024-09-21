// 변수 초가화
// 변수를 선언하고, 선언한 젼수에 처음으로 값을 저장하는 것을 변수 초기화라 한다.

package javaStart.variable;

public class Var5 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초가화 각각 따로
        int a;
        a = 1;
        System.out.println(a);

        // 2. 변수 선언과 초기화를 한번에
        int b = 2;
        System.out.println(b);

        // 3. 여러 변수 선언과 초기화를 한번에
        int c = 3, d = 4;
        System.out.println(c);
        System.out.println(d);
    }
}
