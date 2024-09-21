// 메서드 호출과 값 복사
// 다음은 숫자를 2배 곱하는 메서드이다. 다음 코드를 보고 어떤 결과가 나올지 먼저 생각해보자.

package Start.method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }
}

// 실행 결과를 먼저 예측해보고 그 다음에 실행 결과를 확인해보자.
// 혹시라도 실행 결과의 마지막이 10이라고 생각했다면 대원칙을 떠올려보자.

// 실행 결과
// 1. changeNumber 호출 전, num1: 5
// 2. changeNumber 변경 전, num2: 5
// 3. changeNumber 변경 후, num2: 10
// 4. changeNumber 호출 후, num1: 5

// 다음 대원칙을 따라간다면 문제를 정확하게 풀 수 있다.
// 자바는 항상 변수의 값을 복사해서 대입한다.

// changeNumber(num1) 호출 시점
// - num1의 값 5를 일고 복사해서 num2에 전달 -> 이 부분이 핵심

// changeNumber 메서드 실행 중
// - num2의 변경은 num1에 영향을 주지 않는다. 왜냐하면 앞서 값을 복사해서 전달했기 때문이다.

// 결과적으로 매개변수 num2의 값만 10으로 변경되고 num1의 값은 변경되지 않고 기존 값인 5로 유지된다.
// 자바는 항상 값을 복사해서 전달하기 때문에 num2의 값을 바꾸더라도 num1에는 영향을 주지 않는다.