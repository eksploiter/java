// 2차원 배열 - 리팩토링1
// 구조 개선 - 행 출력 반복
// ArrayDi0의 코드를 보면 비슷한 부분이 반복된다.
// 코드를 보면 행을 출력하는 부분이 거의 같다. 차이가 있는 부분은 행에서 arr[0]으로 시작할지 arr[1]로 시작할지의 차이다.

// 반복문을 사용하도록 코드를 변경해보자

package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i][0] + " ");
            System.out.print(arr[i][1] + " ");
            System.out.print(arr[i][2] + " ");
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
    }
}

// for 문을 통해서 행(row)을 반복해서 접근한다. 각 행 안에서 열(column)이 3개 이므로 arr[i][0], arr[i][1], arr[i][2] 3번 출력한다.
// 이렇게하면 for 문을 한 번 조는 동안 3개의 열을 출력할 수 있다.
