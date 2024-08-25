package loop;

public class While2_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // 스코프 관점으로 볼 때 비효율적이다. 그래서 for 문을 사용한다. (For2)
        int endNum = 10;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
