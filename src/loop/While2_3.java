package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        sum = sum + i;
        System.out.println("i = " + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println("i = " + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println("i = " + " sum = " + sum);
        i++;
    }
}

// i = 1, endNum = 3 이므로 다음 코드를 3번 반복해야 한다.
// 그런데 i = 1, endNum = 10 와 같이 변경라면 이 코드를 10번 반복해야한다. 따라서 같은 코드를 더 많이 추가해야 한다.
// 이 문제를 제대로 풀기 위해서는 코드가 실행되는 횟수를 유연하게 변경할 수 있어야한다. 한마디로 같은 코드를 반복 실행할 수 있어야 한다.

// while 문을 사용하면 원하는 횟수 만큼 같은 코드를 반복 실행할 수 있다.
