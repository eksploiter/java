// 문제: 자연수 출력
// 처음 10 갸의 자연수를 출력하는 프로그램을 작성해보세요.
// 이때, count 라는 변수를 사용해야 합니다.
// while 문, for 문 2가지 버전의 정답을 만들어야 합니다.

package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int i = 1;
        int count = 10;

        while (i <= count) {
            System.out.println(i);
            i++;
        }
    }
}

// 김영한 쌤의 풀이
//public class WhileEx1 {
//    public static void main(String[] args) {
//        int count = 1;
//
//        while (count <= 10) {
//            System.out.println(count); // 후위 증감 연산 사용해도 된다. -> System.out.println(count++);
//            count++;
//        }
//    }
//}
