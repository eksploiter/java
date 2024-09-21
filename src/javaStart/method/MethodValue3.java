// 메서드 호출과 값 받아오기
// 그렇다면 메서드를 사용해서 값을 변경하려면 어떻게 해야할까?
// 메서드의 호출 결과를 반환 받아서 사용하면 된다.

package javaStart.method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}

// 실행 결과
// changeNumber 호출 전, num1: 5
// changeNumber 호출 후, num1: 10

// 정리
// 꼭 기억하자! 자바는 항상 변수의 값을 복사해서 대입한다.
// (참고로 뒤에서 참조형이라는 것을 학습하는데, 이때도 똑같다. 결국 참조형 변수에 있는 값인 참조값을 복사하는 것이다! 이것은 나중에 알아본다.)
