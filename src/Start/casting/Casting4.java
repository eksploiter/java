// 계산과 형변환
// 형변환은 대입 뿐만 아닐, 계산을 할 때도 발생한다.

package Start.casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2; // 명시적 형변환
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}

// 자바에서 계산은 다음 2가지를 기억하자
// 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
// - int + int 는 int 를, double + double 은 double 의 결과가 나온다.
// 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
// - int + long 은 long + long 으로 자동 형변환이 일어난다.
// - int + double 은 double + double 로 자동 형변환이 일어난다.

// 다양한 타입별로 더 자세히 들어가면 약간 차이가 있지만 이 기준으로 이해하면 충분하다.
