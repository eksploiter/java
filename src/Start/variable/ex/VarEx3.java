// 문제3 - long, boolean 데이터 타입
// long 타입의 변수를 선언하고, 그 변수를 백억으로 초기화한 후 출력하는 프로그램을 작성하세요.
// boolean 타입의 변수를 선언하고, 그 변수를 true 로 초기화한 후 출력하는 프로그램을 작성하세요.

package Start.variable.ex;

public class VarEx3 {
    public static void main(String[] args) {
        long longVar = 10000000000L; // 리터럴은 기본이 int 형이기 때문에 값 뒤에 L을 붙인다.
        System.out.println(longVar); // sout + v 단축키

        boolean booleanVar = true;
        System.out.println(booleanVar);
    }
}
