// 문제 - 평균값 리팩토링
// 메서드를 잘 이해하고 있는지 확인하기 위해 다음 코드를 메서드를 사용하도록 리팩토링 해보자

package javaStart.method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);

        int x = 15;
        int y = 25;
        int z = 35;

        sum = x + y + z;
        average = sum / 3.0;
        System.out.println("평균가뵤: " + average);
    }
}
