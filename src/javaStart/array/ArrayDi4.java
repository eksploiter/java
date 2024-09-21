// 구조 개선 - 값 입력
// 이번에는 배열에 직접 1, 2, 3 숫자를 적어서 값을 할당하는 것이 아니라,
// 배열의 크기와 상관없이 배열에 순서대로 1씩 증가하는 값을 입력하도록 변경해보자.

package javaStart.array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];

        int i = 1;
        // 순서대로 1씩 증가하는 값을 입력한다.
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

// - 중첩된 for 문을 사용해서 값을 순서대로 입력한다.
// - arr[row][column] = i++ 후의 증감 연산자(++)를 사용해서 값을 먼저 대입한 다음에 증가한다.
//      - 코드에서 int i = 1으로 i가 1부터 시작한다.

// 2차원 배열 선언 부분인 new int[2][3]을 new int[4][5] 처럼 다른 숫자로 변경해도 잘 동작하는 것을 확인할 수 있다.
