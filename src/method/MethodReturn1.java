// 반환 타입
// 빈환타입이 있으면 반드시 값을 반환해야한다.
// 반환 타입이 있는 메서드는 반드시 return 을 사용해서 값을 반환해야 한다.
// 이 부분은 특히 조건문과 함께 사용할 때 주의해야한다.

package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        // boolean 의 값 참, 거짓을 무조건 반환해주어야 한다.
        if (i % 2 == 1) {
            // 홀수이면 true 를 반환한다.
            return true;
        }
        return false;
    }
}

// return false 가 누락된 상황
// 이 코드에서 if 조건이 만족할 때는 true 가 반환되지만, 조건을 만족하지 않으면 어떻게 될까?
// 조건을 만족하지 않은 경우에는 return 문이 실행되지 않는다.
// 따라서 이 코드를 실행하면 return 문을 누락했다는 다음과 같은 컴파일 오류가 발생한다.
