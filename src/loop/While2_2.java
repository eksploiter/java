// 다음과 같이 요구사항이 변경되었다.
// 문제: 10부터 하나씩 증가하는 수를 3번 더해라 (10 ~ 12 더하기)
// 이렇게 되면 10 + 11 + 12를 계산해야 한다. 문제는 코드를 너무 많이 변경해야 한다는 점이다.

// 변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자. 변경되는 부분을 변수 i로 바꿔보자

package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 10;

        sum = sum + i; // sum(0) + i(1) -> sum(1)
        System.out.println("i = " + i + " sum = " + sum);
        i++; // i = 2

        sum = sum + i; // sum(1) + i(2) -> sum(3)
        System.out.println("i = " + i + " sum = " + sum);
        i++; // i = 3

        sum = sum + i; // sum(3) + i(3) -> sum(6)
        System.out.println("i = " + i + " sum = " + sum);
    }
}

// 좋은 코드인지 아닌지는 변경 사항이 발생했을 때 알 수 있다. 변경 사항이 발생했을 때 변경해야하는 부분이 적을 수록 좋은 코드이다.
