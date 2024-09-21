package Start.loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
                break;
            }
        }
    }
}

// 정리하면 for 문 없이 while 문으로 모든 반복을 다룰 수 있다.
// 하지만 카운터 변수가 명확하거나, 반복 횟수사 정해진 경우에는 for 문을 사용하는 것이 구조적으로 더 깔끔하고, 유지보수 하기 좋다.

// 참고
// for 문을 좀 더 편리하게 사용하도록 도와주는 향상된 for 문 또는 for-each 문으로 불리는 반복문도 있다.
// 이 부분은 뒤에서 설명한다.
