// 구조개선 - 열 출력 반복
// 다음 부분을 보면 같은 코드가 반복된다.
//System.out.print(arr[i][0] + " ");
//System.out.print(arr[i][1] + " ");
//System.out.print(arr[i][2] + " ");

// 다음과 같이 열(column)에 들어가는 숫자만 하나씩 증가하면서 반복하면 될 것 같다.

package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

// for 문을 2번 충첩해서 사용하는데, 첫번째 for 문은 행을 탐색하고, 내부에 있는 두번째 for 문은 열을 탐색한다.
// 내부에 있는 for 문은 앞서 작성한 다음 코드와 같다. for 문을 사용해서 열을 효과적으로 출력했다.
