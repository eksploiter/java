// return 문을 만나면 그 즉시 메서드를 빠져나간다.

// 다음 로직을 수행하는 메서드를 만들어보자.
// - 18세 미만의 경우: 미성년자는 출입이 불가합니다,
// - 18세 이상의 경우: 입장하세요.

package javaStart.method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가합니다.");
            return; // 반환값이 없으므로 그냥 return 만 있다.
            // return 문을 만나면 그 즉시 메서드를 빠져나간다. 더이상 밑으로 안 내려간다.
        }

        System.out.println(age + "살, 입장하세요."); // (else)
    }
}

// - 18세 미만의 경우 "미성년자는 출입이 불가합니다."를 출력하고 바로 return 문이 수행된다.
// 따라서 다음 로직을 수행하지 않고, 해당 메서드를 빠져나온다.
// - 18세 이상의 경우 "입장하세요."를 출력하고, 메서드가 종료된다.
// 참고로 반환 타입이 없는 void 형익 때문에 마지막 줄의 return 은 생략할 수 있다.

// 반환 값 무시
// 반환 타입이 있는 메서드를 호출했는데 만약 반환 값이 필요없다면 사용하지 않아도 된다.
// 예시1: int sum = add(1, 2) // 반환된 값을 받아서 sum 에 저장했다.
// 예시2: add(1, 2) // 반환된 값을 사용하지 않고 버린다. 여기서는 예시 1과 같이 호출 결과를 변수에 담지 않았다.
// 단순히 메서드만 호출했다.
// 만약 void 일 경우에는 반환 값 무시가 안된다. 받으면 안된다.
