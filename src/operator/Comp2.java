// 문자열 비교
// 문자열이 같은지 비교할 때는 == 이 아니라 .equals() 메서드를 사용해야 한다.
// ==를 사용하면 성공할 때도 있지만 실패할 때도 있다. 지금은 이 부분을 이해하기 어려우므로 지금은 단순히 문자열 비교는
// .equals() 메서드를 사용해야 한다 정도로 알고 있자.

package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}

// 단축키: Ctrl + Shift + Enter -> 문장 자동 완성
