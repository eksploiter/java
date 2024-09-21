// continue
// 문제: 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.

package Start.loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

// i == 3인 경우 i를 하나 증가하고 continue 를 실행한다.
// 따라서 이 경우에는 i를 출력하지 않고 바로 while (i <= 5) 조건식으로 이동한다.
